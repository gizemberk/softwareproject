package Model;

//sql kutuphanesini cagirir
import java.sql.*;

import javax.swing.JOptionPane;
 
public class DbDataRead{
	
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
      System.out.println("Kayitlar Okunuyor...");
      stmt = conn.createStatement();
 
      String sql = "SELECT id, name,country,year,directorName,path,type1,type2,type3 FROM Movies";
      ResultSet rs = stmt.executeQuery(sql);
      
      if(rs.wasNull()) JOptionPane.showMessageDialog(null , "Error");
 
      while(rs.next()){
 
    	  System.out.println("ID: " + rs.getInt("id")
    			  			+", Ad: " + rs.getString("name")
    			  			+ ", Country :" + rs.getString("country")
    			  			+ " , Year : " +rs.getInt("year")
    			  			+ ", Director :" + rs.getString("directorName")
    			  			+ ", Path : " +rs.getString("path")
    			  			+ ", Types :" +rs.getString("type1")
    			  			+", " +rs.getString("type2")+", "
    			  			+rs.getString("type3"));
       }
       rs.close();
 
      System.out.println("\nTebrikler. Kayitlari Okudunuz...");
 
   }catch(Exception ex){
	   JOptionPane.showMessageDialog(null,"Bir Hata Olustu: " + ex);
   }
}
}