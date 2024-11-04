package ArrayList;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clase.Clase_Producto;
import conexion.ConexiónMySQL;

public class ArrayProducto {
	
	public ArrayList<Clase_Producto>listarProducto()
	{
		ArrayList<Clase_Producto>lista = new ArrayList<Clase_Producto>();
		try
		{
			CallableStatement csta=ConexiónMySQL.getConexión().prepareCall("{call sp_Listar_PRODUCTO()}");
			ResultSet rs=csta.executeQuery();
			while(rs.next())
			{
				Clase_Producto men = new Clase_Producto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5));
				lista.add(men);
			}
		}catch(Exception e){}
		return lista;
	}
	
	public void insertarProducto(Clase_Producto ped){
		try{
		Connection con=ConexiónMySQL.getConexión();
			CallableStatement csta=	con.prepareCall("{call sp_Insertar_Producto(?,?,?,?,?)}");
			csta.setInt(1,ped.getIdProducto());
			csta.setString(2,ped.getNombre());
			csta.setString(3,ped.getDescripcion());
			csta.setDouble(4,ped.getPrecio());
			csta.setInt(5,ped.getDisponibilidad());
			csta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}	
	}
	
	public void editar(Clase_Producto pro){
		try{
		Connection con=ConexiónMySQL.getConexión();
			CallableStatement csta=	con.prepareCall("{call sp_Insertar_Producto(?,?,?,?,?)}");
			csta.setInt(1,pro.getIdProducto());
			csta.setString(2,pro.getNombre());
			csta.setString(3,pro.getDescripcion());
			csta.setDouble(4,pro.getPrecio());
			csta.setInt(5,pro.getDisponibilidad());
			csta.executeUpdate();
		}catch(Exception e){
			System.out.println("ERROR" +e);
		}	
	}
}
