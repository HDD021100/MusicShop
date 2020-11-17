/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NguyenDang
 */
public class DBConnect {
    private static String DB_URL = "jdbc:mysql://localhost:3306/musicshop";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";
    
     public static Connection getConnecttion() {
        Connection cons = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }
 
    public static void main(String[] args) {
        System.out.println(getConnecttion());
    }
    
}
