package Aula_06;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;    
import java.util.TreeSet;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new TreeSet<>();
        
        for (int contador = 0; contador < 10; contador++) {
			System.out.println("digite via teclado 10 numeros inteiros\n");
			numeros.add(leia.nextInt());
			}

        Iterator<Integer> inumeros = numeros.iterator();
        
        System.out.println("Listar dados do Set:");
        while (inumeros.hasNext()) {
            System.out.println(inumeros.next());
        }

        leia.close();
    }

}
