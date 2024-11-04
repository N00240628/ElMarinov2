package Gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Login extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnIngresar;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblA;
	private JLabel lblD;
	private JLabel lblM;
	private JLabel lblI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setTitle("LOGIN");
		setBounds(100, 100, 379, 294);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblUsuario = new JLabel("USUARIO : ");
			lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblUsuario.setBounds(48, 136, 70, 14);
			contentPanel.add(lblUsuario);
		}
		{
			lblContrasea = new JLabel("CONTRASE\u00D1A : ");
			lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblContrasea.setBounds(20, 161, 98, 14);
			contentPanel.add(lblContrasea);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setBounds(141, 136, 199, 20);
			contentPanel.add(txtUsuario);
			txtUsuario.setColumns(10);
		}
		{
			txtPassword = new JPasswordField();
			txtPassword.setBounds(142, 164, 198, 20);
			contentPanel.add(txtPassword);
		}
		{
			btnIngresar = new JButton("Ingresar");
			btnIngresar.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnIngresar.addActionListener(this);
			btnIngresar.setBounds(141, 202, 199, 23);
			contentPanel.add(btnIngresar);
		}
		{
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagen/icons8-cliente-100.png")));
			lblNewLabel.setBounds(195, 41, 106, 84);
			contentPanel.add(lblNewLabel);
		}
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(new Color(0, 102, 153));
			panel.setBounds(0, 0, 363, 30);
			contentPanel.add(panel);
			{
				lblA = new JLabel("A");
				lblA.setForeground(Color.WHITE);
				lblA.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblA.setBounds(119, 0, 24, 32);
				panel.add(lblA);
			}
			{
				lblD = new JLabel("D");
				lblD.setForeground(Color.WHITE);
				lblD.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblD.setBounds(153, 0, 24, 32);
				panel.add(lblD);
			}
			{
				lblM = new JLabel("M");
				lblM.setForeground(Color.WHITE);
				lblM.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblM.setBounds(187, 0, 24, 32);
				panel.add(lblM);
			}
			{
				lblI = new JLabel("I");
				lblI.setForeground(Color.WHITE);
				lblI.setFont(new Font("Segoe UI", Font.BOLD, 25));
				lblI.setBounds(221, 0, 24, 32);
				panel.add(lblI);
			}
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(arg0);
		}
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent arg0) {
		String user = txtUsuario.getText();
		int pass = Integer.parseInt(txtPassword.getText());
		
		if (user.equalsIgnoreCase("Admi123") && pass == 123){
			JOptionPane.showMessageDialog(this, "Bienvenido!");
			Menu p = new Menu();
			p.setVisible(true);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Contraseña Incorrecta :C");
			System.exit(0);
		}
		
		
	}
}
