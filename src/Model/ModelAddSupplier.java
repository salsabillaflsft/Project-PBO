package Model;

import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelAddSupplier {
    Statement statement;
    public void addSupplier(String supplier, String contact) {
        try{
            String query = "INSERT INTO `supplier` (`supplier`,`contact`) VALUES ('"+supplier+"','"+contact+"')";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Supplier Berhasil Ditambahkan");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    public void addKategori(String kategori){
        try {
            String query = "INSERT INTO `kategori`(`kategori`) " + "VALUES ('"+kategori+"')";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
