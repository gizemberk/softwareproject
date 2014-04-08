package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
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
 
      System.out.println("Tebrikler. Veritabanina baglandiniz...");
 
   }catch(Exception ex){
      System.out.println("Bir Hata Olustu: " + ex);
   }
}
}