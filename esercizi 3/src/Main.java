public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("Esercizio #1");
        System.out.println("------------------------------------");

        Rettangolo r1 = new Rettangolo(27, 10);
        Rettangolo r2 = new Rettangolo(10, 42);


        r1.stampaRettangolo();
        r2.stampaRettangolo();

        r1.stampaDueRettangoli(r1, r2);


        System.out.println("------------------------------------");
        System.out.println("Esercizio #2");
        System.out.println("------------------------------------");


        SIM s1 = new SIM(340051272);

        s1.stampaSIM();

        System.out.println("------------------------------------");
        System.out.println("Esercizio #3");
        System.out.println("------------------------------------");

        

    }
}