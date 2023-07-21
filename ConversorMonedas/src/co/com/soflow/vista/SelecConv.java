package co.com.soflow.vista;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class SelecConv {

	public void menu2() {
		JDialog.setDefaultLookAndFeelDecorated(true);// grafica de puntitos
    	Object[] selectionValues = {"Conversor de Monedas","Conversor de temperatura"};
    	String initialSele = "Conversor de Monedas";
    	 Object selection = JOptionPane.showInputDialog(null, "Selecciona tu opcion a convertir?",
    		        "Menu", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSele);
    	 
    	 
    		  if(selection == selectionValues[0]){
    			Input input = new  Input();
    			input.inputi();
    		  }else {
    			  System.out.println("murio");
    		  }
    }
	}

