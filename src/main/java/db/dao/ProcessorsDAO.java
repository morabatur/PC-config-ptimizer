package db.dao;

import db.config.DatabaseConnector;
import db.pojo.Processors;
import db.pojo.Processors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProcessorsDAO {


    public List<Processors> selectVideocards(int clock_frequency, int capacity, int cache_memory, int core) throws SQLException {

        Connection con= new DatabaseConnector().conect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Processors> processorsList = new ArrayList<>();


        try {
            stmt = con.prepareStatement("select * from Processors " +
                    "WHERE clock_frequency >= ? " +
                    "AND capacity >= ? " +
                    "AND cache_memory >= ? " +
                    "AND core >= ?");

            stmt.setInt(1, clock_frequency);
            stmt.setInt(2, capacity);
            stmt.setInt(3, cache_memory);
            stmt.setInt(4, core);

            rs = stmt.executeQuery();


            while (rs.next()) {
                Processors processorsPojo = new Processors();

                processorsPojo.setId(rs.getLong(1));
                processorsPojo.setName(rs.getString(2));
                processorsPojo.setClockFrequency(rs.getLong(3));
                processorsPojo.setCapacity(rs.getLong(4));
                processorsPojo.setCacheMemory(rs.getLong(5));
                processorsPojo.setCore(rs.getLong(6));
                processorsPojo.setPrice(rs.getLong(7));
                processorsPojo.setPowerUsage(rs.getLong(8));


                processorsList.add(processorsPojo);
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

        return processorsList;

    }

}
