package Database;

import Kisi.Kisi;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConnection;

public class Data {

    SQLiteConnection connection;
    PreparedStatement pstm;
    Statement stm; 
    
    public SQLiteConnection Baglanti() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = (SQLiteConnection) DriverManager.getConnection("jdbc:sqlite:src/Database/db.sqlite");
        return connection;
    }
    public void AddWorker(Kisi kisi, double agi) throws ClassNotFoundException, SQLException {
        Baglanti();
        String sql = "insert into Kisiler (adsoyad, tcNo, ibanNo, medeniDurum, cocukSayisi, agi) values (?,?,?,?,?,?) ";
        pstm = connection.prepareStatement(sql);
        pstm.setString(1, kisi.getAdSoyad());
        pstm.setString(2, kisi.getTcNo());
        pstm.setString(3, kisi.getIbanNo());
        pstm.setString(4, kisi.getMedeniDurum());
        pstm.setInt(5, kisi.getCocukSayisi());
        pstm.setDouble(6, agi);
        pstm.executeUpdate();
        pstm.close();
        connection.close();        
    }
    
    public ResultSet WorkerList() throws ClassNotFoundException, SQLException {
        Baglanti(); 
        
        stm = connection.createStatement();   
        String sql = "select * from Kisiler";
        ResultSet sonuc = stm.executeQuery("select * from Kisiler");
        return sonuc; 
        
        //return stm.executeQuery(sql);
        
        
    }

}
