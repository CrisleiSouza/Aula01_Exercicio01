package view;

import controller.Operacoes;

public class Principal {
	
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		
		op.percorrerVetor1000();
		op.percorrerVetor10000();
		op.percorrerVetor100000();
	}
}
