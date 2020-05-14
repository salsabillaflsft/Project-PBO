package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelSupply {
    Statement statement;

    public int getBanyakData(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM (`supply` JOIN `kategori` ON `supply`.`kategori` = `kategori`.`kategori`)JOIN `supplier` ON `supply`.`supplier` = `supplier`.`supplier`";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    public String[][] readSupply(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][5];
            String query = "SELECT * FROM ((`supply` JOIN `kategori` ON `supply`.`kategori` = `kategori`.`kategori`)JOIN `supplier` ON `supply`.`supplier` = `supplier`.`supplier`) ORDER BY 'id_supply'";
            ResultSet resultSet = statement.executeQuery(query);
            int i = 1;
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_supply");
                data[jmlData][1] = resultSet.getString("kategori");
                data[jmlData][2] = resultSet.getString("supplier");
                data[jmlData][3] = resultSet.getString("nama_produk");
                data[jmlData][4] = resultSet.getString("jumlah_produk");
                jmlData++;
                i++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    public void insertSupply(String nama_produk, String jumlah_produk, String kategori, String supplier){
        try{
            String query = "INSERT INTO `supply` (`id_supply`, `kategori`, `supplier`,`nama_produk`,`jumlah_produk` ) VALUES ('0','"+kategori+"','"+supplier+"','"+nama_produk+"','"+jumlah_produk+"')";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public ArrayList<String> readNamaProduk(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `supply`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("nama_produk"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public int getBanyakData2(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `kategori`";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            return 0;
        }
    }
    public String[][] readKategori(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData2()][1];
            String query = "SELECT * FROM `kategori`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("kategori");
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
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("kategori"));
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public int getBanyakData3(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `supplier`";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            return 0;
        }
    }
    public String[][] readSupplier(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData3()][2];
            String query = "SELECT * FROM `supplier`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("nama_supplier");
                data[jmlData][1] = resultSet.getString("contact");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<String> readNamaSupplier(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `supplier`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("supplier"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public void updateSupply(String nama_produk,String jumlah_produk,String kategori,String supplier){
        try {
            String query = "UPDATE `supply` SET `nama_produk` = '"+nama_produk+"',`jumlah_produk`='" + jumlah_produk + "',`kategori`='" +kategori +"', `supplier`='" +supplier +"'WHERE `nama_produk` = '" + nama_produk + "'";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void deleteSupply(String id_supply){
        try {
            String query = "DELETE FROM `supply` WHERE `id_supply` = '" + id_supply + "'";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

