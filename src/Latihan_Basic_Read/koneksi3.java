package Latihan_Basic_Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author NURUL MUSTOFA
 */
public class koneksi3 {

private static Connection conn;

public static Connection Koneksi(){
    try {
        DriverManager.registerDriver( new com.mysql.jdbc.Driver() );
        conn = DriverManager.getConnection("jdbc:mysql://localhost/sekolah2", "root", "");
        System.out.println("Koneksi Berhasil Bund");
    } catch (SQLException e) {
        System.out.println("Koneksi Gagal Bund");
    }
    return conn;
}
    public static void main(String[] args) {
        Koneksi();
    }
}
