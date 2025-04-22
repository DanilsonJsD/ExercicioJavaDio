package main;

import java.util.List;
import java.util.Scanner;

import controllers.ImcController;
import controllers.ImparOuParController;
import controllers.TabuadaController;
import models.ImparOuPar;

public class MathExersises {

	public static void main(String[] args) {
		try (Scanner t = new Scanner(System.in)) {
			TabuadaController tabuadaController = new TabuadaController();
			ImcController imcController = new ImcController();
			ImparOuParController iopController = new ImparOuParController();
			int resp = 0;
			do {

				System.out.println("=== Calculadora ===");
				System.out.println("1 - Tabuada");
				System.out.println("2 - Imc");
				System.out.print("Escolha uma opção: ");
				int opcao = t.nextInt();
				t.nextLine();

				switch (opcao) {
				case 1: {
					System.out.print("Digite um número para ver a tabuada: ");
					int numero = t.nextInt();
					t.nextLine();
					List<String> tabuada = tabuadaController.processarTabuada(numero);
					System.out.println("\nTabuada do " + numero + ":");
					tabuada.forEach(System.out::println);
					break;
				}
				case 2: {
					System.out.println("Escreva o seu nome:");
					String nome = t.nextLine();
					System.out.println("Qual o seu peso:");
					double peso = t.nextDouble();
					t.nextLine();
					System.out.println("Qual a sua altura em metros (ex: 1,65):");
					double altura = t.nextDouble();
					t.nextLine();
					String resultado = imcController.processarImc(nome, peso, altura);
					System.out.println(resultado);
					break;
				}
				case 3: {
					System.out.print("Digite um número para iniciar a checagem: ");
					int n1 = t.nextInt();
					t.nextLine();					
					System.out.print("Digite um número para finalizar a checagem: ");
					int n2 = t.nextInt();
					t.nextLine();
					List<String> checado = iopController.processarImparOuPar(n1, n2);
					checado.forEach(System.out::println);
					break;				}
				default:
					System.out.println("Opção inválida");
					throw new IllegalArgumentException("Unexpected value: " + opcao);
				}
				System.out.println("Deseja voltar ao menu?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				resp = t.nextInt();
			} while (resp == 1);
			System.out.println("Sistema finalizado");
		}

	}

}
