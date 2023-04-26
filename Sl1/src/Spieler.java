import java.util.Scanner;

public class Spieler {
    String auswahl;

    public void Spieler(){

    }

    public void zug() {
        Scanner in = new Scanner(System.in);
        System.out.println("bitte entscheiden sich sich für Stein, Schere, Papier");
        System.out.println("Für Stein = r, für Schere = s, für Papier = p");
        auswahl = in.nextLine();
    }
}

