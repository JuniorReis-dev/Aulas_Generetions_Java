package Aula_05;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		boolean encontrado = false;
		Scanner leia = new Scanner(System.in);
		System.out.println("digite 10 numeros");
		int[] numerosUsuario = new int[10];
			for (int i = 0; i < numerosUsuario.length; i++) {
			numerosUsuario[i] = leia.nextInt();}      
		
		System.out.println("digite um numero que deseja encotrar");
		int usuarioPesquisa = leia.nextInt();
		 	for (int x = 0; x < numerosUsuario.length ;x++) {
		 		if (numerosUsuario[x] == usuarioPesquisa) { 
		 			encontrado = true;
		 			System.out.printf("O número %d está localizado na posição: %d",numerosUsuario[x],x);}} 
		if(encontrado == false){ System.out.printf("o Numero %d não foi encontrado!",usuarioPesquisa);
		 					
		
		}
		 
	}

}
