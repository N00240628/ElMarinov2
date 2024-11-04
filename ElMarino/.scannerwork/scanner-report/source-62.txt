package Gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ArrayList.Arraycliente;
import clase.cliente;
import conexion.ConexiónMySQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Cliente extends JDialog implements ActionListener, MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btninsertar;
	private JButton btnbuscar;
	private JLabel lblNewLabel_6;
	private JScrollPane scrollPane;
	private JTable datacliente;
	private JButton btncerrar;
	private JButton btnatras;
	private JLabel lblNewLabel_7;
	private JTextArea txtcod;
	private JTextArea txtnombre;
	private JTextArea txtapellido;
	private JTextArea txtdireccion;
	private JTextArea txtcorreo;
	private JTextArea txttelefono;
	private JTextArea txtcontraseña;
	private JTextArea txtcod2;
	private JButton btnEditar;
	private JPanel panel;
	private JLabel lblC;
	private JLabel lblL;
	private JLabel lblI;
	private JLabel lblE;
	private JLabel lblN;
	private JLabel lblT;
	private JLabel label;
	private JLabel lblNewLabel_8;
	private JLabel lblEditar;
	private JLabel lblBuscar;
	private JLabel lblAtras;
	private JLabel lblCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cliente dialog = new Cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cliente() {
		setTitle("CLIENTE-DATOS PERSONALES");
		setBounds(100, 100, 715, 666);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Codigo");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel.setBounds(38, 106, 56, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Nombre");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_1.setBounds(38, 153, 70, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Apellido");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_2.setBounds(38, 205, 70, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Direccion");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_3.setBounds(38, 256, 70, 16);
			contentPanel.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Correo");
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_4.setBounds(286, 99, 56, 16);
			contentPanel.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("Telefono");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_5.setBounds(286, 146, 78, 16);
			contentPanel.add(lblNewLabel_5);
		}
		{
			btninsertar = new JButton("");
			btninsertar.setIcon(new ImageIcon(Cliente.class.getResource("/imagen/icons8-agregar-propiedad-50.png")));
			btninsertar.addActionListener(this);
			btninsertar.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btninsertar.setBounds(581, 78, 70, 59);
			contentPanel.add(btninsertar);
		}
		{
			btnbuscar = new JButton("");
			btnbuscar.setIcon(new ImageIcon(Cliente.class.getResource("/imagen/icons8-ver-archivo-50.png")));
			btnbuscar.addActionListener(this);
			btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnbuscar.setBounds(328, 258, 78, 59);
			contentPanel.add(btnbuscar);
		}
		{
			lblNewLabel_6 = new JLabel("Codigo");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_6.setBounds(449, 244, 70, 25);
			contentPanel.add(lblNewLabel_6);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setFont(new Font("Arial Black", Font.PLAIN, 13));
			scrollPane.setBounds(24, 351, 655, 170);
			contentPanel.add(scrollPane);
			{
				datacliente = new JTable();
				datacliente.addMouseListener(this);
				scrollPane.setViewportView(datacliente);
			}
		}
		{
			btncerrar = new JButton("");
			btncerrar.setIcon(new ImageIcon(Cliente.class.getResource("/imagen/icons8-eliminar-propiedad-50.png")));
			btncerrar.addActionListener(this);
			btncerrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btncerrar.setBounds(609, 531, 70, 55);
			contentPanel.add(btncerrar);
		}
		{
			btnatras = new JButton("");
			btnatras.addActionListener(this);
			btnatras.setIcon(new ImageIcon(Cliente.class.getResource("/imagen/icons8-saltar-a-inicio-50.png")));
			btnatras.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnatras.setBounds(24, 532, 61, 54);
			contentPanel.add(btnatras);
		}
		{
			lblNewLabel_7 = new JLabel("Contrase\u00F1a");
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_7.setBounds(276, 205, 88, 16);
			contentPanel.add(lblNewLabel_7);
		}
		{
			txtcod = new JTextArea();
			txtcod.setBounds(119, 97, 138, 31);
			contentPanel.add(txtcod);
		}
		{
			txtnombre = new JTextArea();
			txtnombre.setBounds(118, 144, 138, 31);
			contentPanel.add(txtnombre);
		}
		{
			txtapellido = new JTextArea();
			txtapellido.setBounds(119, 196, 138, 31);
			contentPanel.add(txtapellido);
		}
		{
			txtdireccion = new JTextArea();
			txtdireccion.setBounds(121, 241, 138, 31);
			contentPanel.add(txtdireccion);
		}
		{
			txtcorreo = new JTextArea();
			txtcorreo.setBounds(385, 91, 138, 31);
			contentPanel.add(txtcorreo);
		}
		{
			txttelefono = new JTextArea();
			txttelefono.setBounds(383, 138, 138, 31);
			contentPanel.add(txttelefono);
		}
		{
			txtcontraseña = new JTextArea();
			txtcontraseña.setBounds(385, 190, 138, 31);
			contentPanel.add(txtcontraseña);
		}
		{
			txtcod2 = new JTextArea();
			txtcod2.setBounds(416, 273, 138, 31);
			contentPanel.add(txtcod2);
		}
		{
			btnEditar = new JButton("");
			btnEditar.setIcon(new ImageIcon(Cliente.class.getResource("/imagen/icons8-editar-propiedad-50.png")));
			btnEditar.addActionListener(this);
			btnEditar.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnEditar.setBounds(581, 167, 70, 59);
			contentPanel.add(btnEditar);
		}
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(new Color(0, 102, 153));
			panel.setBounds(0, 0, 844, 54);
			contentPanel.add(panel);
			{
				lblC = new JLabel("C");
				lblC.setForeground(Color.WHITE);
				lblC.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblC.setBounds(20, 11, 24, 32);
				panel.add(lblC);
			}
			{
				lblL = new JLabel("L");
				lblL.setForeground(Color.WHITE);
				lblL.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblL.setBounds(54, 11, 24, 32);
				panel.add(lblL);
			}
			{
				lblI = new JLabel("I");
				lblI.setForeground(Color.WHITE);
				lblI.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblI.setBounds(88, 11, 24, 32);
				panel.add(lblI);
			}
			{
				lblE = new JLabel("E");
				lblE.setForeground(Color.WHITE);
				lblE.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblE.setBounds(122, 11, 24, 32);
				panel.add(lblE);
			}
			{
				lblN = new JLabel("N");
				lblN.setForeground(Color.WHITE);
				lblN.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblN.setBounds(156, 11, 24, 32);
				panel.add(lblN);
			}
			{
				lblT = new JLabel("T");
				lblT.setForeground(Color.WHITE);
				lblT.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblT.setBounds(190, 11, 24, 32);
				panel.add(lblT);
			}
			{
				label = new JLabel("E");
				label.setForeground(Color.WHITE);
				label.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label.setBounds(218, 11, 24, 32);
				panel.add(label);
			}
		}
		{
			lblNewLabel_8 = new JLabel("INSERTAR");
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel_8.setBounds(591, 148, 70, 14);
			contentPanel.add(lblNewLabel_8);
		}
		{
			lblEditar = new JLabel("EDITAR");
			lblEditar.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblEditar.setBounds(591, 232, 70, 14);
			contentPanel.add(lblEditar);
		}
		{
			lblBuscar = new JLabel("BUSCAR");
			lblBuscar.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblBuscar.setBounds(338, 328, 70, 14);
			contentPanel.add(lblBuscar);
		}
		{
			lblAtras = new JLabel("ATRAS");
			lblAtras.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblAtras.setBounds(34, 597, 50, 14);
			contentPanel.add(lblAtras);
		}
		{
			lblCerrar = new JLabel("CERRAR");
			lblCerrar.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblCerrar.setBounds(619, 597, 61, 14);
			contentPanel.add(lblCerrar);
		}
		Listar("");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnatras) {
			do_btnatras_actionPerformed(e);
		}
		if (e.getSource() == btnbuscar) {
			do_btnbuscar_actionPerformed(e);
		}
		if (e.getSource() == btncerrar) {
			do_btncerrar_actionPerformed(e);
		}
		if (e.getSource() == btninsertar) {
			do_btninsertar_actionPerformed(e);
		}
		if (e.getSource() == btnEditar) {
			do_btnEditar_actionPerformed(e);
		}
	}
	protected void do_btnEditar_actionPerformed(ActionEvent e) {
		try {
			cliente clie = new cliente(txtcod.getText(),txtnombre.getText(),txtapellido.getText(),txtdireccion.getText(),txtcorreo.getText(),(txttelefono.getText()),txtcontraseña.getText());;
			Arraycliente c = new Arraycliente();
			c.editar(clie);
			Listar("");
			Limpiar();
			JOptionPane.showMessageDialog(this, "Se edito el cliente");
		} catch (Exception E) {
			// TODO: handle exception
			
		JOptionPane.showMessageDialog(null, "Datos vacios");
		}
		Limpiar();
	}
	public void Listar(String nom){
		DefaultTableModel grilla=new DefaultTableModel();
		Arraycliente clie=new Arraycliente();
		ArrayList<cliente> lista=new ArrayList<cliente>();
		if(nom.length()==0)
			lista=clie.listarcliente();
		else
			lista=clie.consultarCliente(nom);
		grilla.setRowCount(lista.size());
		Iterator it=lista.iterator();
		grilla.addColumn("Codigo");
		grilla.addColumn("Nombre");
		grilla.addColumn("apellido");
		grilla.addColumn("direccion");
		grilla.addColumn("correo");
		grilla.addColumn("telefono");
		grilla.addColumn("contrase�a");
		
		int i=0;
		
		while (it.hasNext()) {
			Object obj=it.next();
			cliente acceso=(cliente)obj;
			
			grilla.setValueAt(acceso.getIdcliente(),i,0);
			grilla.setValueAt(acceso.getNombre(),i,1);
			grilla.setValueAt(acceso.getApellido(),i,2);		
			grilla.setValueAt(acceso.getDireccion(),i,3);
			grilla.setValueAt(acceso.getCorreo(),i,4);
			grilla.setValueAt(acceso.getTelefono(),i,5);
			grilla.setValueAt(acceso.getContraseña(), i,6);
			i++;
		}
	        datacliente.setModel(grilla);
		}
	public void listar2(String cod)
	{
		DefaultTableModel grilla=new DefaultTableModel();
		Arraycliente clie=new Arraycliente();
		ArrayList<cliente> lista=new ArrayList<cliente>();
		
		lista=clie.ConsultarCod(cod);
		grilla.setRowCount(lista.size());
		Iterator it=lista.iterator();
		grilla.addColumn("Codigo");
		grilla.addColumn("Nombre");
		grilla.addColumn("apellido");
		grilla.addColumn("direccion");
		grilla.addColumn("correo");
		grilla.addColumn("telefono");
		grilla.addColumn("contrase�a");
		
		int i=0;
		
		while (it.hasNext()) {
			Object obj=it.next();
			cliente acceso=(cliente)obj;
			
			grilla.setValueAt(acceso.getIdcliente(),i,0);
			grilla.setValueAt(acceso.getNombre(),i,1);
			grilla.setValueAt(acceso.getApellido(),i,2);		
			grilla.setValueAt(acceso.getDireccion(),i,3);
			grilla.setValueAt(acceso.getCorreo(),i,4);
			grilla.setValueAt(acceso.getTelefono(),i,5);
			grilla.setValueAt(acceso.getContraseña(), i,6);
			i++;
		}
	        datacliente.setModel(grilla);

	}
	void Limpiar(){
		txtcod.setText("");
		txtnombre.setText("");
		txtapellido.setText("");
		txtcorreo.setText("");
		txtcontraseña.setText("");
		txtdireccion.setText("");
		txttelefono.setText("");
	}
	
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == datacliente) {
			do_datacliente_mouseClicked(arg0);
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
	protected void do_datacliente_mouseClicked(MouseEvent arg0) {
		int fila=datacliente.getSelectedRow();
		txtcod.setText(String.valueOf(datacliente.getValueAt(fila, 0)));
		txtnombre.setText(String.valueOf(datacliente.getValueAt(fila, 1)));
		txtapellido.setText(String.valueOf(datacliente.getValueAt(fila, 2)));
		txtdireccion.setText(String.valueOf(datacliente.getValueAt(fila, 3)));
		txtcorreo.setText(String.valueOf(datacliente.getValueAt(fila, 4)));
		txttelefono.setText(String.valueOf(datacliente.getValueAt(fila, 5)));
		txtcontraseña.setText(String.valueOf(datacliente.getValueAt(fila, 6)));
	}
	protected void do_btninsertar_actionPerformed(ActionEvent e) {
		try {
			cliente clie = new cliente(txtcod.getText(),txtnombre.getText(),txtapellido.getText(),txtdireccion.getText(),txtcorreo.getText(),txttelefono.getText(),txtcontraseña.getText());
			Arraycliente c = new Arraycliente();
			c.insertar(clie);
			Listar("");
			Limpiar();
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Datos vacios");
		}
	}
	
	protected void do_btncerrar_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void do_btnbuscar_actionPerformed(ActionEvent e) {
        String codigo=txtcod2.getText();
		txtcod2.setText(codigo);
		listar2(codigo);
		
	}
	protected void do_btnatras_actionPerformed(ActionEvent e) {
		Menu m = new Menu();
		m.setVisible(true);
		dispose();
	}
}
