package Gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import conexion.ConexiónMySQL;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Consulta_Producto extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTextField txttBuscar;
	private JLabel lblBuscar;
	private JTable tableBuscar;
	private JButton btnBuscar;
	private JButton btnRetroceser;
	private JPanel panel;
	private JLabel label;
	private JLabel lblR;
	private JLabel lblO;
	private JLabel lblD;
	private JLabel lblU;
	private JLabel lblC;
	private JLabel lblT;
	private JLabel lblO_1;
	private JLabel label_1;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consulta_Producto dialog = new Consulta_Producto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consulta_Producto() {
		setTitle("Consultar Producto");
		setBounds(100, 100, 450, 428);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 151, 405, 121);
			contentPanel.add(scrollPane);
			{
				tableBuscar = new JTable();
				scrollPane.setViewportView(tableBuscar);
			}
		}
		{
			txttBuscar = new JTextField();
			txttBuscar.setColumns(10);
			txttBuscar.setBounds(117, 78, 195, 22);
			contentPanel.add(txttBuscar);
		}
		{
			lblBuscar = new JLabel("Buscar:");
			lblBuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblBuscar.setBounds(37, 80, 70, 16);
			contentPanel.add(lblBuscar);
		}
		{
			btnBuscar = new JButton("");
			btnBuscar.setIcon(new ImageIcon(Consulta_Producto.class.getResource("/imagen/icons8-ver-archivo-50.png")));
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(358, 63, 57, 59);
			contentPanel.add(btnBuscar);
		}
		{
			btnRetroceser = new JButton("");
			btnRetroceser.setIcon(new ImageIcon(Consulta_Producto.class.getResource("/imagen/icons8-saltar-a-inicio-50.png")));
			btnRetroceser.addActionListener(this);
			btnRetroceser.setBounds(358, 294, 70, 59);
			contentPanel.add(btnRetroceser);
		}
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(new Color(0, 102, 153));
			panel.setBounds(0, 0, 434, 54);
			contentPanel.add(panel);
			{
				label = new JLabel("P");
				label.setForeground(Color.WHITE);
				label.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label.setBounds(20, 11, 24, 32);
				panel.add(label);
			}
			{
				lblR = new JLabel("R");
				lblR.setForeground(Color.WHITE);
				lblR.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblR.setBounds(54, 11, 24, 32);
				panel.add(lblR);
			}
			{
				lblO = new JLabel("O");
				lblO.setForeground(Color.WHITE);
				lblO.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblO.setBounds(88, 11, 24, 32);
				panel.add(lblO);
			}
			{
				lblD = new JLabel("D");
				lblD.setForeground(Color.WHITE);
				lblD.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblD.setBounds(122, 11, 24, 32);
				panel.add(lblD);
			}
			{
				lblU = new JLabel("U");
				lblU.setForeground(Color.WHITE);
				lblU.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblU.setBounds(156, 11, 24, 32);
				panel.add(lblU);
			}
			{
				lblC = new JLabel("C");
				lblC.setForeground(Color.WHITE);
				lblC.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblC.setBounds(190, 11, 24, 32);
				panel.add(lblC);
			}
			{
				lblT = new JLabel("T");
				lblT.setForeground(Color.WHITE);
				lblT.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblT.setBounds(224, 11, 24, 32);
				panel.add(lblT);
			}
			{
				lblO_1 = new JLabel("O");
				lblO_1.setForeground(Color.WHITE);
				lblO_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblO_1.setBounds(258, 11, 24, 32);
				panel.add(lblO_1);
			}
		}
		{
			label_1 = new JLabel("BUSCAR");
			label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
			label_1.setBounds(358, 126, 70, 14);
			contentPanel.add(label_1);
		}
		{
			label_2 = new JLabel("ATRAS");
			label_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
			label_2.setBounds(368, 364, 50, 14);
			contentPanel.add(label_2);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRetroceser) {
			do_btnRetroceser_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		String nombre = txttBuscar.getText();
		Connection Conexion = ConexiónMySQL.getConexión();
		String sql = "select IdProducto,CONCAT(Nombre) AS Nombres, Descripcion, Precio,Disponibilidad  from PRODUCTO  where CONCAT(IdProducto,' ',Nombre,' ',Descripcion,'',Disponibilidad) like '%"+nombre +"%'";
		java.sql.Statement st;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdProducto");
		model.addColumn("Nombre");
		model.addColumn("Descripcion");
		model.addColumn("Precio");
		model.addColumn("Disponibilidad");
		tableBuscar.setModel(model);
		
		tableBuscar.setModel(model);
		String[] dato = new String[5];
		try {
			st= Conexion.createStatement();
			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
				dato[0] = result.getString(1);
				dato[1] = result.getString(2);
				dato[2] = result.getString(3);
				dato[3] = result.getString(4);
				dato[4] = result.getString(5);
				model.addRow(dato);
			}
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	}
	protected void do_btnRetroceser_actionPerformed(ActionEvent e) {
		Repartidor r = new Repartidor();
		r.setVisible(true);
		dispose();
	}
}
