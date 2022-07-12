package PTI;

import java.util.Scanner;

public class PTI {
	private static void diferenca(int vetor[]) {
		int maior = vetor[0];
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("A diferen�a entre o maior e o menor valor dentro do vetor �: " + (maior-menor));
	}

	private static boolean ordenado(int[] vetor) {
		//se testar no papel cada loop do la�o, enxerga
		if (vetor.length>1) {
			for (int i = 1; i < vetor.length; i++) {
				if (vetor[i-1] > vetor[i]) {
				return false;
				}else {
				
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.printf("Quantos elementos deseja inserir no vetor? \n");
		int i = scan.nextInt();
		
		int[] vetor = new int[i];
		
		
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Qual o valor da posi��o " + i);
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Os valores do vetor s�o: ");
		for (i = 0; i < vetor.length; i++) {
		System.out.printf(vetor[i] + " \n");
		}
		
		diferenca(vetor);
		
		if (ordenado(vetor)) {//aqui entra o primeiro retorno da fun��o = true!
			System.out.println("O vetor est� ordenado");
		}else {
			System.out.println("O vetor n�o est� ordenado");
		}
		
		scan.close();
	
	}
}
