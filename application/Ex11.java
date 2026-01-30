package application;
import java.util.Locale; 
import java.util.Scanner;
import entities.ClasseEx11;

public class Ex11{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int tamanho = sc.nextInt();
		sc.nextLine();
		
		ClasseEx11[] pessoas = new ClasseEx11[tamanho];
		double mediaAltura = 0.0;
		
		for(int i = 0; i < pessoas.length; i++){
			System.out.printf("Altura da pessoa %d: ", i);
			double altura = sc.nextDouble();
			System.out.printf("Gênero da pessoa %d: ", i);
			char genero = sc.next().charAt(0);
			
			pessoas[i] = new ClasseEx11(altura, genero);
		}
		
		double maisAlto = pessoas[0].getAltura(), menosAlto = pessoas[0].getAltura();
		
		for(int i = 0; i < pessoas.length; i++){
			if(maisAlto < pessoas[i].getAltura())
				maisAlto = pessoas[i].getAltura();
		}
		
		for(int i = 0; i < pessoas.length; i++){
			if(menosAlto > pessoas[i].getAltura())
				menosAlto = pessoas[i].getAltura();
		}
		
		double mediaAlturaMulheres = 0.0;
		int quantiaMulheres = 0, quantiaHomens = 0;
		
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i].getGenero() == 'F' || pessoas[i].getGenero() == 'F'){
				quantiaMulheres++;
				mediaAlturaMulheres += pessoas[i].getAltura();
			}
			else
				quantiaHomens++;
		}
		
		mediaAlturaMulheres /= quantiaMulheres;
		
		System.out.printf("Menor Altura = %.2f%nMaior altura = %.2f%nMedia das alturas das mulheres = %.2f%nNumero de homens = %d",menosAlto, maisAlto, mediaAlturaMulheres, quantiaHomens);
		
		sc.close();
	}
}