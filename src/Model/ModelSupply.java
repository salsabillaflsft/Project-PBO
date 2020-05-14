package Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelSupply {
    Statement statement;
    Connection connection;
    public void insertSupply(String id_supply, String nama_produk, String jumlah_produk){
        try{
            String query = "INSERT INTO `supply` (` `, `nama_produk`, `jumlah_produk`) VALUES ('"+id_supply+"','"+nama_produk+"','"+jumlah_produk+"')";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String[][] readSupply(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][3];
            String query = "SELECT * FROM `supply` JOIN `kategori` ON `supply`.`id_kategori` = `kategori`.`id_kategori` JOIN `supplier` ON `supply`.`id_supplier` = `supplier`.`id_supplier` ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_supply");
                data[jmlData][1] = resultSet.getString("nama_produk");
                data[jmlData][2] = resultSet.getString("jumlah_produk");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<String> readNamaSupply(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `supply` JOIN `kategori` ON `supply`.`id_kategori` = `kategori`.`id_kategori` JOIN `supplier` ON `supply`.`id_supplier` = `supplier`.`id_supplier` ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("id_supply"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public int getBanyakData(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `supply` JOIN `kategori` ON `supply`.`id_kategori` = `kategori`.`id_kategori` JOIN `supplier` ON `supply`.`id_supplier` = `supplier`.`id_supplier` ";
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

    public void deleteSupply(String id_supply, String nama_produk, String jumlah_produk){
        try {
            String query = "DELETE FROM `supply` WHERE `id_supply` = '"+id_supply+"',`nama_produk`='" + nama_produk + "',`jumlah_produk`='" + jumlah_produk + "' WHERE `id_supply` = '" + id_supply + "'";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void updateSupply(String id_supply, String nama_produk, String jumlah_produk){
        try {
            String query = "UPDATE `supply` SET `id_supply` = '"+id_supply+"',`nama_produk`='" + nama_produk + "',`jumlah_produk`='" + jumlah_produk + "' WHERE `id_supply` = '" + id_supply + "'";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

