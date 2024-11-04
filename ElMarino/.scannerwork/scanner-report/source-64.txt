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

public class Consulta_Repartidor extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTextField txttBuscar;
	private JLabel lblBuscar;
	private JTable tableBuscar;
	private JButton btnBuscar;
	private JButton btnRetroceser;
	private JLabel label;
	private JLabel label_1;
	private JPanel panel;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consulta_Repartidor dialog = new Consulta_Repartidor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consulta_Repartidor() {
		setTitle("Consulta Repartidor");
		setBounds(100, 100, 450, 409);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 152, 405, 121);
			contentPanel.add(scrollPane);
			{
				tableBuscar = new JTable();
				scrollPane.setViewportView(tableBuscar);
			}
		}
		{
			txttBuscar = new JTextField();
			txttBuscar.setColumns(10);
			txttBuscar.setBounds(109, 94, 187, 22);
			contentPanel.add(txttBuscar);
		}
		{
			lblBuscar = new JLabel("Buscar: ");
			lblBuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblBuscar.setBounds(30, 96, 70, 16);
			contentPanel.add(lblBuscar);
		}
		{
			btnBuscar = new JButton("");
			btnBuscar.setIcon(new ImageIcon(Consulta_Repartidor.class.getResource("/imagen/icons8-ver-archivo-50.png")));
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(355, 65, 60, 50);
			contentPanel.add(btnBuscar);
		}
		{
			btnRetroceser = new JButton("");
			btnRetroceser.setIcon(new ImageIcon(Consulta_Repartidor.class.getResource("/imagen/icons8-saltar-a-inicio-50.png")));
			btnRetroceser.addActionListener(this);
			btnRetroceser.setBounds(343, 284, 72, 61);
			contentPanel.add(btnRetroceser);
		}
		{
			label = new JLabel("BUSCAR");
			label.setFont(new Font("Times New Roman", Font.BOLD, 13));
			label.setBounds(355, 126, 69, 14);
			contentPanel.add(label);
		}
		{
			label_1 = new JLabel("ATRAS");
			label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
			label_1.setBounds(355, 345, 50, 14);
			contentPanel.add(label_1);
		}
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(new Color(0, 102, 153));
			panel.setBounds(0, 0, 434, 54);
			contentPanel.add(panel);
			{
				label_2 = new JLabel("M");
				label_2.setForeground(Color.WHITE);
				label_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label_2.setBounds(122, 11, 24, 32);
				panel.add(label_2);
			}
			{
				label_3 = new JLabel("E");
				label_3.setForeground(Color.WHITE);
				label_3.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label_3.setBounds(156, 11, 24, 32);
				panel.add(label_3);
			}
			{
				label_4 = new JLabel("S");
				label_4.setForeground(Color.WHITE);
				label_4.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label_4.setBounds(190, 11, 24, 32);
				panel.add(label_4);
			}
			{
				label_5 = new JLabel("E");
				label_5.setForeground(Color.WHITE);
				label_5.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label_5.setBounds(224, 11, 24, 32);
				panel.add(label_5);
			}
			{
				label_6 = new JLabel("R");
				label_6.setForeground(Color.WHITE);
				label_6.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label_6.setBounds(258, 11, 24, 32);
				panel.add(label_6);
			}
			{
				label_7 = new JLabel("O");
				label_7.setForeground(Color.WHITE);
				label_7.setFont(new Font("Segoe UI", Font.BOLD, 25));
				label_7.setBounds(292, 11, 24, 32);
				panel.add(label_7);
			}
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
		String sql = "select IdRepartidor,CONCAT(Nombre,' ',Apellido) AS Nombres, DNI, Telefono from REPARTIDOR where CONCAT(IdRepartidor,' ',Nombre,' ',Apellido) like '%"+nombre +"%'";
		java.sql.Statement st;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("IdRepartidor");
		model.addColumn("Nombres");
		model.addColumn("DNI");
		model.addColumn("Telefono");
		tableBuscar.setModel(model);
		
		tableBuscar.setModel(model);
		String[] dato = new String[4];
		try {
			st= Conexion.createStatement();
			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
				dato[0] = result.getString(1);
				dato[1] = result.getString(2);
				dato[2] = result.getString(3);
				dato[3] = result.getString(4);
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
