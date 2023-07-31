package Intro;

public class Pari {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPari(){
        return (this.numero %2 == 0);
    }

    public boolean isDispari() {
        return !isPari();
    }

    public static void main(String[] args) {
        Pari p = new Pari();
        p.setNumero(5);
        if (p.isPari())
            System.out.println ("E' pari");
        else
            System.out.println("E' dispari");
    }
}
