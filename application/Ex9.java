package application;
import java.util.Scanner;
import entities.ClasseEx9;

public class Ex9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int tamanho = sc.nextInt();
		sc.nextLine();
		
		ClasseEx9[] pessoas = new ClasseEx9[tamanho];
		int maior = 0;
		
		for(int i = 0; i < pessoas.length; i++){
			System.out.printf("Dados da pessoa %d:", i);
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			sc.nextLine();
			
			pessoas[i] = new ClasseEx9(nome, idade);
		}
		int maisVelho = pessoas[0].getIdade();
		
		for(int i = 0; i < pessoas.length; i++){
			if(maisVelho < pessoas[i].getIdade()){
				maisVelho = pessoas[i].getIdade();
				maior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", pessoas[maior].getNome());
		
		sc.close();
	}
}
