import java.util.Scanner;

public class AumentoSalarial {
	
	public static void main (String [] args) {
	
	double salarioatual,salarionovo;
	char salario ;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Informe o seu salario para saber qual foi o aumento:");
		
	salarioatual = teclado.nextInt();
	
	if (salarioatual >0 && salarioatual <=1499){
			salarionovo = ((salarioatual*15)/100)+salarioatual;
			System.out.println("Voce teve um aumento salarial de 15%");
			System.out.println("Seu salario era de:"+salarioatual+"Agora e de:"+salarionovo);
			}
			
	if (salarioatual >1499 && salarioatual <=1750){
			salarionovo = ((salarioatual*12)/100)+salarioatual;
			System.out.println("Voce teve um aumento salarial de 12%");
			System.out.println("Seu salario era de:"+salarioatual+"Agora e de:"+salarionovo);
			}
			
	if (salarioatual >1750 && salarioatual <=2000){
			salarionovo = ((salarioatual*10)/100)+salarioatual;
			System.out.println("Voce teve um aumento salarial de 10%");
			System.out.println("Seu salario era de:"+salarioatual+"Agora e de:"+salarionovo);
			}		
	

	if (salarioatual >2000 && salarioatual <=3000){
			salarionovo = ((salarioatual*7)/100)+salarioatual;
			System.out.println("Voce teve um aumento salarial de 7");
			System.out.println("Seu salario era de:"+salarioatual+"Agora e de:"+salarionovo);
			}

	if (salarioatual >3000){
			salarionovo = ((salarioatual*5)/100)+salarioatual;
			System.out.println("Voce teve um aumento salarial de 5%");
			System.out.println("Seu salario era de:"+salarioatual+"Agora e de:"+salarionovo);
			}			
						
		
   }	
}	