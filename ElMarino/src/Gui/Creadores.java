package Gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Creadores extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblRaulHuaman;
	private JLabel lblN_3;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Creadores dialog = new Creadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Creadores() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 660, 506);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Creadores.class.getResource("/imagen/Captura de pantalla 2023-07-06 155922.png")));
			lblNewLabel_1.setBounds(468, 31, 115, 127);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(Creadores.class.getResource("/imagen/Imagen de WhatsApp 2023-07-06 a las 17.43.34.jpg")));
			lblNewLabel_3.setBounds(442, 221, 141, 166);
			getContentPane().add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon(Creadores.class.getResource("/imagen/Imagen de WhatsApp 2023-07-06 a las 20.19.08.jpg")));
			lblNewLabel_4.setBounds(263, 37, 108, 129);
			getContentPane().add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("CRISTINA GUZM\u00C1N");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblNewLabel_5.setBounds(39, 169, 146, 14);
			getContentPane().add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("N00294276");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblNewLabel_6.setBounds(73, 184, 69, 14);
			getContentPane().add(lblNewLabel_6);
		}
		{
			JLabel lblAlexanderGuzmn = new JLabel("ALEXANDER GUZM\u00C1N");
			lblAlexanderGuzmn.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblAlexanderGuzmn.setBounds(468, 169, 141, 14);
			getContentPane().add(lblAlexanderGuzmn);
		}
		{
			JLabel lblCesarMartinez = new JLabel("CESAR MARTINEZ");
			lblCesarMartinez.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblCesarMartinez.setBounds(252, 169, 119, 14);
			getContentPane().add(lblCesarMartinez);
		}
		{
			JLabel lblPeterLazo = new JLabel("PETER LAZO");
			lblPeterLazo.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblPeterLazo.setBounds(77, 398, 108, 14);
			getContentPane().add(lblPeterLazo);
		}
		{
			JLabel lblGonzalo = new JLabel(" GONZALO  PRADA");
			lblGonzalo.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblGonzalo.setBounds(449, 398, 134, 14);
			getContentPane().add(lblGonzalo);
		}
		{
			JLabel label = new JLabel("N00294276");
			label.setFont(new Font("Times New Roman", Font.BOLD, 12));
			label.setBounds(511, 184, 69, 14);
			getContentPane().add(label);
		}
		{
			JLabel lblN_1 = new JLabel("N00188282");
			lblN_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblN_1.setBounds(87, 411, 69, 14);
			getContentPane().add(lblN_1);
		}
		{
			JLabel lblN_2 = new JLabel("N00271379");
			lblN_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblN_2.setBounds(475, 411, 69, 14);
			getContentPane().add(lblN_2);
		}
		{
			JLabel lblN = new JLabel("N00274012");
			lblN.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblN.setBounds(276, 185, 69, 14);
			getContentPane().add(lblN);
		}
		{
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(Creadores.class.getResource("/imagen/cris.jpg")));
			lblNewLabel.setBounds(29, 31, 128, 135);
			getContentPane().add(lblNewLabel);
		}
		{
			lblRaulHuaman = new JLabel("RAUL HUAMAN");
			lblRaulHuaman.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblRaulHuaman.setBounds(276, 398, 108, 14);
			getContentPane().add(lblRaulHuaman);
		}
		{
			lblN_3 = new JLabel("N00292366");
			lblN_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblN_3.setBounds(289, 411, 69, 14);
			getContentPane().add(lblN_3);
		}
		{
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setIcon(new ImageIcon(Creadores.class.getResource("/imagen/Imagen de WhatsApp 2023-07-06 a las 21.28.37 (1).jpg")));
			lblNewLabel_7.setBounds(244, 221, 140, 165);
			getContentPane().add(lblNewLabel_7);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(Creadores.class.getResource("/imagen/Imagen de WhatsApp 2023-07-06 a las 21.37.15 (1).jpg")));
			lblNewLabel_2.setBounds(29, 221, 162, 166);
			getContentPane().add(lblNewLabel_2);
		}
	}
}
