package Vetor;

import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome[]= new String[5]; 
		
		for (int i =0;i<5; i++) {
			System.out.println("Informe nome "+i+":");
			nome[i] = ler.nextLine();
		}
		for (int i =0; i<5; i++) {
			System.out.println(nome[i]);
		}
		ler.close();
	}

}

