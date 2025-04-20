package main;

import java.util.List;
import java.util.Scanner;
import controller.TabuadaController;

public class MathExersises {

	public static void main(String[] args) {
		try (Scanner t = new Scanner(System.in)) {
			TabuadaController tabuadaController = new TabuadaController();
			
	        System.out.println("=== Calculadora ===");
	        System.out.println("1 - Tabuada");
	        System.out.print("Escolha uma opção: ");
	        int opcao = t.nextInt();

	        switch (opcao) {
			case 1: {
				System.out.print("Digite um número para ver a tabuada: ");
				int numero = t.nextInt();
				t.nextLine();
				List<String> tabuada = tabuadaController.processarTabuada(numero);
				System.out.println("\nTabuada do "+ numero + ":");
				tabuada.forEach(System.out::println);
				break;
			}
			default:
				System.out.println("Opção inválida");
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}
		
	}

}
