package application;
import java.util.Locale; 
import java.util.Scanner;
import entities.ClasseEx10;

public class Ex10{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int tamanho = sc.nextInt();
		sc.nextLine();
		
		ClasseEx10[] alunos = new ClasseEx10[tamanho];
		double media = 0.0;
		for(int i = 0; i < alunos.length; i++){
			System.out.printf("Digite nome, primeira e segunda nota do aluno número %d%n", i);
			String nome = sc.nextLine();
			double notaUm = sc.nextDouble();
			double notaDois = sc.nextDouble();
			sc.nextLine();
			
			alunos[i] = new ClasseEx10(nome, notaUm, notaDois);
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < alunos.length; i++){
			media = (alunos[i].getNotaUm() + alunos[i].getNotaDois()) / 2;
			if(media >= 6.0)
				System.out.println(alunos[i].getAluno());
		}

		sc.close();
	}
}
