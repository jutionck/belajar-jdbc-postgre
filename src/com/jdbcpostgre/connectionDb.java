package com.jdbcpostgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDb {

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
                //koneksi melalui jdbc dengan database postgre, /database, username, password
                "jdbc:postgresql://127.0.0.1:5432/db_manajemenkeuangan", "postgres", "12345qwe")) {

            if (conn != null) {
                //cetak ini jika koneksi berhasil
                System.out.println("Connected to the database!");
            } else {
                //cetak ini jika koneksi gagal
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            //informasi jika ada error atau gak konek
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
