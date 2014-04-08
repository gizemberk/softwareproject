package Model;

//import GUI.AddGUI;
//import GUI.HomePage;

import java.sql.*;

import javax.swing.JOptionPane;
 
public class DbDataAdd{
	
	
	public void DataAdd (String name, String country, int year, String directorName, String path,String type1, String type2, String type3)
	{		
		   Connection conn = null;
		   Statement stmt = null;
		try{
		      //JDBC surucusu kaydetme islemi
		      Class.forName("com.mysql.jdbc.Driver");
		 
		      //Baglanti acma islemi
		      System.out.println("Baglaniliyor...");
		      conn = DriverManager.getConnection(DB_URL, KULLANICI, SIFRE);
		 
		      //Sql sorgusunun calismasi
		      System.out.println("Kayit Ekleniyor...");
		      stmt = conn.createStatement();
		      
		      String sql = "INSERT INTO Movies (name,country,year,directorName,path,type1,type2,type3)" +
		              "VALUES ('"+ name + "','" + country + "','" +year +"','" + directorName + "','"+path
		              + "','" + type1 +"','"+type2 +"','" +type3 +"')";
		      
		 
		      stmt.executeUpdate(sql);
		      //System.out.println("Tebrikler. Kayit Eklediniz...");
		      JOptionPane.showMessageDialog( null, "Movie is added succesfully :) !");
		      
		 
		   }catch(Exception ex){
			   JOptionPane.showMessageDialog(null,"Bir Hata Olustu: " + ex);
			   //JOptionPane.showInputDialog(name);
			   //JOptionPane.showConfirmDialog(null, message)
			   //new AddGUI();
		   }
	}
	
	public static String name;
	public int id;
   // JDBC surucu adi ve veritabani urlsi
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/MovieArchive";
 
   //Veritabani kullanici adi ve sifre
   static final String KULLANICI = "root";
   static final String SIFRE = "";
 
   public static void main(String[] args) {

   
}
}
