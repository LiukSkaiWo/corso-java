package Intro.tombola;

import java.util.ArrayList;
import java.util.Random;

public class Tombola {

    //Creo la arraylist
    private ArrayList <Integer> numbers = new ArrayList<>();

    //Popolo la arraylist
    private void initList(){
        for (int i = 1; i < 91; i++) {
            numbers.add(i);
        }
        System.out.println("Totale numeri prima = "+numbers.size());
    }

    //Creo il metodo per fare l'estrazione richiamando l'altro metodo
    public void extract(){
    // richiamo il metodo per inizializzare la lista
        initList();

        Random generator = new Random();

        for (int i = 1; i < 21; i++) {
            int n = 1+ generator.nextInt(numbers.size());
            System.out.print(numbers.remove(n)+" ");
        }
        System.out.println();
        System.out.println("Totale numeri aggiornato = "+numbers.size());
        System.out.print(numbers);
    }

    public static void main(String[] args) {
        //Creo un oggetto Tombola
        Tombola t = new Tombola();
        //Richiamo il metodo public
        t.extract();
    }
}
