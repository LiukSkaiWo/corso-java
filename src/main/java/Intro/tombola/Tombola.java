package Intro.tombola;

import java.util.ArrayList;
import java.util.Random;

public class Tombola {
    public static void main(String[] args) {

        Random generator = new Random();
        // Costruzione arraylist con i 90 numeri
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 91; i++) {
            numbers.add(i);
        }
        System.out.println("Totale numeri prima = "+numbers.size());

        //genero 20 numeri casuali, li stampo e li rimuovo

        for (int i = 1; i < 21; i++) {
            int n = 1+ generator.nextInt(numbers.size());
            System.out.print(numbers.remove(n)+" ");
        }
        System.out.println();
        System.out.println("Totale numeri aggiornato = "+numbers.size());
        System.out.print(numbers);


    }
}
