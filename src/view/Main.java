package view;

import controller.ThreadVetor;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] numeros = new int[1000];
		Thread[] threads = new ThreadVetor[2];

		preencherVetorComNumerosAleatorios(numeros);

		threads[0] = new ThreadVetor(numeros, 2);
		threads[1] = new ThreadVetor(numeros, 1);

		for (Thread thread : threads) {
			thread.start();
		}
	}

	public static void preencherVetorComNumerosAleatorios(int[] vetor) {
		Random random = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100) + 1; //1 a 100
		}
	}
}
