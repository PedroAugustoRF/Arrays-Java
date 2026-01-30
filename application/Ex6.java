package application;
import java.util.Scanner;

public class Ex6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int tamanho = sc.nextInt();
		
		int[] vetorUm = new int[tamanho];
		int[] vetorDois = new int[tamanho];
		int[] vetorFinal = new int[tamanho];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vetorUm.length; i++){
			vetorUm[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vetorDois.length; i++){
			vetorDois[i] = sc.nextInt();
			vetorFinal[i] = vetorUm[i] + vetorDois[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vetorFinal.length; i++){
			System.out.println(vetorFinal[i]);
		}
		sc.close();
	}
}
