package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conector {
    private static final String url = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String user = "root";
    private static final String password = "diogo123";
    private static Connection con;
    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(url, user, password);
            } else {
                return con;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

}
