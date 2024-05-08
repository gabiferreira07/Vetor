package Vetor;

import java.util.Scanner;

public class Setores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int A[] = new int[5];
		int B[] = new int[5];
		int C[] = new int[10];

		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor do Vetor A: ");
			A[i]= ler.nextInt();
			C[i] = A[i];
		}
		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor do Vetor B: " );
			B[i]= ler.nextInt();
			C[i + 5 ] = B[i];
		}
		System.out.print("Valore do Vetor C: ");
		for (int i =0; i<10; i++) {
			System.out.println(C[i]);
		}
		ler.close();
	}
}