/** 
 * Programa java para uma calculadora Simples com o comando Switch
 * @author: Ericson da Silva ALmeida
 */
 
 import java.util.Scanner; //Comando para chamar biblioteca do teclado do java
 
 public class Calculadora {
	
	public static void main (String [] args) {
	
		Scanner teclado = new Scanner(System.in); //Chamando o teclado
		int x, y, resultado;
		System.out.println("Entre com o operando 1:");
		 x = teclado.nextInt();
		 
		 char operacao; // Variavel para reconhecer o operação
			System.out.print("Enter com uma das operacoes + - * /");
			operacao = teclado.next().charAt(0);
			 
		 System.out.println("Entre com o operando2:");
		 y = teclado.nextInt();
		 
		 if (x < 0 || y < 0) { //Adicionado a função IF para não permitir operções com numeros negativos
		    System.out.print("Favor entrar com valores acima de 0");
		}else{		
					
			switch(operacao) {
			
			case '+': //Operação da soma
			 resultado = x+y;
			 System.out.println("O resultado da soma e:"+resultado); break;
			 
			 case '-': //Operação da subtração
			  resultado = x-y;
			  System.out.println("O resultado da subtracao e:"+resultado); break;
			  
			  case '*': //Operação da multiplicação
			  resultado = x*y;
			  System.out.println("O resultado da multiplicacao e:"+resultado); break;
			  
			  case '/':
			  resultado = x/y; //Operação da divisão
			  System.out.println("O resultado da divisao e:"+resultado); break;
			 }
		}	 
	}
}	