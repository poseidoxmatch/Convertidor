package co.com.soflow.modelo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import co.com.soflow.vista.Input;
import co.com.soflow.vista.Menu1;


public class Operation {

	 public double obtener(String dia, String CantidadDinero,String pasar_De, String pasarA  ) {
		 double valorFinal=0;

		
		 try {
			System.out.println("Ejecutando Operaciones internas");	
			URL url = new URL ("https://api.apilayer.com/exchangerates_data/convert?to="  + pasarA +"&from="+pasar_De+"&amount="+CantidadDinero+"&apikey=wSIdZtZe37dtPx7doriTCt7sLqjjLo4X");
			 
			 HttpURLConnection api =(HttpURLConnection) url.openConnection() ;
			 api.setRequestMethod("GET");
			 api.setRequestProperty("apikey", "wSIdZtZe37dtPx7doriTCt7sLqjjLo4X");
			 
			 if(api.getResponseCode()==200) {
				
				//show 
				List infostring= new ArrayList();
				Scanner scanner = new Scanner(url.openStream());
				
				while (scanner.hasNext()) {
					infostring.add(scanner.nextLine());
				}
				scanner.close();
				
			    String val= (String)infostring.get(12);
			    val= val.replaceAll("\"result\": ","");
			    valorFinal = Double.parseDouble(val);
				System.out.println("El valor es: "+valorFinal);								
			   
			    
			 }else {
				 System.out.println("Error de Respuesta" + api.getResponseCode());
			 }
			 
			 api.disconnect();
		 }
		 
		 catch(Exception ex) {
			 
			JOptionPane.showMessageDialog(null,"Intenta de nuevo ","Error",JOptionPane.ERROR_MESSAGE);
			Menu1 menu1= new Menu1();		
		 }
		 return valorFinal;
	 }
	
}
