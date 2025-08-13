package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}
	
	public void percorrerVetor(int n) {
		int[] vetor = new int[n];
		
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < n; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		
		System.out.println("Vetor de " +n+ " posições --> " +tempoTotal+ "s.");
	}
}
