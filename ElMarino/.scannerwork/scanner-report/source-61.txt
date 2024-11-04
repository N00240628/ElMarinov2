package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexiónMySQL {
public static Connection getConexión(){
	Connection cnx=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver correcto 1");
		cnx=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bd_Admii","root","Alexito13");
				System.out.println("Conexion correcta 2");
	} catch (Exception e) {
		System.out.println("Error: "+e);
	}		
	return cnx;
}
public static void main(String[] args){
	getConexión();
}
}
