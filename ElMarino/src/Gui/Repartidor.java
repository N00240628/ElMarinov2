package Gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ArrayList.ArrayProducto;
import ArrayList.ArrayRepartidor;
import clase.Clase_Producto;
import clase.Clase_Repartidor;
import conexion.ConexiónMySQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Repartidor extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNom;
	private JTextField txtId;
	private JTextField txtApe;
	private JTextField txtDni;
	private JTextField txtTel;
	private JTable tableRepartidor;
	private JButton btnAgregar;
	private JButton btnListar;
	private JButton btnSiguiente;
	private JButton btnAtras;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblAgregar;
	private JLabel lblListar;
	private JPanel panel_1;
	private JLabel lblM;
	private JLabel label_4;
	private JLabel lblS;
	private JLabel lblE;
	private JLabel label_7;
	private JLabel lblO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Repartidor dialog = new Repartidor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Repartidor() {
		setBounds(100, 100, 525, 594);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 0, 509, 555);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("Id Repartidor : ");
				label.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label.setBounds(30, 111, 105, 14);
				panel.add(label);
			}
			{
				txtNom = new JTextField();
				txtNom.setColumns(10);
				txtNom.setBounds(183, 148, 86, 20);
				panel.add(txtNom);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(30, 307, 454, 151);
				panel.add(scrollPane);
				{
					tableRepartidor = new JTable();
					scrollPane.setViewportView(tableRepartidor);
				}
			}
			{
				JLabel label = new JLabel("Nombre : ");
				label.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label.setBounds(58, 154, 77, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Apellido : ");
				label.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label.setBounds(58, 194, 77, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("DNI: ");
				label.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label.setBounds(80, 236, 55, 14);
				panel.add(label);
			}
			{
				txtId = new JTextField();
				txtId.setColumns(10);
				txtId.setBounds(179, 105, 86, 20);
				panel.add(txtId);
			}
			{
				txtApe = new JTextField();
				txtApe.setColumns(10);
				txtApe.setBounds(183, 188, 86, 20);
				panel.add(txtApe);
			}
			{
				txtDni = new JTextField();
				txtDni.setColumns(10);
				txtDni.setBounds(183, 230, 86, 20);
				panel.add(txtDni);
			}
			{
				JLabel label = new JLabel("Telefono: ");
				label.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label.setBounds(53, 261, 82, 14);
				panel.add(label);
			}
			{
				txtTel = new JTextField();
				txtTel.setColumns(10);
				txtTel.setBounds(183, 261, 86, 20);
				panel.add(txtTel);
			}
			{
				btnAgregar = new JButton("");
				btnAgregar.setIcon(new ImageIcon(Repartidor.class.getResource("/imagen/icons8-agregar-propiedad-50.png")));
				btnAgregar.setFont(new Font("Times New Roman", Font.BOLD, 17));
				btnAgregar.addActionListener(this);
				btnAgregar.setBounds(297, 105, 77, 69);
				panel.add(btnAgregar);
			}
			{
				btnListar = new JButton("");
				btnListar.setIcon(new ImageIcon(Repartidor.class.getResource("/imagen/icons8-lista-50.png")));
				btnListar.setFont(new Font("Times New Roman", Font.BOLD, 17));
				btnListar.addActionListener(this);
				btnListar.setBounds(297, 213, 77, 59);
				panel.add(btnListar);
			}
			{
				btnSiguiente = new JButton("");
				btnSiguiente.setIcon(new ImageIcon(Repartidor.class.getResource("/imagen/icons8-siguiente-50.png")));
				btnSiguiente.addActionListener(this);
				btnSiguiente.setBounds(409, 469, 69, 59);
				panel.add(btnSiguiente);
			}
			{
				btnAtras = new JButton("");
				btnAtras.setIcon(new ImageIcon(Repartidor.class.getResource("/imagen/icons8-saltar-a-inicio-50.png")));
				btnAtras.addActionListener(this);
				btnAtras.setBounds(30, 469, 69, 59);
				panel.add(btnAtras);
			}
			{
				label_1 = new JLabel("SIGUIENTE");
				label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label_1.setBounds(409, 532, 78, 14);
				panel.add(label_1);
			}
			{
				label_2 = new JLabel("ATRAS");
				label_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label_2.setBounds(40, 532, 50, 14);
				panel.add(label_2);
			}
			{
				lblAgregar = new JLabel("AGREGAR");
				lblAgregar.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblAgregar.setBounds(308, 188, 67, 14);
				panel.add(lblAgregar);
			}
			{
				lblListar = new JLabel("LISTAR");
				lblListar.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblListar.setBounds(307, 283, 67, 14);
				panel.add(lblListar);
			}
			{
				panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBackground(new Color(0, 102, 153));
				panel_1.setBounds(0, 0, 509, 54);
				panel.add(panel_1);
				{
					lblM = new JLabel("M");
					lblM.setForeground(Color.WHITE);
					lblM.setFont(new Font("Segoe UI", Font.BOLD, 25));
					lblM.setBounds(165, 11, 24, 32);
					panel_1.add(lblM);
				}
				{
					label_4 = new JLabel("E");
					label_4.setForeground(Color.WHITE);
					label_4.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_4.setBounds(199, 11, 24, 32);
					panel_1.add(label_4);
				}
				{
					lblS = new JLabel("S");
					lblS.setForeground(Color.WHITE);
					lblS.setFont(new Font("Segoe UI", Font.BOLD, 25));
					lblS.setBounds(233, 11, 24, 32);
					panel_1.add(lblS);
				}
				{
					lblE = new JLabel("E");
					lblE.setForeground(Color.WHITE);
					lblE.setFont(new Font("Segoe UI", Font.BOLD, 25));
					lblE.setBounds(267, 11, 24, 32);
					panel_1.add(lblE);
				}
				{
					label_7 = new JLabel("R");
					label_7.setForeground(Color.WHITE);
					label_7.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_7.setBounds(301, 11, 24, 32);
					panel_1.add(label_7);
				}
				{
					lblO = new JLabel("O");
					lblO.setForeground(Color.WHITE);
					lblO.setFont(new Font("Segoe UI", Font.BOLD, 25));
					lblO.setBounds(335, 11, 24, 32);
					panel_1.add(lblO);
				}
			}
			Listar("");
		}
	}
	public void Listar(String nom){
		DefaultTableModel modelo=new DefaultTableModel();
		ArrayRepartidor R=new ArrayRepartidor();
		
		ArrayList<clase.Clase_Repartidor> lista=new ArrayList<clase.Clase_Repartidor>();
		if(nom.length()==0){
			lista=R.listarRepartidor();
		}
		else
			lista=R.ConsultarRepartidor(nom);
		modelo.setRowCount(lista.size());
		Iterator<clase.Clase_Repartidor> it=lista.iterator();
		modelo.addColumn("Id Repartidor");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Dni");
		modelo.addColumn("Telefono");
		int i=0;
		while (it.hasNext()) {
			Object obj=it.next();
			clase.Clase_Repartidor acce=(clase.Clase_Repartidor)obj;
			modelo.setValueAt(acce.getIdRepartidor(),i,0);
			modelo.setValueAt(acce.getNombre(),i,1);
			modelo.setValueAt(acce.getApellido(),i,2);
			modelo.setValueAt(acce.getDni(),i,3);
			modelo.setValueAt(acce.getTelefono(),i,4);
			i++;
		}
		tableRepartidor.setModel(modelo);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAtras) {
			do_btnAtras_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSiguiente) {
			do_btnSiguiente_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnListar) {
			do_btnListar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(arg0);
		}
	}
	public void Listar()
	{
		DefaultTableModel model=new DefaultTableModel();
		ArrayRepartidor rep = new ArrayRepartidor();
		ArrayList<Clase_Repartidor> lista=new ArrayList<Clase_Repartidor>();
		
		lista=rep.listarRepartidor();
		model.setRowCount(lista.size());
		Iterator it=lista.iterator();
		model.addColumn("IdRepartidor");
		model.addColumn("Nombre");
		model.addColumn("Apellido");
		model.addColumn("DNI");
		model.addColumn("Telefono");
		
		int i=0;
		
		while (it.hasNext()) {
			Object obj=it.next();
			Clase_Repartidor acceso=(Clase_Repartidor)obj;
			
			model.setValueAt(acceso.getIdRepartidor(),i,0);
			model.setValueAt(acceso.getNombre(),i,1);
			model.setValueAt(acceso.getApellido(),i,2);		
			model.setValueAt(acceso.getDni(),i,3);
			model.setValueAt(acceso.getTelefono(),i,4);
			i++;
		}
	        tableRepartidor.setModel(model);
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent arg0) {
		try {  
		     	int id = Integer.parseInt(txtId.getText());
		     	String Nombre = txtNom.getText();
		     	String Apellido = txtApe.getText();
		     	int dni = Integer.parseInt(txtDni.getText()) ;
		     	int Telefono = Integer.parseInt(txtTel.getText()) ;
				Clase_Repartidor repartidor = new Clase_Repartidor(id, Nombre, Apellido, dni, Telefono);
				ArrayRepartidor r = new ArrayRepartidor();
				r.insertarRepartidor(repartidor);
				Listar();
				Limpiar();
			 	JOptionPane.showMessageDialog(this, "Mesero Agregado correctamente");
			} catch (Exception e) {
				System.out.println("Error: "+e);
				
			} 
	}
	protected void do_btnListar_actionPerformed(ActionEvent arg0) {
		Listar();
		
	}
	protected void do_btnSiguiente_actionPerformed(ActionEvent arg0) {
		Consulta_Repartidor cn = new Consulta_Repartidor();
		cn.setVisible(true);
		dispose();
	}
	protected void do_btnAtras_actionPerformed(ActionEvent arg0) {
		Menu m  = new Menu();
		m.setVisible(true);
		dispose();
	}
	public void Limpiar()
	{
		txtId.setText("");
		txtNom.setText("");
		txtApe.setText("");
		txtDni.setText("");
		txtTel.setText("");
	}
}
