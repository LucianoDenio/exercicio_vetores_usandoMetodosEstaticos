package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Dados[] dados = new Dados[n];
		
		for(int i=0;i<dados.length;i++) {
			System.out.printf("Altura da %da pessoa:", i+1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:", i+1);
			sc.nextLine();
			char sex = sc.nextLine().charAt(0);
			
			dados[i] = new Dados(height, sex);
		}
		
		
		System.out.println("Menor Altura = " + Dados.minor(dados));
		System.out.println("Maior altura = " + Dados.bigger(dados));
		System.out.printf("Media das alturas das mulheres = %.2f%n" , Dados.mediaWomans(dados));
		System.out.println("Numero de homens = " + Dados.man(dados));
		
		
		
		
		sc.close();

	}

}
