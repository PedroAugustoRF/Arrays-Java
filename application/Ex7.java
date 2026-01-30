package application;
import java.util.Locale;
import java.util.Scanner;

public class Ex7{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int tamanho = sc.nextInt();
		
		double[] vetor = new double[tamanho];
		double media = 0.0;
		
		for(int i = 0; i < vetor.length; i++){
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			media += vetor[i];
		}
		
		media = media/vetor.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f%nELEMENTOS ABAIXO DA MEDIA:", media);
		
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] < media){
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}
}