package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ArrayList.ArrayPedido;
import ArrayList.ArrayProducto;
import ArrayList.ArrayRepartidor;
import ArrayList.Arraycliente;
import clase.Clase_Producto;
import clase.Clase_Repartidor;
import clase.Pedido;
import clase.cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;




import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PED_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel label;
	private JTextField txtIDPedido;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_7;
	private JComboBox cmbCliente;
	private JComboBox cmbMenu;
	private JComboBox cmbRepa;
	private JTextField txtAño;
	private JComboBox cmbTipo;
	private JComboBox cmbEstado;
	private JButton btnAtras;
	private JButton btnSiguente;
	private JButton button_2;
	private JTextField txtMes;
	private JTextField txtDia;
	private JLabel label_6;
	private JLabel label_8;
	private JPanel panel;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel lblSiguiente;
	private JLabel lblModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PED_1 frame = new PED_1();
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
	public PED_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 361);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			label = new JLabel("ID PEDIDO:");
			label.setBounds(10, 61, 107, 27);
			label.setFont(new Font("Segoe UI", Font.BOLD, 14));
			contentPane.add(label);
		}
		{
			txtIDPedido = new JTextField();
			txtIDPedido.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			txtIDPedido.setBounds(127, 66, 58, 20);
			txtIDPedido.setColumns(10);
			contentPane.add(txtIDPedido);
		}
		{
			label_1 = new JLabel("ID CLIENTE:");
			label_1.setBounds(10, 95, 91, 27);
			label_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
			contentPane.add(label_1);
		}
		{
			label_2 = new JLabel("ID MEN\u00DA:");
			label_2.setBounds(10, 133, 67, 27);
			label_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
			contentPane.add(label_2);
		}
		{
			label_3 = new JLabel("ID REPARTIDOR:");
			label_3.setBounds(10, 175, 121, 27);
			label_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
			contentPane.add(label_3);
		}
		{
			label_4 = new JLabel("FECHA:");
			label_4.setBounds(221, 61, 107, 27);
			label_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
			contentPane.add(label_4);
		}
		{
			label_5 = new JLabel("TIPO DE PAGO:");
			label_5.setBounds(221, 95, 107, 27);
			label_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
			contentPane.add(label_5);
		}
		{
			label_7 = new JLabel("ESTADO PEDIDO:");
			label_7.setBounds(221, 133, 121, 27);
			label_7.setFont(new Font("Segoe UI", Font.BOLD, 14));
			contentPane.add(label_7);
		}
		{
			cmbCliente = new JComboBox();
			cmbCliente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			cmbCliente.setBounds(127, 100, 58, 20);
			contentPane.add(cmbCliente);
		}
		{
			cmbMenu = new JComboBox();
			cmbMenu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			cmbMenu.setBounds(127, 138, 58, 20);
			contentPane.add(cmbMenu);
		}
		{
			cmbRepa = new JComboBox();
			cmbRepa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			cmbRepa.setBounds(127, 175, 58, 20);
			contentPane.add(cmbRepa);
		}
		{
			txtAño = new JTextField();
			txtAño.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			txtAño.setColumns(10);
			txtAño.setBounds(447, 66, 36, 20);
			contentPane.add(txtAño);
		}
		{
			cmbTipo = new JComboBox();
			cmbTipo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"PAGO EN EFECTIVO", "TRANS. BANCARIA", "TARJETA CR\u00C9DITO/D\u00C9BITO", "PAYPAL"}));
			cmbTipo.setBounds(338, 100, 145, 20);
			contentPane.add(cmbTipo);
		}
		{
			cmbEstado = new JComboBox();
			cmbEstado.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"PENDIENTE", "CANCELADO", "PROCESANDO", "COMPLETADO"}));
			cmbEstado.setBounds(338, 138, 145, 20);
			contentPane.add(cmbEstado);
		}
		{
			{
				btnAtras = new JButton("");
				btnAtras.addActionListener(this);
				btnAtras.setIcon(new ImageIcon(PED_1.class.getResource("/imagen/icons8-saltar-a-inicio-50.png")));
				btnAtras.setFont(new Font("Segoe UI", Font.BOLD, 15));
				btnAtras.setBounds(10, 234, 67, 54);
				contentPane.add(btnAtras);
			}
			{
				btnSiguente = new JButton("");
				btnSiguente.setIcon(new ImageIcon(PED_1.class.getResource("/imagen/icons8-siguiente-50.png")));
				btnSiguente.addActionListener(this);
				btnSiguente.setFont(new Font("Segoe UI", Font.BOLD, 15));
				btnSiguente.setBounds(416, 234, 67, 54);
				contentPane.add(btnSiguente);
			}
			{
				button_2 = new JButton("");
				button_2.setIcon(new ImageIcon(PED_1.class.getResource("/imagen/icons8-registro-50.png")));
				button_2.addActionListener(this);
				button_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
				button_2.setBounds(219, 229, 67, 59);
				contentPane.add(button_2);
			}
			{
				txtMes = new JTextField();
				txtMes.setFont(new Font("Segoe UI", Font.PLAIN, 12));
				txtMes.setColumns(10);
				txtMes.setBounds(390, 66, 36, 20);
				contentPane.add(txtMes);
			}
			{
				txtDia = new JTextField();
				txtDia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
				txtDia.setColumns(10);
				txtDia.setBounds(338, 66, 36, 20);
				contentPane.add(txtDia);
			}
			{
				label_6 = new JLabel("-");
				label_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
				label_6.setBounds(379, 69, 14, 14);
				contentPane.add(label_6);
			}
			{
				label_8 = new JLabel("-");
				label_8.setFont(new Font("Segoe UI", Font.BOLD, 12));
				label_8.setBounds(433, 69, 14, 14);
				contentPane.add(label_8);
			}
			{
				panel = new JPanel();
				panel.setLayout(null);
				panel.setBackground(new Color(0, 102, 153));
				panel.setBounds(0, 0, 494, 54);
				contentPane.add(panel);
				{
					label_9 = new JLabel("P");
					label_9.setForeground(Color.WHITE);
					label_9.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_9.setBounds(20, 11, 24, 32);
					panel.add(label_9);
				}
				{
					label_10 = new JLabel("E");
					label_10.setForeground(Color.WHITE);
					label_10.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_10.setBounds(54, 11, 24, 32);
					panel.add(label_10);
				}
				{
					label_11 = new JLabel("D");
					label_11.setForeground(Color.WHITE);
					label_11.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_11.setBounds(88, 11, 24, 32);
					panel.add(label_11);
				}
				{
					label_12 = new JLabel("I");
					label_12.setForeground(Color.WHITE);
					label_12.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_12.setBounds(122, 11, 24, 32);
					panel.add(label_12);
				}
				{
					label_13 = new JLabel("D");
					label_13.setForeground(Color.WHITE);
					label_13.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_13.setBounds(156, 11, 24, 32);
					panel.add(label_13);
				}
				{
					label_14 = new JLabel("O");
					label_14.setForeground(Color.WHITE);
					label_14.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_14.setBounds(190, 11, 24, 32);
					panel.add(label_14);
				}
			}
			{
				label_15 = new JLabel("ATRAS");
				label_15.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label_15.setBounds(20, 299, 50, 14);
				contentPane.add(label_15);
			}
			{
				lblSiguiente = new JLabel("SIGUIENTE");
				lblSiguiente.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblSiguiente.setBounds(416, 299, 78, 14);
				contentPane.add(lblSiguiente);
			}
			{
				lblModificar = new JLabel("INGRESAR");
				lblModificar.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblModificar.setBounds(221, 299, 78, 14);
				contentPane.add(lblModificar);
			}
			llenarComboRepartidor();
			llenarComboClie();
			llenarComboMenu();
			
			
		}
	}
	
	 String Fecha()
	 {
		 String fecha = (txtAño.getText()+"-"+txtMes.getText()+"-"+txtDia.getText());
		 return fecha;
	 }
	 public void llenarComboMenu(){
			
			ArrayList<Clase_Producto> lista=new ArrayList<Clase_Producto>();
			ArrayProducto m=new ArrayProducto();
			
			lista=m.listarProducto();
			
			Iterator<Clase_Producto> it=lista.iterator();
			int i=0;
			while(it.hasNext()){
				Object obj=it.next();
				Clase_Producto men=(Clase_Producto)obj;
				cmbMenu.addItem(men.getNombre());
				i++;
			}
	 }
	 

	 public void llenarComboRepartidor(){
			
		 ArrayList<Clase_Repartidor> lista=new ArrayList<Clase_Repartidor>();
			ArrayRepartidor m=new ArrayRepartidor();
			
			lista=m.listarRepartidor();
			
			Iterator<Clase_Repartidor> it=lista.iterator();
			int i=0;
			while(it.hasNext()){
				Object obj=it.next();
				Clase_Repartidor rep=(Clase_Repartidor)obj;
				cmbRepa.addItem(rep.getNombre());
				i++;

			}
	 }
	
	
   
	
	public void llenarComboClie(){
		
		ArrayList<cliente> lista=new ArrayList<cliente>();
		Arraycliente m=new Arraycliente();
		
		lista=m.listarcliente();
		
		Iterator<cliente> it=lista.iterator();
		int i=0;
		while(it.hasNext()){
			Object obj=it.next();
			cliente clie=(cliente)obj;
			cmbCliente.addItem(clie.getNombre());
			i++;
		}
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAtras) {
			do_btnAtras_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSiguente) {
			do_btnSiguente_actionPerformed(arg0);
		}
		if (arg0.getSource() == button_2) {
			do_button_2_actionPerformed(arg0);
		}
	}
	protected void do_button_2_actionPerformed(ActionEvent arg0) {
		
		Pedido ped = new Pedido(Integer.parseInt(txtIDPedido.getText()), Integer.parseInt(cmbCliente.getSelectedItem().toString()), Integer.parseInt(cmbMenu.getSelectedItem().toString()), Integer.parseInt(cmbRepa.getSelectedItem().toString()), Fecha(), cmbTipo.getSelectedItem().toString(),Double.parseDouble(txtIDPedido.getText()), cmbEstado.getSelectedItem().toString());
		ArrayPedido m = new ArrayPedido();
		m.insertar(ped);
		
	}
	protected void do_btnSiguente_actionPerformed(ActionEvent arg0) {
		
		Pedido_2 ped2 = new Pedido_2();
		ped2.setVisible(true);
		this.dispose();
		
	}
	protected void do_btnAtras_actionPerformed(ActionEvent arg0) {
		Menu m = new Menu();
		m.setVisible(true);
		dispose();
	}
}
