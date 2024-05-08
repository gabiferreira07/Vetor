package Vetor;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		int valores[] = new int[5];
		int soma = 0;
		Scanner ler = new Scanner(System.in);

		for (int i =0;i<5; i++) {
			System.out.print("Informe um valor "+i+":");
			valores[i]=ler.nextInt();
		}
        for (int valor : valores) {
            soma += valor;
        }
        if (soma > 15) {
            System.out.println("A soma dos valores é: " + soma);
        }
        else {
            System.out.println("A soma dos valores não é maior que 15.");
        }
    }
}