package Persona;

public class Persona {
    int eta;
    String nome;
    String cognome;
    String codiceFiscale;

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public boolean isNegative(){
        return (this.eta <=0);
    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNome("Luca");
        p.setCognome("Albergo");
        p.setCodiceFiscale("LLLL");
        p.setEta(16);

        if (p.isNegative())
            p.setEta(0);


        System.out.println("Mi chiamo " + p.nome +" "+ p.cognome + " ho " + p.eta + " anni ed il mio" +
                " codice fiscale è: " + p.codiceFiscale);


    }

}
