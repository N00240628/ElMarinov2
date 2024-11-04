package clase;

public class Clase_Repartidor {
	private int IdRepartidor;
	private String Nombre;
	private String Apellido;
	private int dni ;
	private int Telefono ;
	public Clase_Repartidor(int idRepartidor, String nombre, String apellido, int dni, int telefono) {
		super();
		IdRepartidor = idRepartidor;
		Nombre = nombre;
		Apellido = apellido;
		this.dni = dni;
		Telefono = telefono;
	}
	public int getIdRepartidor() {
		return IdRepartidor;
	}
	public void setIdRepartidor(int idRepartidor) {
		IdRepartidor = idRepartidor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	
}
