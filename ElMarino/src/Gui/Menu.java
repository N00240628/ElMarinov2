package Gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.Pedido;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Menu extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCliente;
	private JButton btnProducto;
	private JButton btnRepartidor;
	private JButton btnPedido;
	private JLabel lblCliente;
	private JLabel lblProducto;
	private JLabel lblRepartidor;
	private JLabel lblPedido;
	private JPanel panel;
	private JLabel lblM;
	private JLabel lblE;
	private JLabel lblN;
	private JLabel lblU;
	private JButton btnNewButton;
	private JLabel lblCreadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Menu dialog = new Menu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Menu() {
		setBounds(100, 100, 490, 488);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnCliente = new JButton("");
			btnCliente.setIcon(new ImageIcon(Menu.class.getResource("/imagen/icons8-cliente-64.png")));
			btnCliente.addActionListener(this);
			btnCliente.setBounds(80, 103, 89, 81);
			contentPanel.add(btnCliente);
		}
		{
			btnProducto = new JButton("");
			btnProducto.setIcon(new ImageIcon(Menu.class.getResource("/imagen/icons8-comida-100.png")));
			btnProducto.addActionListener(this);
			btnProducto.setBounds(80, 236, 89, 81);
			contentPanel.add(btnProducto);
		}
		{
			btnRepartidor = new JButton("");
			btnRepartidor.setIcon(new ImageIcon(Menu.class.getResource("/imagen/icons8--64.png")));
			btnRepartidor.addActionListener(this);
			btnRepartidor.setBounds(308, 103, 102, 81);
			contentPanel.add(btnRepartidor);
		}
		{
			btnPedido = new JButton("");
			btnPedido.setIcon(new ImageIcon(Menu.class.getResource("/imagen/icons8-pedido-en-l+\u00A1nea-64.png")));
			btnPedido.addActionListener(this);
			btnPedido.setBounds(308, 236, 102, 81);
			contentPanel.add(btnPedido);
		}
		{
			lblCliente = new JLabel("Cliente ");
			lblCliente.setBackground(new Color(51, 102, 153));
			lblCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblCliente.setBounds(97, 193, 60, 14);
			contentPanel.add(lblCliente);
		}
		{
			lblProducto = new JLabel("Producto");
			lblProducto.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblProducto.setBounds(90, 328, 60, 14);
			contentPanel.add(lblProducto);
		}
		{
			lblRepartidor = new JLabel("Mesero");
			lblRepartidor.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblRepartidor.setBounds(331, 195, 79, 14);
			contentPanel.add(lblRepartidor);
		}
		{
			lblPedido = new JLabel("Pedido");
			lblPedido.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblPedido.setBounds(331, 328, 51, 14);
			contentPanel.add(lblPedido);
		}
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(new Color(0, 102, 153));
			panel.setBounds(0, 0, 474, 49);
			contentPanel.add(panel);
			{
				lblM = new JLabel("M");
				lblM.setForeground(Color.WHITE);
				lblM.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblM.setBounds(175, 11, 24, 32);
				panel.add(lblM);
			}
			{
				lblE = new JLabel("E");
				lblE.setForeground(Color.WHITE);
				lblE.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblE.setBounds(209, 11, 24, 32);
				panel.add(lblE);
			}
			{
				lblN = new JLabel("N");
				lblN.setForeground(Color.WHITE);
				lblN.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblN.setBounds(243, 11, 24, 32);
				panel.add(lblN);
			}
			{
				lblU = new JLabel("U");
				lblU.setForeground(Color.WHITE);
				lblU.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblU.setBounds(277, 11, 24, 32);
				panel.add(lblU);
			}
		}
		{
			btnNewButton = new JButton("");
			btnNewButton.addActionListener(this);
			btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("/imagen/mesa.png")));
			btnNewButton.setBounds(385, 369, 45, 44);
			contentPanel.add(btnNewButton);
		}
		{
			lblCreadores = new JLabel("CREADORES");
			lblCreadores.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblCreadores.setBounds(372, 424, 102, 14);
			contentPanel.add(lblCreadores);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnPedido) {
			do_btnPedido_actionPerformed(e);
		}
		if (e.getSource() == btnProducto) {
			do_btnProducto_actionPerformed(e);
		}
		if (e.getSource() == btnRepartidor) {
			do_btnRepartidor_actionPerformed(e);
		}
		if (e.getSource() == btnCliente) {
			do_btnCliente_actionPerformed(e);
		}
	}
	protected void do_btnCliente_actionPerformed(ActionEvent e) {
     Cliente c = new Cliente();
     c.setVisible(true);
     dispose();
	}
	protected void do_btnRepartidor_actionPerformed(ActionEvent e) {
		Repartidor r = new Repartidor();
		r.setVisible(true);
		dispose();
	}
	protected void do_btnProducto_actionPerformed(ActionEvent e) {
		Producto p = new Producto();
		p.setVisible(true);
		dispose();
	}
	protected void do_btnPedido_actionPerformed(ActionEvent e) {
	  PED_1 p1 = new PED_1();
	  p1.setVisible(true);
	  dispose();
	}

	public Object getID_Producto() {
		// TODO Auto-generated method stub
		return null;
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Creadores c = new Creadores();
		c.setVisible(true);
		dispose();
	}
}
