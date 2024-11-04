package ArrayList;

import java.util.ArrayList;

import clase.Clase_Repartidor;
import conexion.ConexiónMySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ArrayRepartidor {
	public ArrayList<Clase_Repartidor>listarRepartidor()
	{
		ArrayList<Clase_Repartidor>lista = new ArrayList<Clase_Repartidor>();
		try
		{
			CallableStatement csta=(CallableStatement) ConexiónMySQL.getConexión().prepareCall("{call sp_Listar_REPARTIDOR()}");
			ResultSet rs=csta.executeQuery();
			while(rs.next())
			{
				Clase_Repartidor ped = new Clase_Repartidor(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				lista.add(ped);
			}
		}catch(Exception e){}
		return lista;
	}
	
	public void insertarRepartidor(Clase_Repartidor ped){
		try{
		Connection con=ConexiónMySQL.getConexión();
			CallableStatement csta=	con.prepareCall("{call sp_Insertar_REPARTIDOR(?,?,?,?,?)}");
			csta.setInt(1,ped.getIdRepartidor());
			csta.setString(2,ped.getNombre());
			csta.setString(3,ped.getApellido());
			csta.setInt(4,ped.getDni());
			csta.setInt(5,ped.getTelefono());
			csta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}	
	}
	public ArrayList<Clase_Repartidor> ConsultarRepartidor(String cod){
		
		ArrayList<Clase_Repartidor> lista=new ArrayList<Clase_Repartidor>();
		try{
			Connection con=ConexiónMySQL.getConexión();
			CallableStatement csta=con.prepareCall("{call sp_ConsultarCod_REPARTIDOR(?)}");
			csta.setString(1, cod);
			ResultSet rs= csta.executeQuery(); 
			Clase_Repartidor ped;
			while (rs.next()) {
				ped = new Clase_Repartidor(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				lista.add(ped);
			}
		}catch(Exception e){}
		return lista;
	}
	public void eliminarRepartidor(int cod){
		try{
		Connection con=ConexiónMySQL.getConexión();
			CallableStatement psta=	con.prepareCall("{call sp_Eliminar_REPARTIDOR(?)}");
			psta.setInt(1, cod);
			psta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}
	}
	public void editarRepartidor(Clase_Repartidor ped){
		try{
		Connection con=ConexiónMySQL.getConexión();
			CallableStatement psta=con.prepareCall("{call sp_Insertar_PEDIDO(?,?,?,?,?,?,?,?)}");
			psta.setInt(1,ped.getIdRepartidor());
			psta.setString(2,ped.getNombre());
			psta.setString(3,ped.getApellido());
			psta.setInt(4,ped.getDni());
			psta.setInt(5,ped.getTelefono());
			psta.executeUpdate();
			psta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}
	}
}
