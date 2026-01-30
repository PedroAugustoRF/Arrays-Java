package application;
import java.util.Locale; 
import java.util.Scanner;

public class Ex5{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int numeros = sc.nextInt();
		
		double[] listaReais = new double[numeros];
		
		for(int i = 0; i < listaReais.length; i++){
			System.out.print("Digite um numero: \n");
			listaReais[i] = sc.nextDouble();
		}
		
		double maiorReal = listaReais[0];
		int posicao = 0;
		
		for(int i = 0; i < listaReais.length; i++){
			if(listaReais[i] > maiorReal){
				maiorReal = listaReais[i];
				posicao = i;
			}
		}
		System.out.printf("O maior real é: %.2f. Na posição %d", maiorReal, posicao);
		sc.close();
	}
}
