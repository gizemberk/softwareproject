package Model;

import java.sql.*;

import javax.swing.JOptionPane;
 
public class DbDataDelete{
   // JDBC surucu adi ve veritabani urlsi
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/MovieArchive";
 
   //Veritabani kullanici adi ve sifre
   static final String KULLANICI = "root";
   static final String SIFRE = "";
 
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //JDBC surucusu kaydetme islemi
      Class.forName("com.mysql.jdbc.Driver");
 
      //Baglanti acma islemi
      System.out.println("Baglaniliyor...");
      conn = DriverManager.getConnection(DB_URL, KULLANICI, SIFRE);
 
      //Sql sorgusunun calismasi
      System.out.println("Komut Olusturuluyor...");
      stmt = conn.createStatement();
 
      //String sql = "DELETE FROM Movies " +	
        //      "WHERE id = 100";		//Change it
      
      String sql = "DROP TABLE " +	
              "Movies";
      stmt.executeUpdate(sql);
 
      JOptionPane.showMessageDialog(null,"Tebrikler. Kayit Basariyla Silindi...");
 
   }catch(Exception ex){
	   JOptionPane.showMessageDialog(null,"Bir Hata Olustu: " + ex);
   }
}
}