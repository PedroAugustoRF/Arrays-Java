package application;
import java.util.Scanner;

public class Ex4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int numeros = sc.nextInt();
		
		int[] listaNumeros = new int[numeros];
		
		for(int i = 0; i < listaNumeros.length; i++){
			System.out.println("Digite um numero: \n");
			listaNumeros[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		for(int i = 0; i < listaNumeros.length; i++){
			if(listaNumeros[i] % 2 == 0)
				System.out.printf("%d ", listaNumeros[i]);
		}
		sc.close();
	}
}
