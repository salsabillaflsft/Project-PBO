package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ModelMain {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/prakdata";
    static final String USER = "root";
    static final String PASS = "";

    Statement statement;

    public int getBanyakData(){//menghitung jumlah baris
        int jmlData = 0;
        try{
            statement = JavaDatabase.getConnection().createStatement();
            String query = "Select * from `restaurant`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                jmlData++;
            }
            return jmlData;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    public String[][] logIn(){
        try{
            int jmlData = 0;

            String data[][] = new String[getBanyakData()][3]; //baris, kolom nya ada 4
            String query = "Select * from`user`";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("id_user"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][1] = resultSet.getString("user");
                data[jmlData][2] = resultSet.getString("pass");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

}
