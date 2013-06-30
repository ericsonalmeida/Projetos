/**
 * Ester programa calcula o consumo de combustivel(Km por litros) 
  Capacidade do tanque 50L .  A 95KM/h em 2 horas fora consumido 1/2  tanque
 * @author: Ericson da Silva ALmeida
 * e-mail:ericson.almeida@gmail.com
 */

public class CalculaCombustivel {
	public static void main (String [] args){
		
	int velocidademedia = 95;	
	int horas = 2;
	int tanque = 25;
	float consumo = (95*2)/50;
	
	System.out.println("O consumo de combustivel fora de" +consumo+ "litros por Kilometros");
 }
} 
	