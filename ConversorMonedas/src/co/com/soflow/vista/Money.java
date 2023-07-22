package co.com.soflow.vista;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import co.com.soflow.modelo.Operation;






public class Money {
//JDialog.setDefaultLookAndFeelDecorated(true);// grafica de puntitos
	
	public void conversor() {
		Object [] selectionValues={"De Pesos(COP) a Euro","De Pesos (COP) a Dolar","De Pesos (COP) a LibraEsterlina",
				"De Pesos (COP) a yenJapones(JPY)","De pesos (COP) a WonSurcoreano(KRW)","De Dolar a Pesos(COP)",
				"De Dolar(EUR) a Pesos(COP)","De Euro  a Pesos","De LibraEsterlina a Pesos(COP)","De WonSurcoreano (KRW) a Pesos(COP)"}; 
				 Object selection = JOptionPane.showInputDialog(null, "Selecciona tu opcion moneda a convertir",
			        "Seleccion de conversion", JOptionPane.QUESTION_MESSAGE, null, selectionValues, selectionValues[0]);
			String Moneda = (String)selection;
		 if(selection == null) {
			   Message Mes = new Message();
			   Mes.mensaje();
			   System.exit(0);
		   }
		 
		 try {
			 String CantidadDinero = JOptionPane.showInputDialog("Ingrese la cantidad de dinero "
			 		+ "Desea convertir \n Opcion Moneda: "+ Moneda);
				Money money = new Money();
				   money.resultado_conversion(Moneda, CantidadDinero);

			if(CantidadDinero == null || CantidadDinero == "") {
				System.out.println("error, ingresos erroneos");
			}
		} 
		 catch(NumberFormatException | NullPointerException exception) {
			JOptionPane.showMessageDialog(null,"Valor no valido","Error",JOptionPane.ERROR_MESSAGE);
			Money money = new Money();
			   money.conversor();


	}
			 
	}
public void resultado_conversion(String tipoConvercion, String cantidaDinero) {
		
		String DAtos[];
		DAtos= new String[4];
		
		String pasar_De="",pasar_a = "";
	
		switch (tipoConvercion) {
			case "De Pesos(COP) a Euro":
				pasar_De="COP";
				pasar_a="EUR";
				
				break;
				
			case "De Pesos (COP) a Dolar":
				pasar_De="COP";
				pasar_a="USD";
				break;
				
				
				
			case "De Pesos (COP) a LibraEsterlina":
				pasar_De="COP";
				pasar_a="GBP";
				break;
				
			case "De Pesos (COP) a yenJapones(JPY)":
				pasar_De="COP";
				pasar_a="JPY";
				break;
				
			case "De pesos (COP) a WonSurcoreano (KRW)":
				pasar_De="COP";
				pasar_a="KRW";
				break;
				///inverso
			case "De Dolar(EUR) a Pesos(COP)":
				pasar_De="USD";
				pasar_a="COP";
				break;
				
			case "De Euro  a Pesos":
				pasar_De="EUR";
				pasar_a="COP";
				break;
					
			case "De LibraEsterlina a Pesos(COP)":
				pasar_De="GBP";
				pasar_a="COP";
				break;
				
			case "De yenJapones(PYN) a Pesos(COP)":
				pasar_De="PYN";
				pasar_a="COP";
				break;
				
			case "De WonSurcoreano (KRW) a Pesos(COP)":
				pasar_De="KRW";
				pasar_a="COP";
				break;
				
		
				
			case "Otros valores":
				Money operacion= new Money();
	
			
			default:
				break;
				
		}
		
		
		
	
		LocalDate actualDate =LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String fecha_formateada = actualDate.format(formatter);
		

		DAtos[0]= fecha_formateada; 
		DAtos[1]=cantidaDinero;
		DAtos[2]=pasar_De;
		DAtos[3]=pasar_a;
		
		Operation respuesta = new Operation();
		double valor_convertido=respuesta.obtener(DAtos[0],DAtos[1],DAtos[2],DAtos[3]);	
		double ForDAtos=0;
		
		ForDAtos=Math.round((valor_convertido*100.0)/100.0);
		JOptionPane.showMessageDialog(null,"El valor de la conversion   "+ tipoConvercion+ " es : $"+ ForDAtos);
		Message mensaje_final= new Message();
		mensaje_final.mensaje();
		
		
		
	}




}
