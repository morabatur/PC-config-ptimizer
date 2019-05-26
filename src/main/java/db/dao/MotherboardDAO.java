package db.dao;

import db.config.DatabaseConnector;
import db.pojo.Motherboard;
import db.pojo.PowerSupply;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MotherboardDAO {

    public List<Motherboard> selectMotherBoards() throws SQLException {

        Connection con = new DatabaseConnector().conect();
        Statement stmt = null;
        ResultSet rs = null;


        List<Motherboard> motherboardList = new ArrayList<>();


        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from Motherboard");


            while (rs.next()) {
                Motherboard motherboardPojo = new Motherboard();

                motherboardPojo.setId(rs.getLong(1));
                motherboardPojo.setName(rs.getString(2));
                motherboardPojo.setFormFactor(rs.getString(3));
                motherboardPojo.setRamSlots(rs.getLong(4));
                motherboardPojo.setPrice(rs.getLong(5));


                motherboardList.add(motherboardPojo);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                rs.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return motherboardList;

    }


}
