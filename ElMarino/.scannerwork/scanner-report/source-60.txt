package clase;

public class Pedido {
	
	private int ID_Pedido;
	private int ID_Cliente;
	private int ID_Menu;
	private int ID_Repartidor;
	private String Fecha;
	private String TipoPago;
	private double Total;
	private String EstadoPedido;
	public Pedido(int iD_Pedido, int iD_Cliente, int iD_Menu, int iD_Repartidor, String fecha, String tipoPago,
			double total, String estadoPedido) {
		super();
		ID_Pedido = iD_Pedido;
		ID_Cliente = iD_Cliente;
		ID_Menu = iD_Menu;
		ID_Repartidor = iD_Repartidor;
		Fecha = fecha;
		TipoPago = tipoPago;
		Total = total;
		EstadoPedido = estadoPedido;
	}
	public int getID_Pedido() {
		return ID_Pedido;
	}
	public void setID_Pedido(int iD_Pedido) {
		ID_Pedido = iD_Pedido;
	}
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public int getID_Menu() {
		return ID_Menu;
	}
	public void setID_Menu(int iD_Menu) {
		ID_Menu = iD_Menu;
	}
	public int getID_Repartidor() {
		return ID_Repartidor;
	}
	public void setID_Repartidor(int iD_Repartidor) {
		ID_Repartidor = iD_Repartidor;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getTipoPago() {
		return TipoPago;
	}
	public void setTipoPago(String tipoPago) {
		TipoPago = tipoPago;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public String getEstadoPedido() {
		return EstadoPedido;
	}
	public void setEstadoPedido(String estadoPedido) {
		EstadoPedido = estadoPedido;
	}
	
	
	
	
	

}
