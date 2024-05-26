import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner idade = new Scanner(System.in);
		int anonasci;
		int anoatual;
		
		System.out.print("Digite o seu ano de nascimento: ");
		anonasci = idade.nextInt();
		System.out.print("Digite o ano atual: ");
		anoatual = idade.nextInt();
		
		/*
		 PRIMEIRO MODO DE IMPRIMIR NA TELA:
		 
		 System.out.printf("A sua idade é: %d\n",(anoatual - anonasci));
		 
		 SE USAR O PRINTF TEM QUE COLOCAR OS PLACEHOLDERS -> %alguma varíavel
		 
		 SEGUNDO MODO DE IMPRIMIR NA TELA:
		 
		 System.out.println("A sua idade é:" + (anoatual - anonasci));  
		 
		 SE USAR O PRINTLN TEM QUE USAR O +, É CONCATENAMENTO 
		 */
		
		System.out.println("A sua idade é: " + (anoatual - anonasci)); 
	}

}
