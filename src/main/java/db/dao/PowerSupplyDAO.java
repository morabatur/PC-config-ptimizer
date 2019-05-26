package db.dao;

import db.config.DatabaseConnector;
import db.pojo.PowerSupply;
import db.pojo.Videocards;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PowerSupplyDAO {

    public List<PowerSupply> selectPowerSupplys() throws SQLException {

        Connection con = new DatabaseConnector().conect();
        Statement stmt = null;
        ResultSet rs = null;


        List<PowerSupply> powerSupplyList = new ArrayList<>();


        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from PowerSupply");


            while (rs.next()) {
                PowerSupply powerSupplyPojo = new PowerSupply();

                powerSupplyPojo.setId(rs.getLong(1));
                powerSupplyPojo.setName(rs.getString(2));
                powerSupplyPojo.setPower(rs.getLong(3));
                powerSupplyPojo.setPrice(rs.getLong(4));


                powerSupplyList.add(powerSupplyPojo);
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

        return powerSupplyList;

    }


}
