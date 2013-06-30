/**
 * Programa que calcula a sua idade conforme os dados transmitido pelo usuário
 * @ author Ericson da Silva Almeida
 * e-mail: ericson.almeida@gmail.com
 */

 // Comando para utilizar a biblioteca de teclado do Java
 import java.util.Scanner; 

public class CalculaIdade {
	public static void main (String [] ars) {
	
		// Variaveis utlizadas para armazenas informações do usuário
		int anonascimento;
		int anoatual;
		int resultado;
		
		//Criando objeto de comunicação com teclado
		Scanner teclado = new Scanner(System.in);
		
		//Imprimindo mensagem para usuário digitar o ano do nascimento
		System.out.print("Entre com o ano do seu nascimento:");
		
		//Lendo as informações digitada para o ano de nascimento
		anonascimento = teclado.nextInt();
		
		//Imprimindo mensagem para usuario digitar o ano atual
		System.out.print("Entre com o ano atual:");
		
		//Lendo as informaçoes digitada para o ano atual
		anoatual = teclado.nextInt();
		
		//Estrura de comparação utilizada para verificar se o de ano de nascimento é maior que ano atual
		
		if ( anonascimento >= anoatual ) {
				System.out.println("Dados incorretos favor reiniciar o programa");
		} else {  //Caso o ano de nascimento for menor que o atual então é feita a subtração entre ano atual e ano de nascimento
		resultado = (anoatual - anonascimento);
		System.out.println("Você tem atualmente" +  resultado + "anos" );
		}
 }		
}		
		
		
		
		