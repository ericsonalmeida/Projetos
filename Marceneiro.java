/**
 * programa que calcula a quantidade de pedaços(45cm) e a sobra em cm para cada tipo de tabua(metros)
 * @author: Ericson da Silva Almeida
 * e-mail:ericson.almeida@gmail.com
 */
 
 import java.util.Scanner; // Comando para importar biblioteca para utilizarmos o teclado
 
 public class Marceneiro {
	public static void main (String [] args){
	
		Scanner teclado = new Scanner(System.in); //Comando chamando o teclado
		
		System.out.print("Favor selecione o tamanho da tabua:");
	
		int tamanho = teclado.nextInt();
		tamanho = tamanho *100; // O valor selecionado já é convertido em metros
		
			
		 if (tamanho <= 0){ //Condição criada para não permitir usuario entrar com valido inválido
		     System.out.println("Favor digitar valor correto!");
			 return;
			 }
		
		int pedacos = tamanho/45; //Calculo pra saber a quantidade de pedaços
		
		int sobras = tamanho%45;  //Calculo para saber a quantidade de sobras
		
		System.out.println("\nO A quantidade de peaço permitido é de :"+ pedacos+"cm");
		System.out.println("\nO A quantidade de sobras é de:" + sobras+"cm");
		
 }
}	
	
 