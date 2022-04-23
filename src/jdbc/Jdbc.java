/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ardya
 */
public class Jdbc {
    private static Connection conn;
    static Connection configDB() throws SQLException {
        String url  = "jdbc:mysql://localhost/tugasjdbc";
        String username = "root";
        String password = "";
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Berhasil");
        }
        catch (Exception e) {
            System.err.println ("Koneksi gagal"+ e.getMessage());
        }
    return conn;
    }
}
