package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Ingresar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnIngresar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingresar frame = new Ingresar();
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
	public Ingresar() {
		setTitle("INGRESAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnIngresar = new JButton("Ingresar");
			btnIngresar.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnIngresar.addActionListener(this);
			btnIngresar.setBounds(160, 333, 189, 41);
			contentPane.add(btnIngresar);
		}
		{
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Ingresar.class.getResource("/imagen/Logo para marisqueria moderno naranja.png")));
			lblNewLabel.setBounds(0, 0, 494, 399);
			contentPane.add(lblNewLabel);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(arg0);
		}
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent arg0) {
		Login l = new Login();
		l.setVisible(true);
		dispose();
	}
}
