package co.com.soflow.vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Message {

	public void mensaje() {
		System.out.println("terminar");
		Object mensaje_opcion= JOptionPane.showConfirmDialog(null, "¿ Quieres continuar ?"," Selecciona una opcion a convertir ",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		int mensaje= (Integer) mensaje_opcion;
		
		
		if (mensaje==0) {
			   //desea continuar
			SelecConv con = new SelecConv();
			con.menu2();
			
			
		}
		
		else if (mensaje==1) {
			//desea salir
			JOptionPane.showMessageDialog(null, "Programa Finalizado","Gracias ",JOptionPane.INFORMATION_MESSAGE);
			 
	    }
	 
	}
	}


