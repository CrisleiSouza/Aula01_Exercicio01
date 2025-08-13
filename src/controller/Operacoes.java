package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}
	
	public void percorrerVetor1000() {
		int[] vetor = new int[1000];
		
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		
		System.out.println("Vetor de 1000 posições --> " +tempoTotal+ "s.");
	}
	
	public void percorrerVetor10000() {
		int[] vetor = new int[10000];
		
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		
		System.out.println("Vetor de 10000 posições --> " +tempoTotal+ "s.");
	}
	
	public void percorrerVetor100000() {
		int[] vetor = new int[100000];
		
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		
		System.out.println("Vetor de 100000 posições --> " +tempoTotal+ "s.");
	}
	
}
