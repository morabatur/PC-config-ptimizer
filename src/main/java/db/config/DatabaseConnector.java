package db.config;

import java.sql.*;


/**
 * Клас-конектор для з'єднання з БД
 */
public class DatabaseConnector {


    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://nulesoptimizer.kl.com.ua:3306/r_chernish?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "romanroot";
    private static final String password = "Zibenaht123";

    // JDBC variables for opening and managing connection
    private static Connection con;


    /**
     * Метод дозволяє встановити з'єднання з базою даних
     *
     * @return Connection
     */

    public Connection conect() {
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return con;

    }
}

