package co.com.soflow.vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Input {
	
	public  void inputi() {
		 JFrame frame = new JFrame();
		   Object result = JOptionPane.showInputDialog(frame, "Ingrese valor a convertir:");
		   
		 
		   if(result != null) {
			   Money money = new Money();
			   money.conversor();
			   
		   }else {
			   System.out.println("Fallas en al unidad 007");
		   }
		   

	}
	 
	   
}
