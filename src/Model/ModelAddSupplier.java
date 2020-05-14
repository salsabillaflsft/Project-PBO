package Model;

import javax.swing.*;
import java.sql.Statement;

public class ModelAddSupplier {
    Statement statement;
    public void addSupplier(String nama, String contact) {
        try{
            String query = "INSERT INTO `supplier` (`id_supplier`,`nama_supplier`,`contact`) VALUES ('0','"+nama+"','"+contact+"')";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Supplier Berhasil Ditambahkan");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
