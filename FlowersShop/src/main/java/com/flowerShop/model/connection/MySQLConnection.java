package com.flowerShop.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Created by Vasyl_Voloshyn on 5/23/2017.
 */
public class MySQLConnection {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection(){
    	
    	String driver = "com.mysql.jdbc.Driver";
        if (driver != null) {
            try {
                Class.forName(driver);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    	
        if (connection == null){
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
    }
}
