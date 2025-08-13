package view;

import controller.Operacoes;

public class Principal {
	
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		
		op.percorrerVetor(1000);
		op.percorrerVetor(10000);
		op.percorrerVetor(100000);
	}
}
