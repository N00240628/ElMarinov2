package ArrayList;
import java.util.ArrayList;
import java.sql.*;
import clase.cliente;
import conexion.ConexiónMySQL;


public class Arraycliente {
	public ArrayList<cliente> listarcliente(){
		ArrayList<cliente> lista=new ArrayList<cliente>();
		try {
			CallableStatement csta=ConexiónMySQL.getConexión().prepareCall("{call sp_Listar_CLIENTE()}");
			ResultSet rs=csta.executeQuery();
			cliente clie;
			while (rs.next()) {
				clie=new cliente(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				lista.add(clie);
			}
		} catch (Exception e) {}
		return lista;
	}
	
	public ArrayList<cliente> consultarCliente(String  nombre){
		ArrayList<cliente> lista=new ArrayList<cliente>();
		try {
			Statement sta=ConexiónMySQL.getConexión().createStatement();
			ResultSet rs=sta.executeQuery("select * from CLIENTE  where Nombre like '%"+nombre+"%'");
			
			cliente clie;
			while (rs.next()) {
				clie=new cliente(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				lista.add(clie);
				
			}
		} catch (Exception e) {	} 
		return lista;
	}
	
	
	public ArrayList<cliente> ConsultarCod(String cod){
		
		ArrayList<cliente> lista=new ArrayList<cliente>();
		try{
			Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement csta=cnx.prepareCall("{call sp_ConsultarCod_CLIENTE(?)}");
			csta.setString(1, cod);
			ResultSet rs= csta.executeQuery(); 
			cliente clie;
			while (rs.next()) {
				clie=new cliente(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				lista.add(clie);
			}
		}catch(Exception e){}
		return lista;
	}
	
	public void insertar(cliente clie){
		try{
		Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement csta=	cnx.prepareCall("{call sp_Insertar_CLIENTE(?,?,?,?,?,?,?)}");
			csta.setString(1,clie.getIdcliente());
			csta.setString(2, clie.getNombre());
			csta.setString(3,clie.getApellido());
			csta.setString(4,clie.getDireccion());
			csta.setString(5,clie.getCorreo());
			csta.setString(6, clie.getTelefono());
			csta.setString(7, clie.getContraseña());
			csta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}	
	}
	public void eliminar(String cod){
		try{
		Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement psta=	cnx.prepareCall("{call sp_Eliminar_CLIENTE(?)}");
			CallableStatement pst=	cnx.prepareCall("{call sp_Eliminar_CLIENTE2(?)}");
			psta.setString(1, cod);
			pst.setString(1, cod);
			psta.executeUpdate();
			pst.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}
	}
	public void editar(cliente clie){
		try{
		Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement psta=cnx.prepareCall("{call sp_Editar_CLIENTE(?,?,?,?,?,?,?)}");
			psta.setString(1,clie.getIdcliente());
			psta.setString(2, clie.getNombre());
			psta.setString(3,clie.getApellido());
			psta.setString(4,clie.getDireccion());
			psta.setString(5,clie.getCorreo());
			psta.setString(6, clie.getTelefono());
			psta.setString(7, clie.getContraseña());
			psta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}
	}
	

}
