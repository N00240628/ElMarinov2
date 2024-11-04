package Gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ArrayList.ArrayProducto;
import ArrayList.ArrayRepartidor;
import ArrayList.Arraycliente;
import clase.Clase_Producto;
import clase.cliente;
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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Producto extends JDialog implements ActionListener, MouseListener {
	private JPanel panel;
	private JLabel lblIdProducto;
	private JTextField txtNom;
	private JScrollPane scrollPane;
	private JLabel label_1;
	private JLabel lblDescripcion;
	private JLabel lblPrecio;
	private JTextField txtId;
	private JTextField txtDesc;
	private JTextField txtPre;
	private JLabel lblDisponibilidad;
	private JTextField txtDisp;
	private JButton btnAgregar;
	private JButton btnListar;
	private JButton btnAtras;
	private JButton btnSiguiente;
	private JTable table;
	private JLabel label;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JPanel panel_1;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Producto dialog = new Producto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Producto() {
		setBounds(100, 100, 505, 593);
		getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 0, 489, 554);
			getContentPane().add(panel);
			{
				lblIdProducto = new JLabel("Id Producto: ");
				lblIdProducto.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblIdProducto.setBounds(64, 92, 90, 14);
				panel.add(lblIdProducto);
			}
			{
				txtNom = new JTextField();
				txtNom.setColumns(10);
				txtNom.setBounds(179, 129, 138, 20);
				panel.add(txtNom);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.addMouseListener(this);
				scrollPane.setBounds(20, 335, 454, 124);
				panel.add(scrollPane);
				{
					table = new JTable();
					scrollPane.setViewportView(table);
				}
			}
			{
				label_1 = new JLabel("Nombre : ");
				label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label_1.setBounds(87, 135, 67, 14);
				panel.add(label_1);
			}
			{
				lblDescripcion = new JLabel("Descripcion : ");
				lblDescripcion.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblDescripcion.setBounds(64, 175, 90, 14);
				panel.add(lblDescripcion);
			}
			{
				lblPrecio = new JLabel("Precio : ");
				lblPrecio.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblPrecio.setBounds(87, 217, 67, 14);
				panel.add(lblPrecio);
			}
			{
				txtId = new JTextField();
				txtId.setColumns(10);
				txtId.setBounds(175, 86, 142, 20);
				panel.add(txtId);
			}
			{
				txtDesc = new JTextField();
				txtDesc.setColumns(10);
				txtDesc.setBounds(179, 169, 138, 20);
				panel.add(txtDesc);
			}
			{
				txtPre = new JTextField();
				txtPre.setColumns(10);
				txtPre.setBounds(179, 211, 138, 20);
				panel.add(txtPre);
			}
			{
				lblDisponibilidad = new JLabel("Disponibilidad : ");
				lblDisponibilidad.setFont(new Font("Times New Roman", Font.BOLD, 13));
				lblDisponibilidad.setBounds(52, 263, 102, 14);
				panel.add(lblDisponibilidad);
			}
			{
				txtDisp = new JTextField();
				txtDisp.setColumns(10);
				txtDisp.setBounds(179, 257, 138, 20);
				panel.add(txtDisp);
			}
			{
				btnAgregar = new JButton("");
				btnAgregar.setIcon(new ImageIcon(Producto.class.getResource("/imagen/icons8-agregar-propiedad-50.png")));
				btnAgregar.addActionListener(this);
				btnAgregar.setBounds(381, 92, 69, 58);
				panel.add(btnAgregar);
			}
			{
				btnListar = new JButton("");
				btnListar.setIcon(new ImageIcon(Producto.class.getResource("/imagen/icons8-lista-50.png")));
				btnListar.addActionListener(this);
				btnListar.setBounds(381, 197, 69, 58);
				panel.add(btnListar);
			}
			{
				btnAtras = new JButton("");
				btnAtras.addActionListener(this);
				btnAtras.setIcon(new ImageIcon(Producto.class.getResource("/imagen/icons8-saltar-a-inicio-50.png")));
				btnAtras.setBounds(23, 470, 69, 58);
				panel.add(btnAtras);
			}
			{
				btnSiguiente = new JButton("");
				btnSiguiente.setIcon(new ImageIcon(Producto.class.getResource("/imagen/icons8-siguiente-50.png")));
				btnSiguiente.addActionListener(this);
				btnSiguiente.setBounds(405, 470, 69, 58);
				panel.add(btnSiguiente);
			}
			{
				label = new JLabel("SIGUIENTE");
				label.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label.setBounds(411, 529, 78, 14);
				panel.add(label);
			}
			{
				label_2 = new JLabel("ATRAS");
				label_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label_2.setBounds(42, 529, 50, 14);
				panel.add(label_2);
			}
			{
				label_3 = new JLabel("AGREGAR");
				label_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label_3.setBounds(381, 161, 67, 14);
				panel.add(label_3);
			}
			{
				label_4 = new JLabel("LISTAR");
				label_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
				label_4.setBounds(397, 263, 67, 14);
				panel.add(label_4);
			}
			{
				panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBackground(new Color(0, 102, 153));
				panel_1.setBounds(0, 0, 489, 54);
				panel.add(panel_1);
				{
					label_5 = new JLabel("P");
					label_5.setForeground(Color.WHITE);
					label_5.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_5.setBounds(110, 11, 24, 32);
					panel_1.add(label_5);
				}
				{
					label_6 = new JLabel("R");
					label_6.setForeground(Color.WHITE);
					label_6.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_6.setBounds(144, 11, 24, 32);
					panel_1.add(label_6);
				}
				{
					label_7 = new JLabel("O");
					label_7.setForeground(Color.WHITE);
					label_7.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_7.setBounds(178, 11, 24, 32);
					panel_1.add(label_7);
				}
				{
					label_8 = new JLabel("D");
					label_8.setForeground(Color.WHITE);
					label_8.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_8.setBounds(212, 11, 24, 32);
					panel_1.add(label_8);
				}
				{
					label_9 = new JLabel("U");
					label_9.setForeground(Color.WHITE);
					label_9.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_9.setBounds(246, 11, 24, 32);
					panel_1.add(label_9);
				}
				{
					label_10 = new JLabel("C");
					label_10.setForeground(Color.WHITE);
					label_10.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_10.setBounds(280, 11, 24, 32);
					panel_1.add(label_10);
				}
				{
					label_11 = new JLabel("T");
					label_11.setForeground(Color.WHITE);
					label_11.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_11.setBounds(314, 11, 24, 32);
					panel_1.add(label_11);
				}
				{
					label_12 = new JLabel("O");
					label_12.setForeground(Color.WHITE);
					label_12.setFont(new Font("Segoe UI", Font.BOLD, 25));
					label_12.setBounds(348, 11, 24, 32);
					panel_1.add(label_12);
				}
			}
			Listar2("");
		}
	}
	
	public void Listar2(String nom){
		DefaultTableModel modelo=new DefaultTableModel();
		ArrayProducto R=new ArrayProducto();
		
		ArrayList<Clase_Producto> lista=new ArrayList<clase.Clase_Producto>();
		if(nom.length()==0){
			lista=R.listarProducto();
		}
		else
			lista=R.listarProducto();
		modelo.setRowCount(lista.size());
		Iterator<Clase_Producto> it=lista.iterator();
		modelo.addColumn("Id Producto");
		modelo.addColumn("Nombre");
		modelo.addColumn("Descripci�n");
		modelo.addColumn("Precio");
		modelo.addColumn("Disponibilidad");
		int i=0;
		while (it.hasNext()) {
			Object obj=it.next();
			clase.Clase_Producto acce=(clase.Clase_Producto)obj;
			modelo.setValueAt(acce.getIdProducto(),i,0);
			modelo.setValueAt(acce.getNombre(),i,1);
			modelo.setValueAt(acce.getDescripcion(),i,2);
			modelo.setValueAt(acce.getPrecio(),i,3);
			modelo.setValueAt(acce.getDisponibilidad(),i,4);
			i++;
		}
		table.setModel(modelo);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAtras) {
			do_btnAtras_actionPerformed(e);
		}
		if (e.getSource() == btnSiguiente) {
			do_btnSiguiente_actionPerformed(e);
		}
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == btnListar) {
			do_btnListar_actionPerformed(e);
		}
		
	}
	protected void do_btnListar_actionPerformed(ActionEvent e) {
		Listar();
	}
	
	public void Listar(){
		DefaultTableModel model=new DefaultTableModel();
		ArrayProducto pro = new ArrayProducto();
		ArrayList<Clase_Producto> lista=new ArrayList<Clase_Producto>();
		
		lista=pro.listarProducto();
		model.setRowCount(lista.size());
		Iterator it=lista.iterator();
		model.addColumn("Id Producto");
		model.addColumn("Nombre");
		model.addColumn("Descripci�n");
		model.addColumn("Precio");
		model.addColumn("Disponibilidad");
		
		int i=0;
		
		while (it.hasNext()) {
			Object obj=it.next();
			Clase_Producto acceso=(Clase_Producto)obj;
			
			model.setValueAt(acceso.getIdProducto(),i,0);
			model.setValueAt(acceso.getNombre(),i,1);
			model.setValueAt(acceso.getDescripcion(),i,2);		
			model.setValueAt(acceso.getPrecio(),i,3);
			model.setValueAt(acceso.getDisponibilidad(),i,4);
			i++;
		}
	        table.setModel(model);
		}
	void Limpiar()
	{
		txtId.setText("");
		txtNom.setText("");
		txtDesc.setText("");
		txtPre.setText("");
		txtDisp.setText("");
	}
	
	
	
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		try {  
				
				int id = Integer.parseInt(txtId.getText());
				String nom = txtNom.getText();
				String descripcion = txtDesc.getText();
				int prec =  Integer.parseInt(txtPre.getText());
				int dispo = Integer.parseInt(txtDisp.getText());
				Clase_Producto producto = new Clase_Producto(id,nom,descripcion,prec,dispo);
				ArrayProducto p = new ArrayProducto();
				p.insertarProducto(producto);
				Listar();
				Limpiar();
				JOptionPane.showMessageDialog(this, "Producto Agregado correctamente");
		    
			} catch (Exception ex) {
				System.out.println("Error: "+ex);
			}
				
			} 
	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
			try {
				Clase_Producto pro = new Clase_Producto(Integer.parseInt(txtId.getText()),txtNom.getText(),txtDesc.getText(),Double.parseDouble(txtPre.getText()),Integer.parseInt(txtDisp.getText()));
				ArrayProducto m = new ArrayProducto();
				m.editar(pro);
				Listar2("");
				JOptionPane.showMessageDialog(this, "Producto Modificado correctamente");
			} catch (Exception ex) {
				System.out.println("Error: "+ ex);
				
	}
	}
	protected void do_btnSiguiente_actionPerformed(ActionEvent e) {
		Consulta_Producto cn = new Consulta_Producto();
		cn.setVisible(true);
		dispose();
	}
	protected void do_btnAtras_actionPerformed(ActionEvent e) {
		Menu m = new Menu();
		m.setVisible(true);
		dispose();
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == scrollPane) {
			do_scrollPane_mouseClicked(arg0);
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
	protected void do_scrollPane_mouseClicked(MouseEvent arg0) {
		int fila=table.getSelectedRow();
		txtId.setText(String.valueOf(table.getValueAt(fila, 0)));
		txtNom.setText(String.valueOf(table.getValueAt(fila, 0)));
		txtDesc.setText(String.valueOf(table.getValueAt(fila,0)));
		txtPre.setText(String.valueOf(table.getValueAt(fila,0)));
		txtDisp.setText(String.valueOf(table.getValueAt(fila,0)));
		
	}
	}
