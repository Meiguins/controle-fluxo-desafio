package ControleFluxoDesafio;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scanner.nextInt();
		
		try {
			if(num1 > num2) {
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}
			
			int diferenca = Math.abs(num1 - num2);
		
			for(int i = diferenca; i > 0; i--) {
				System.out.println("Imprimindo o número: " + (diferenca - i + 1));
			}	
		}catch(ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
}
