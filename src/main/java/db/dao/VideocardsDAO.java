package db.dao;

import db.config.DatabaseConnector;
import db.pojo.Videocards;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VideocardsDAO {


    public List<Videocards> selectVideocards(int graphics_core_frequency, int video_memory_size, int memory_bus_capacity,
                                             int video_memory_operating_frequency) throws SQLException {

        Connection con= new DatabaseConnector().conect();
        PreparedStatement stmt = null;
        ResultSet rs = null;


        List<Videocards> videocardsList = new ArrayList<>();


        try {
            stmt = con.prepareStatement("select * from Videocards " +
                    "WHERE graphics_core_frequency >= ? " +
                    "AND video_memory_size >= ? " +
                    "AND memory_bus_capacity >= ? " +
                    "AND video_memory_operating_frequency >= ?");

            stmt.setInt(1, graphics_core_frequency);
            stmt.setInt(2, video_memory_size);
            stmt.setInt(3, memory_bus_capacity);
            stmt.setInt(4, video_memory_operating_frequency);

            rs = stmt.executeQuery();


            while (rs.next()) {
                Videocards videocardsPojo = new Videocards();

                videocardsPojo.setId(rs.getLong(1));
                videocardsPojo.setName(rs.getString(2));
                videocardsPojo.setGraphicsCoreFrequency(rs.getLong(3));
                videocardsPojo.setVideoMemory_Size(rs.getLong(4));
                videocardsPojo.setMemoryBusCapacity(rs.getLong(5));
                videocardsPojo.setVideoMemoryOperatingFrequency(rs.getLong(6));
                videocardsPojo.setPowerUsage(rs.getLong(7));
                videocardsPojo.setPrice(rs.getLong(8));

                videocardsList.add(videocardsPojo);
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

        return videocardsList;

    }

}
