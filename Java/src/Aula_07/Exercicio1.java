package Aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> clienteAdd = new LinkedList<String>();
		System.out.println("Digite seu Nome:");
		String nome = leia.nextLine();
		nome = nome.toUpperCase();
		
		while (nome.equals("ADMIN")) {
			System.out.println("\n=== Menu ===");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite sua opção: ");
            	int posicao = -1;
				posicao = leia.nextInt();
				leia.nextLine(); // vai Consumir o "\n" que sobra do nextInt
				switch (posicao) {
				case 1 :
					for (int contador = 0; contador < 1; contador++) {
					System.out.println(" Adicionar um novo Cliente na fila\n");
					String entrada = leia.nextLine();
					entrada = entrada.toUpperCase();
					if (clienteAdd.contains(entrada)) {
					System.out.println("Nome ja adicionado");
					}
					else {
						clienteAdd.add(entrada);
						System.out.println("Cliente Adicionado!");
						}}
					break;
					
				case 2 : 
					if (clienteAdd.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Clientes na fila:");
                        System.out.println(clienteAdd); 
                        }
				break;
				case 3 :
					if (clienteAdd.isEmpty()) {
                        System.out.println("A fila está vazia! Não há clientes para remover.");}
					else {
					System.out.println("Clientes na fila:");
                    System.out.println(clienteAdd);			
                    System.out.println("digite qual Cliente queria remover:");
					String remover = leia.nextLine();
					remover = remover.toUpperCase();
					if (clienteAdd.remove(remover)) {
						System.out.println("Cliente removido!");
					}}
					
					break;
				case 0 : 
					System.out.println("O programa Foi finalizado");
					return;	
				default:
                    System.out.println("Opção inválida. Tente novamente.");
				}}
			
			while (!nome.equals("ADMIN")) {
				System.out.println("\nBem-vindo, " + nome + "!");
				System.out.println("\n=== Menu ===");
	            System.out.println("1: Listar todos os Clientes na fila");
	            System.out.println("0: Finalizar o programa");
	            System.out.print("Digite sua opção: ");
	            int posicao2 = -1;
	            posicao2 = leia.nextInt();
				leia.nextLine();
				switch (posicao2) {
				case 0 :
					System.out.println("O programa Foi finalizado");
					return;
				case 1 :
					if (clienteAdd.contains(nome)) {
						System.out.println("Seu nome esta na lista de espera Aguarde ser chamado");}
					else {
						System.out.println("Ops! seu nome nao esta na lista de espera Entre Em contato com o suporte");
					}
					break;
				default:
                    System.out.println("Opção inválida. Tente novamente.");}
				}
			
			leia.close();
	}

}
