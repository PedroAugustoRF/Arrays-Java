package application;
import java.util.Scanner;
public class Ex1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? \n");
		int numeros = sc.nextInt();
		sc.nextLine();
		
		int[] vetorNumeros = new int[numeros];
		
		for(int i = 0; i < vetorNumeros.length; i++){
			System.out.print("Digite um numero: ");
			vetorNumeros[i] = sc.nextInt(); 
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vetorNumeros.length; i++){
			if(vetorNumeros[i] < 0)
				System.out.println(vetorNumeros[i]);
		}
		sc.close();
	}
}
