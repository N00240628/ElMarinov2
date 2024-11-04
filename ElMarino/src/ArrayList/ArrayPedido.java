package ArrayList;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clase.Pedido;
import conexion.ConexiónMySQL;

public class ArrayPedido {
	
	public ArrayList<Pedido>listarPedido()
	{
		ArrayList<Pedido>lista = new ArrayList<Pedido>();
		try
		{
			CallableStatement csta= ConexiónMySQL.getConexión().prepareCall("{call sp_Listar_PEDIDO()}");
			ResultSet rs=csta.executeQuery();
			while(rs.next())
			{
				Pedido ped = new Pedido(rs.getInt(1),rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDouble(7),rs.getString(8));
				lista.add(ped);
			}
		}catch(Exception e){}
		return lista;
	}
	
	public void insertar(Pedido ped){
		try{
		Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement csta=	cnx.prepareCall("{call sp_Insertar_PEDIDO(?,?,?,?,?,?,?,?)}");
			csta.setInt(1,ped.getID_Pedido());
			csta.setInt(2,ped.getID_Cliente());
			csta.setInt(3,ped.getID_Menu());
			csta.setInt(4,ped.getID_Repartidor());
			csta.setString(5,ped.getFecha());
			csta.setString(6,ped.getTipoPago());
			csta.setDouble(7,ped.getTotal());
			csta.setString(8,ped.getEstadoPedido());
			csta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}	
	}
	public ArrayList<Pedido> ConsultarCod(int cod){
		
		ArrayList<Pedido> lista=new ArrayList<Pedido>();
		try{
			Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement csta=cnx.prepareCall("{call sp_consultarCod(?)}");
			csta.setInt(1, cod);
			ResultSet rs= csta.executeQuery(); 
			Pedido ped;
			while (rs.next()) {
				ped = new Pedido(rs.getInt(1),rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDouble(7),rs.getString(8));
				lista.add(ped);
			}
		}catch(Exception e){}
		return lista;
	}
	public void eliminar(int cod){
		try{
		Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement psta=	cnx.prepareCall("{call sp_Eliminar_PEDIDO(?)}");
			psta.setInt(1, cod);
			psta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}
	}
	public void editar(Pedido ped){
		try{
		Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement psta=cnx.prepareCall("{call sp_Editar_PEDIDO(?,?,?,?,?,?,?,?)}");
			psta.setInt(1,ped.getID_Pedido());
			psta.setInt(2,ped.getID_Cliente());
			psta.setInt(3,ped.getID_Menu());
			psta.setInt(4,ped.getID_Repartidor());
			psta.setString(5, ped.getFecha());
			psta.setString(6,ped.getTipoPago());
			psta.setDouble(7, ped.getTotal());
			psta.setString(8, ped.getEstadoPedido());
			psta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}
	}
	

}
