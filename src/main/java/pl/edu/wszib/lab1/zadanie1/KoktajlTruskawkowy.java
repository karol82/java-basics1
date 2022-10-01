package pl.edu.wszib.lab1.zadanie1;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne {


    @Override
    public void pij() {
        System.out.println("Pij");
    }

    @Override
    public void smak() {
        System.out.println("Truskawkowy");

    }
}
