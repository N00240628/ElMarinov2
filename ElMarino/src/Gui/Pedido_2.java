package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ArrayList.ArrayPedido;
import clase.Pedido;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Pedido_2 extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtIDPedido;
	private JLabel lblIdCliente;
	private JTextField txtIDCliente;
	private JLabel lblId;
	private JTextField txtIDMenu;
	private JLabel lblIdRepartidor;
	private JTextField txtIDRep;
	private JTextField txtFecha;
	private JLabel lblFecha;
	private JTextField txtTipo;
	private JLabel lblTipoDePago;
	private JTextField txtEstado;
	private JLabel lblEstadoDePedido;
	private JButton btnEliminar;
	private JTable tbDatos1;
	private JButton btnLimpiar;
	private JLabel lblP;
	private JLabel lblE;
	private JLabel lblD;
	private JLabel lblI;
	private JLabel lblD_1;
	private JLabel lblO;
	private JButton btnModificar;
	private JButton btnAtras;
	private JLabel label;
	private JLabel lblModificar;
	private JLabel lblLimpiar;
	private JLabel lblEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido_2 frame = new Pedido_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pedido_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 618);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(18, 339, 598, 134);
			contentPane.add(scrollPane);
			{
				tbDatos1 = new JTable();
				scrollPane.setViewportView(tbDatos1);
				tbDatos1.addMouseListener(this);
				tbDatos1.setFillsViewportHeight(true);
			}
		}
		{
			panel = new JPanel();
			panel.setBackground(new Color(0, 102, 153));
			panel.setBounds(0, 0, 646, 54);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				lblP = new JLabel("P");
				lblP.setForeground(Color.WHITE);
				lblP.setBounds(20, 11, 24, 32);
				lblP.setFont(new Font("Segoe UI", Font.BOLD, 25));
				panel.add(lblP);
			}
			{
				lblE = new JLabel("E");
				lblE.setForeground(Color.WHITE);
				lblE.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblE.setBounds(54, 11, 24, 32);
				panel.add(lblE);
			}
			{
				lblD = new JLabel("D");
				lblD.setForeground(Color.WHITE);
				lblD.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblD.setBounds(88, 11, 24, 32);
				panel.add(lblD);
			}
			{
				lblI = new JLabel("I");
				lblI.setForeground(Color.WHITE);
				lblI.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblI.setBounds(122, 11, 24, 32);
				panel.add(lblI);
			}
			{
				lblD_1 = new JLabel("D");
				lblD_1.setForeground(Color.WHITE);
				lblD_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblD_1.setBounds(156, 11, 24, 32);
				panel.add(lblD_1);
			}
			{
				lblO = new JLabel("O");
				lblO.setForeground(Color.WHITE);
				lblO.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblO.setBounds(190, 11, 24, 32);
				panel.add(lblO);
			}
		}
		{
			lblNewLabel = new JLabel("ID PEDIDO:");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel.setBounds(76, 97, 77, 27);
			contentPane.add(lblNewLabel);
		}
		{
			txtIDPedido = new JTextField();
			txtIDPedido.setBounds(163, 100, 58, 20);
			contentPane.add(txtIDPedido);
			txtIDPedido.setColumns(10);
		}
		{
			lblIdCliente = new JLabel("ID CLIENTE:");
			lblIdCliente.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblIdCliente.setBounds(65, 131, 77, 27);
			contentPane.add(lblIdCliente);
		}
		{
			txtIDCliente = new JTextField();
			txtIDCliente.setColumns(10);
			txtIDCliente.setBounds(163, 134, 58, 20);
			contentPane.add(txtIDCliente);
		}
		{
			lblId = new JLabel("ID MEN\u00DA:");
			lblId.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblId.setBounds(86, 167, 67, 27);
			contentPane.add(lblId);
		}
		{
			txtIDMenu = new JTextField();
			txtIDMenu.setColumns(10);
			txtIDMenu.setBounds(163, 172, 58, 20);
			contentPane.add(txtIDMenu);
		}
		{
			lblIdRepartidor = new JLabel("ID REPARTIDOR:");
			lblIdRepartidor.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblIdRepartidor.setBounds(43, 211, 107, 27);
			contentPane.add(lblIdRepartidor);
		}
		{
			txtIDRep = new JTextField();
			txtIDRep.setColumns(10);
			txtIDRep.setBounds(163, 214, 58, 20);
			contentPane.add(txtIDRep);
		}
		{
			txtFecha = new JTextField();
			txtFecha.setColumns(10);
			txtFecha.setBounds(374, 100, 135, 20);
			contentPane.add(txtFecha);
		}
		{
			lblFecha = new JLabel("FECHA:");
			lblFecha.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblFecha.setBounds(306, 95, 58, 27);
			contentPane.add(lblFecha);
		}
		{
			txtTipo = new JTextField();
			txtTipo.setColumns(10);
			txtTipo.setBounds(374, 134, 135, 20);
			contentPane.add(txtTipo);
		}
		{
			lblTipoDePago = new JLabel("TIPO DE PAGO:");
			lblTipoDePago.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblTipoDePago.setBounds(257, 129, 107, 27);
			contentPane.add(lblTipoDePago);
		}
		{
			txtEstado = new JTextField();
			txtEstado.setColumns(10);
			txtEstado.setBounds(374, 170, 135, 20);
			contentPane.add(txtEstado);
		}
		{
			lblEstadoDePedido = new JLabel("ESTADO PEDIDO:");
			lblEstadoDePedido.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblEstadoDePedido.setBounds(243, 165, 121, 27);
			contentPane.add(lblEstadoDePedido);
		}
		{
			btnEliminar = new JButton("");
			btnEliminar.setIcon(new ImageIcon(Pedido_2.class.getResource("/imagen/icons8-eliminar-propiedad-50.png")));
			btnEliminar.addActionListener(this);
			btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 13));
			btnEliminar.setBounds(529, 172, 72, 52);
			contentPane.add(btnEliminar);
		}
		{
			btnLimpiar = new JButton("");
			btnLimpiar.setIcon(new ImageIcon(Pedido_2.class.getResource("/imagen/icons8-limpiar-50.png")));
			btnLimpiar.setFont(new Font("Segoe UI", Font.BOLD, 13));
			btnLimpiar.setBounds(529, 257, 72, 52);
			contentPane.add(btnLimpiar);
			{
				btnModificar = new JButton("");
				btnModificar.setIcon(new ImageIcon(Pedido_2.class.getResource("/imagen/icons8-editar-propiedad-50.png")));
				btnModificar.addActionListener(this);
				btnModificar.setFont(new Font("Segoe UI", Font.BOLD, 13));
				btnModificar.setBounds(529, 91, 72, 54);
				contentPane.add(btnModificar);
			}
			{
				btnAtras = new JButton("");
				btnAtras.setIcon(new ImageIcon(Pedido_2.class.getResource("/imagen/icons8-saltar-a-inicio-50.png")));
				btnAtras.addActionListener(this);
				btnAtras.setFont(new Font("Segoe UI", Font.BOLD, 13));
				btnAtras.setBounds(18, 484, 67, 62);
				contentPane.add(btnAtras);
			}
			{
				label = new JLabel("ATRAS");
				label.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label.setBounds(28, 557, 50, 14);
				contentPane.add(label);
			}
			{
				lblModificar = new JLabel("MODIFICAR");
				lblModificar.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblModificar.setBounds(529, 147, 77, 14);
				contentPane.add(lblModificar);
			}
			{
				lblLimpiar = new JLabel("LIMPIAR");
				lblLimpiar.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblLimpiar.setBounds(539, 314, 77, 14);
				contentPane.add(lblLimpiar);
			}
			{
				lblEliminar = new JLabel("ELIMINAR");
				lblEliminar.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblEliminar.setBounds(539, 232, 77, 14);
				contentPane.add(lblEliminar);
			}
			Listar("");
		}
	}
	
	public void Listar(String nom){
		DefaultTableModel modelo=new DefaultTableModel();
		ArrayPedido ped = new ArrayPedido();
		ArrayList<Pedido> lista=new ArrayList<Pedido>();
		if(nom.length()==0)
			lista=ped.listarPedido();
		else
			lista=ped.listarPedido();
		modelo.setRowCount(lista.size());
		Iterator it=lista.iterator();
		modelo.addColumn("ID PEDIDO");
		modelo.addColumn("ID CLIENTE");
		modelo.addColumn("ID MENÚ");
		modelo.addColumn("ID REPARTIDOR");
		modelo.addColumn("FECHA");
		modelo.addColumn("TIPO DE PAGO");
		modelo.addColumn("ESTADO DE PEDIDO");
		
		int i=0;
		
		while (it.hasNext()) {
			Object obj=it.next();
			Pedido acceso=(Pedido)obj;
			modelo.setValueAt(acceso.getID_Pedido(),i,0);
			modelo.setValueAt(acceso.getID_Cliente(),i,1);
			modelo.setValueAt(acceso.getID_Menu(),i,2);
			modelo.setValueAt(acceso.getID_Repartidor(),i,3);
			modelo.setValueAt(acceso.getFecha(),i,4);
			modelo.setValueAt(acceso.getTipoPago(),i,5);
			modelo.setValueAt(acceso.getEstadoPedido(),i,6);
			
			i++;
		}
		tbDatos1.setModel(modelo);
	}
	void Limpiar()
	{
		txtIDPedido.setText("");
		txtIDCliente.setText("");
		txtIDMenu.setText("");
		txtIDRep.setText("");
		txtFecha.setText("");
		txtTipo.setText("");
		txtEstado.setText("");
	}
	
	
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == tbDatos1) {
			do_tbDatos1_mouseClicked(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void do_tbDatos1_mouseClicked(MouseEvent arg0) {
		
		int fila=tbDatos1.getSelectedRow();
		txtIDPedido.setText(String.valueOf(tbDatos1.getValueAt(fila, 0)));
		txtIDCliente.setText(String.valueOf(tbDatos1.getValueAt(fila, 1)));
		txtIDMenu.setText(String.valueOf(tbDatos1.getValueAt(fila, 2)));
		txtIDRep.setText(String.valueOf(tbDatos1.getValueAt(fila, 3)));
		txtFecha.setText(String.valueOf(tbDatos1.getValueAt(fila, 4)));
		txtTipo.setText(String.valueOf(tbDatos1.getValueAt(fila, 5)));
		txtEstado.setText(String.valueOf(tbDatos1.getValueAt(fila, 6)));
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAtras) {
			do_btnAtras_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		
		ArrayPedido eliminar = new ArrayPedido();
		eliminar.eliminar(Integer.parseInt(txtIDPedido.getText()));
		Listar("");
		Limpiar();
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		
		try {
			Pedido ped = new Pedido(Integer.parseInt(txtIDPedido.getText()),Integer.parseInt(txtIDCliente.getText()),Integer.parseInt(txtIDMenu.getText()),Integer.parseInt(txtIDRep.getText()),txtFecha.getText(),txtTipo.getText(),Integer.parseInt(txtIDPedido.getText()),txtEstado.getText());
			ArrayPedido m = new ArrayPedido();
			m.editar(ped);
			Listar("");
			Limpiar();
		} catch (Exception E) {
			// TODO: handle exception
			
		JOptionPane.showMessageDialog(null, "Datos vacíos");
		}
		Limpiar();
	}
	protected void do_btnAtras_actionPerformed(ActionEvent e) {
		
		PED_1 ped1 = new PED_1();
		ped1.setVisible(true);
		this.dispose();
	}
}
