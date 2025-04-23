package Aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("digite via teclado 5 cores\n");
			cores.add(leia.next());
			}
		System.out.println("\nLista todas as cores:");
		for (var cor : cores) {
			System.out.println(cor);
		}
		System.out.println("\nCores ordenadas em ordem alfabetica");
		cores.sort(null);
		cores.forEach(System.out::println);
			
	}

}
