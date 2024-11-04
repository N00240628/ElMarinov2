package clase;

public class Clase_Producto {
	private int IdProducto;
	private  String Nombre;
	private String Descripcion;
	private double precio;
	private int disponibilidad;
	
	
	public Clase_Producto(int idProducto, String nombre, String descripcion, double precio, int disponibilidad) {
		super();
		IdProducto = idProducto;
		Nombre = nombre;
		Descripcion = descripcion;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}
	public Clase_Producto() {

	}
	public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	

}
