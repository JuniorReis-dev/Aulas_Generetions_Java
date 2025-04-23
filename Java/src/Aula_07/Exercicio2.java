package Aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> livrosAdd = new Stack<String>();
		System.out.println("Digite seu Nome:");
		String nome = leia.nextLine();
		nome = nome.toUpperCase();
		int posicao = -1;
		
		while (posicao != 0) {
			System.out.println("\nBem-vindo, " + nome + "!");
			System.out.println("\n=== Menu ===");
            System.out.println("1: Adicionar um novo livros na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha ");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite sua opção: ");
				posicao = leia.nextInt();
				leia.nextLine(); // vai Consumir o "\n" que sobra do nextInt
				switch (posicao) {
				case 1 :
					for (int contador = 0; contador < 1; contador++) {
					System.out.println(" Adicionar um novo livro\n");
					String entrada = leia.nextLine();
					entrada = entrada.toUpperCase();
					if (livrosAdd.contains(entrada)) {
					System.out.println("Livro ja adicionado");
					}
					else {
						livrosAdd.add(entrada);
						System.out.println("Livro Adicionado!");
						}}
					break;
					
				case 2 : 
					if (livrosAdd.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.println("Lista de livros na pilha:");
                        System.out.println(livrosAdd); 
                        }
				break;
				case 3 :
					if (livrosAdd.isEmpty()) {
                        System.out.println("A lista está vazia! Não há Livros para remover.");}
					else {
						livrosAdd.pop();
						System.out.println("Livro removido!");
					}
					break;
				case 0 : 
					System.out.println("O programa Foi finalizado");
					return;	
				default:
                    System.out.println("Opção inválida. Tente novamente.");
				}}
			leia.close();
	}

}
