package com.epam.chemistry.dao;

import com.epam.chemistry.model.Compound;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by мвидео on 03.09.2016.
 */
public class CompoundDao {

    private Connection connection;

    public CompoundDao(Connection connection) {
        this.connection = connection;
    }

    public boolean addCompound(final Compound compound) {
        int updated = 0;
        String query = "INSERT INTO chemistry.compound (name,type_id) VALUES (?,?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, compound.getName());
            statement.setInt(2, compound.getType());
            updated = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updated == 1;
    }

    public List<Compound> getAll() {
        String query = "SELECT * FROM chemistry.compound";
        List<Compound> compounds = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {
            while (rs.next()) {
                compounds.add(new Compound(rs.getLong("id"), rs.getString("name"),
                        rs.getInt("weight"), rs.getInt("type_id")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return compounds;
    }
}
