package co.com.soflow.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConvertidorTemperatura.ConvertidorTemperatura1;

import java.awt.FlowLayout;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.WindowStateListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu2 frame = new Menu2();
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
	public Menu2() {
		setTitle("Menu Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 303);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel JImagen = new JLabel("");
		JImagen.setIcon(new ImageIcon("C:\\Users\\David carrillo\\eclipse-workspace\\ConversorMonedas\\imagenes\\convertidor.png"));
		JImagen.setBounds(32, 72, 153, 128);
		contentPane.add(JImagen);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Temperatura", "Conversor de Dinero "}));
		comboBox.setBounds(195, 85, 209, 22);
		contentPane.add(comboBox);
		
		String img;
		img = comboBox.getSelectedItem().toString();
		
		if(img.equalsIgnoreCase( "Conversor de Dinero ") ) {
		//	Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("C:\\Users\\David carrillo\\Pictures\\fot_hv.jpeg")).getImage()
			//		.getScaledInstance(JImagen.getWidth(), JImagen.getHeight(), 0));
			
			//JImagen.setIcon(miIcono);
			JImagen.setIcon(new ImageIcon("C:\\Users\\David carrillo\\Pictures\\fot_hv.jpeg"));
		}else{
		}
		
		JButton btnNewButton = new JButton("Aceptar ");
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				String item;
				item =comboBox.getSelectedItem().toString();
				
				if (item.equalsIgnoreCase( "Conversor de Dinero ")) {
					 Money money = new Money();
					   money.conversor();
					   
	    			System.exit(WIDTH);
					
				
	    			
				}else if(item.equalsIgnoreCase( "Conversor de Temperatura")) {
					ConvertidorTemperatura1 conv = new ConvertidorTemperatura1();
					conv.convertirTemp();
				
				}
			
			}
		});
		btnNewButton.setBounds(110, 222, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(250, 222, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Selecciona tu tipo Conversion");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(164, 11, 225, 14);
		contentPane.add(lblNewLabel);

		
	}
}
