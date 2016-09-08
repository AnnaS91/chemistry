package com.epam.chemistry.manager;

import com.epam.chemistry.dao.CompoundDao;
import com.epam.chemistry.dao.SQLConnection;
import com.epam.chemistry.model.Compound;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by мвидео on 08.09.2016.
 */
public class CompoundManager {

    CompoundDao compoundDao;

    public CompoundManager(){
        SQLConnection connection = SQLConnection.getInstance();
        try {
            compoundDao = new CompoundDao(connection.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public void addCompound(Compound compound){
        compoundDao.addCompound(compound);
    }
}
