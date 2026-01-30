package application;
import java.util.Locale;
import java.util.Scanner;

import entities.ClasseEx3;

public class Ex3{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao cadastradas?");
		int pacientes = sc.nextInt();
		sc.nextLine();
		
		ClasseEx3[] paciente = new ClasseEx3[pacientes];
		
		double mediaAltura = 0.0;
		int menores = 0;
	
		for(int i = 0; i < paciente.length; i++){
			
			System.out.printf("Dados do paciente %d:%nNome: \nIdade: \nAltura: \n", i);
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			sc.nextLine();
			
			paciente[i] = new ClasseEx3(nome, idade, altura);

			mediaAltura += paciente[i].getAltura();
		}
		
		System.out.printf("Altura média: %.2f%n", mediaAltura/= paciente.length);
		
		for(int i = 0; i < paciente.length; i++){
			if(paciente[i].getIdade() < 16){
				menores ++;
			}
		}
		
		double porcentagemMenor = ((float)menores / paciente.length) * 100;
		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%n", porcentagemMenor);
		
		for(int i = 0; i < paciente.length; i++){
			if(paciente[i].getIdade() < 16){
				System.out.println(paciente[i].getNome());
			}
		}
		sc.close();
	}
}
