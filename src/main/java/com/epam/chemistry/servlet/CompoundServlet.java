package com.epam.chemistry.servlet;

import com.epam.chemistry.dao.CompoundDao;
import com.epam.chemistry.dao.SQLConnection;
import com.epam.chemistry.manager.CompoundManager;
import com.epam.chemistry.model.Compound;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by мвидео on 06.09.2016.
 */
public class CompoundServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        this.process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {

        CompoundManager compoundManager = new CompoundManager();
        Compound compound = (Compound)request.getAttribute("newCompound");
       // compoundManager.addCompound(compound);
        response.setStatus(200);
        response.getWriter().write("<html>\n" +
                "<body>\n" +
                "<h2>Compound" + compound.getName() + "added successfully</h2>\n" +
                "</body>\n" +
                "</html>");
    }
}
