package com.jdbcpostgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class userManager {

    public static void main(String[] args) {

        String jdbcURL  = "jdbc:postgresql://127.0.0.1:5432/db_manajemenkeuangan";
        String username = "postgres";
        String password = "12345qwe";

        UUID uuid = UUID.randomUUID();

        try {
            Connection connection = DriverManager.getConnection(jdbcURL,username,password);

            //Insert to table
            String sql = "INSERT INTO m_nasabah (id_nasabah,nik_nasabah,nama_nasabah,tanggal_lahir,tempat_lahir,alamat,nama_ibu,status_nasabah)"
                        + "VALUES ('uuid','18090502002','Jution Candra Kirana','1992-01-01','Lampung','Jl Jalan Aja Gak di Tempat','Monalisa','Lajang')";

            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            if(rows > 0) {
                System.out.println("Data berhasil di input!");
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
