public class SIM {

    private long numeroTel;
    public int credito;
    public String chiamateRec;


    // costruttore
    public SIM(long tel) {
        this.numeroTel = tel;
        this.credito = 0;
        this.chiamateRec = "";
    }

    // metodo stampa dati della SIM
    public void stampaSIM() {
        System.out.println("I dati della SIM riportata sono..");
        System.out.println("Numero telefono: " + this.numeroTel);
        System.out.println("Credito residuto pari a: " + this.credito + "€");
        System.out.println("Lista chiamate recenti (max 5): " + this.chiamateRec);
    }
}
