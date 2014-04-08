package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbCreate{
   // JDBC surucu adi ve veritabani urlsi
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/";
 
   //Veritabani kullanici adi ve sifre
   static final String KULLANICI= "root";
   static final String SIFRE= "";
 
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
      System.out.println("Veritabani olusturuluyor...");
      stmt = conn.createStatement();
      String sql = "CREATE DATABASE MovieArchive";
      stmt.executeUpdate(sql);
      System.out.println("Tebrikler. Veritabanini olusturdunuz...");
 
   }catch(Exception ex){
      System.out.println("Bir Hata Olustu: " + ex);
   }
}
}
