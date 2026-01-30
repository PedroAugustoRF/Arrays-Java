package application;
import java.util.Locale; 
import java.util.Scanner;

public class Ex8{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int tamanho = sc.nextInt();
		
		int[] vetor = new int[tamanho];
		int flag = 0;
		double media = 0.0;
		
		for(int i = 0; i < vetor.length; i++){
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt(); 
			media += vetor[i];
			
			if(vetor[i] % 2 != 0)
				flag ++;
		}
		
		media /= vetor.length;
		
		if(flag == vetor.length)
			System.out.println("NENHUM NUMERO PAR");
		else
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		
		sc.close();
	}
}