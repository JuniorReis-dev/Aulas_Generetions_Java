package Aula_05;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		int[][] numerosUsuario = new int[3][3];
		
		for (int i = 0; i < numerosUsuario.length; i++) {
		    System.out.println("Insira os 3 valores da linha " + (i + 1) + ":");
		    for (int j = 0; j < numerosUsuario[i].length; j++) {
		        numerosUsuario[i][j] = leia.nextInt();}}
		
		System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < numerosUsuario.length; i++) {
            if (i < numerosUsuario.length) {
                System.out.print(numerosUsuario[i][i] + " ");
            }
        }

        System.out.println("\nElementos da Diagonal Secundária:");
        for (int i = 0; i < numerosUsuario.length; i++) {
            if (numerosUsuario.length - 1 - i >= 0) {
                System.out.print(numerosUsuario[i][numerosUsuario.length - 1 - i] + " ");
            }
        }
        for (int i = 0; i < numerosUsuario.length; i++) {
            somaDiagonalPrincipal += numerosUsuario[i][i]; 
            somaDiagonalSecundaria += numerosUsuario[i][numerosUsuario.length - 1 - i];
        }
        System.out.println("\n\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
	}	
}