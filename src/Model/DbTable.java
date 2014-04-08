package Model;

import java.sql.*;
 
public class DbTable{
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
      System.out.println("Tablo olusturuluyor...");
      stmt = conn.createStatement();
      String sql = "CREATE TABLE Movies " +
              "(id INTEGER NOT NULL AUTO_INCREMENT, " +
              " name CHAR(255) UNIQUE NOT NULL, " +
              " country CHAR(255) NOT NULL," +
              " year INTEGER, " +
              " directorName VARCHAR(255), "+
              " path VARCHAR(255),"+
              " type1 VARCHAR(255)," +
              " type2 VARCHAR(255)," +
              " type3 VARCHAR(255)," +
              " PRIMARY KEY ( id ))";
      stmt.executeUpdate(sql);
      System.out.println("Tebrikler. Tabloyu olusturdunuz...");
 
   }catch(Exception ex){
      System.out.println("Bir Hata Olustu: " + ex);
   }
}
}