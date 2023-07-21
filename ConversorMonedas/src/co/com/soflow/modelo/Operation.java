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

	 public double obtener(String dia, String Cantidad_Dinero,String pasar_De, String pasarA  ) {
		 double valorFinal=0;

		
		 try {
			System.out.println("Ejecutando Operaciones internas");	
			URL url = new URL ("https://api.apilayer.com/exchangerates_data/convert?to="  + pasarA +"&from="+pasar_De+"&amount="+Cantidad_Dinero+"&apikey=wSIdZtZe37dtPx7doriTCt7sLqjjLo4X");
			 
			 HttpURLConnection api =(HttpURLConnection) url.openConnection() ;
			 api.setRequestMethod("GET");
			 api.setRequestProperty("apikey", "wSIdZtZe37dtPx7doriTCt7sLqjjLo4X");
			 
			 if(api.getResponseCode()==200) {
				
				//show 
				List information_string= new ArrayList();
				Scanner scanner = new Scanner(url.openStream());
				
				while (scanner.hasNext()) {
					information_string.add(scanner.nextLine());
				}
				scanner.close();
				
			    String valor= (String)information_string.get(12);
			    valor= valor.replaceAll("\"result\": ","");
			    valorFinal = Double.parseDouble(valor);
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
