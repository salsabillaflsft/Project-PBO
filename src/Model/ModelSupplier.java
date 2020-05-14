package Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelSupplier {
    Statement statement;
    Connection connection;
    public void insertSupplier(String id_supplier, String nama_supplier, String contact){
        try {
            String query = "INSERT INTO `supplier`( ` `,`nama_supplier`, `contact`) " +
                    "VALUES ('"+id_supplier+"','"+nama_supplier+"','"+contact+"')";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String[][] readSupplier(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][3];
            String query = "SELECT * FROM `supplier`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_supplier");
                data[jmlData][1] = resultSet.getString("nama_supplier");
                data[jmlData][2] = resultSet.getString("contact");
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
            String query = "Select * from`supplier`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("id_supplier"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public int getBanyakData(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `supplier`";
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

    public void deleteSupplier(String id_supplier, String nama_supplier, String contact){
        try {
            String query = "DELETE FROM `supplier` WHERE `id_supplier` = '"+id_supplier+"',`nama_supplier`='" + nama_supplier + "',`contact`='" + contact + "' WHERE `id_supplier` = '" + id_supplier + "'";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void updateSupplier(String id_supplier, String nama_supplier, String contact){
        try {
            String query = "UPDATE `supplier` SET `id_supplier` = '"+id_supplier+"',`nama_supplier`='" + nama_supplier + "',`contact`='" + contact + "' WHERE `id_supplier` = '" + id_supplier + "'";
            statement = (Statement) connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
