package Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelKategori {
    Statement statement;
    Connection connection;
    public void insertKategori(String id_kategori, String nama_kategori){
        try {
            String query = "INSERT INTO `kategori`(` `,`nama_kategori`) " +
                    "VALUES ('"+id_kategori+"','"+nama_kategori+"')";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String[][] readKategori(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][2];
            String query = "SELECT * FROM `kategori`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_kategori");
                data[jmlData][1] = resultSet.getString("nama_kategori");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<String> readNamaKategori(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "Select * from `kategori`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("id_kategori"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public int getBanyakData(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `kategori`";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            return 0;
        }
    }

    public void deleteKategori(String id_kategori, String nama_kategori){
        try {
            String query = "DELETE FROM `kategori` WHERE `id_kategori` = '"+id_kategori+"',`nama_kategori`='" + nama_kategori + "' WHERE `id_kategori` = '" + id_kategori + "'";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void updateKategori(String id_kategori, String nama_kategori){
        try {
            String query = "UPDATE `kategori` SET `id_kategori`='" + id_kategori + "',`nama_kategori`='" + nama_kategori + "' WHERE `id_kategori` = '" + id_kategori + "'";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
