public class Rettangolo {

    public int altezza;
    public int larghezza;


    // costruttore
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    // metodo per calcolare l'area
    public int calcolaArea() {
        return this.larghezza * this.altezza;
    }

    // metodo per calcolare il perimetro
    public int calcolaPerimetro() {
        return 2 * (this.altezza + this.larghezza);
    }

    // metodo stampa
    public void stampaRettangolo() {
        int a = calcolaArea();
        int p = calcolaPerimetro();

        System.out.println("L'area è di: " + a + " mentre il perimetro è: " + p);
    }


    // metodo per stampare un singolo rettangolo
    public void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        int sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        int sommaPerimetro = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("La somma delle due aree è di: " + sommaAree);
        System.out.println(("La somma dei due perimetri è di: " + sommaPerimetro));
    }
}
