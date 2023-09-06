package controller;

public class ThreadVetor extends Thread {
	private int[] numeros;
	private int operacao;
	
	public ThreadVetor(int[] numeros, int operacao) {
		this.numeros = numeros;
		this.operacao = operacao;
	}
	
	@Override
	public void run() {
		if(operacao % 2 == 0) {
			medirDesempenho(this::percorrerVetorComFor, "FOR NORMAL");
		} else {
			medirDesempenho(this::percorrerVetorComForEach, "FOR EACH");
		}
	}

	private void medirDesempenho(Runnable metodo, String nomeLaco) {
		double tempoInicial, tempoFinal, tempoTotal;

		tempoInicial = System.nanoTime();
		metodo.run();
		tempoFinal = System.nanoTime();

		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10, 9);

		System.out.println("\nTempo total: " + tempoTotal + " segundos |==> " + nomeLaco);
	}
	
	public void percorrerVetorComFor() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	public void percorrerVetorComForEach() {
		for(int atual : numeros) {
			System.out.print(atual + " ");
		}
	}
}
