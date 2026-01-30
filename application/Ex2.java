package application;
import java.util.Locale;
import java.util.Scanner;
public class Ex2{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? \n");
		int numeros = sc.nextInt();
		sc.nextLine();
		
		double[] vetorNumeros = new double[numeros];
		
		double soma = 0.0, media = 0.0;
		
		for(int i = 0; i < vetorNumeros.length; i++){
			System.out.print("Digite um numero: \n");
			vetorNumeros[i] = sc.nextDouble();
			soma += vetorNumeros[i];
		}
		
		System.out.print("VALORES = ");
		
		for(int i = 0; i < vetorNumeros.length; i++){
			System.out.printf("%.1f ", vetorNumeros[i]);
		}
		System.out.printf("%nSOMA = %.1f%nMEDIA = %.1f", soma, soma/vetorNumeros.length);
		sc.close();
	}
}
