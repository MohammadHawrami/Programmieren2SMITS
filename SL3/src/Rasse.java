/**
 * Klasse, um die Rasse eines Wesens anzugeben. Die Klasse enthaelt
 * vier statische Referenzen, welchen die vier Rassen des Spiels repaesentieren
 * Ausserdem speichert sie noch die Kosten pro Rasse.
 */
public final class Rasse {
    //wichtigste details Orks
    public static void Ork(){
        int Kosten = 150;
        int Kosten_Farseer = 300;
        int Lebenspunkt = 100;
        int Schaden = 33;
        int Geschwindigkeit = 1;
        int Ruestung = 30;
    }
    //wichtigste details Untote
    public static void Untote(){
        int Kosten = 70;
        int Kosten_Lich = 140;
        int Lebensdauer = 120;
        int Schaden = 16;
        int Geschwindigkeit = 2;
        int Ruestung = 30;
    }
    //wichtigste details Menschen
    public static void Menschen(){
        int Kosten = 110;
        int Kosten_Erzmagier = 220;
        int Lebensdauer = 140;
        int Schaden = 40;
        int Geschwindigkeit = 2;
        int Ruestung = 40;
    }
    //wichtigste details Nachtelf
    public static void Nachtelf(){
        int Kosten = 145;
        int Kosten_Deamonslayer = 290;
        int Lebensdauer = 150;
        int Schaden = 15;
        int Geschwindigkeit = 3;
        int Ruestung = 20;
    }
}
