package ConvertidorTemperatura;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.com.soflow.vista.Menu2;
import co.com.soflow.vista.Message;
import co.com.soflow.vista.Money;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConvertidorTemperatura1 {
	
	
	public void convertirTemp() {

		//Ingreso de temperatura
		Object [] Temperatura={"De Celsius a Kelvin ","De Kelvin a Celsius","De Celsius a Grado Fahrenheit","De Fahrenheit a Grado Celsius","De Fahrenheit a Grado Kelvin"}; 
		Object opciones_temperatura = JOptionPane.showInputDialog(null,"Seleccione conversion", "Menu",JOptionPane.QUESTION_MESSAGE,null,Temperatura, Temperatura[0]);
		String SeleccionTemperatura= (String)opciones_temperatura;
		
		if (SeleccionTemperatura == null) {
			Message mensaje_final= new Message();
			mensaje_final.mensaje();
		
			System.exit(0);
		}
		

		try {
			//ingreso de valores para la conversion 
			String grados_Inicial=JOptionPane.showInputDialog("Ingrese los grados a  convertir \n Opcion Seleccionada : "+ opciones_temperatura);
			double Cantiad_grados=Double.parseDouble (grados_Inicial);
			
			//Conversion en funcionamiento 
			ConvertidorTemperatura1 operacion= new ConvertidorTemperatura1();
			operacion.resultado_conversion(grados_Inicial,Cantiad_grados);
		}
		catch(NumberFormatException exception) {
			JOptionPane.showMessageDialog(null,"no valido ","Error",JOptionPane.ERROR_MESSAGE);
			Menu2 menu2= new Menu2();
			

			
			
		
		}
		
	}
	
public void resultado_conversion(String tipoConvercion,double cantidadGrados) {
		
		
		double ConversionTotal=0;
		
		switch (tipoConvercion) {
		
			case "De Celsius a Kelvin ":
				
				ConversionTotal=cantidadGrados+273;
				break;
				
			case "De Celsius a Grado Fahrenheit":
				
				ConversionTotal=(1.8*cantidadGrados)+32; 
				break;
				
			case "De Fahrenheit a Grado Celsius":
				
				ConversionTotal=(cantidadGrados-32)/1.8; 
				break;
				
			case "De Kelvin a Celsius":
				ConversionTotal=cantidadGrados-273; 
				break;
				
			case "De Fahrenheit a Grado Kelvin":
				
				 ConversionTotal=((cantidadGrados-32)/1.8)+273; 
				break;
					
			
			default:
				break; 
				
				
			
		}
		

		//show Conversion
		JOptionPane.showMessageDialog(null,"Resultado de los grados de conversion: "+ tipoConvercion+ " es : "+ ConversionTotal);
		
		//SAlta al mensaje final 
		
		Message mensaje_final= new Message();
		mensaje_final.mensaje();
		
		
	}
}
