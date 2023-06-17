package co.edu.sena.project2687350.util;

import java.sql.*;
public class BasicConnectionSingleton {
    private static String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Bogota";
    private static String user = "nicolas1";
    private static String pass = "2n0i0c6o";
    private static Connection  conn;

    public static Connection getInstace()
        throws SQLException{
        if (conn == null){
            conn =DriverManager.getConnection(url,user,pass);

        }
        return conn;
    }
}
