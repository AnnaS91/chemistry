package com.epam.chemistry.dao;

import com.epam.chemistry.model.Compound;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by мвидео on 03.09.2016.
 */
public class CompoundDaoTest {

    CompoundDao compoundDao;
    Connection connection;

    @Before
    public void setUp() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        connection = SQLConnection.getInstance().getConnection();
        compoundDao = new CompoundDao(connection);
        Compound compound = new Compound("aspirin", 1);
        compoundDao.addCompound(compound);
    }

    @After
    public void close() throws SQLException {
        connection.close();
    }

    @Test
    @Ignore
    public void addCompoundTest(){

    }

    @Test
    @Ignore
    public void getAllTest(){
        List<Compound> compounds = compoundDao.getAll();
        assertEquals(1, compounds.size());
    }
}
