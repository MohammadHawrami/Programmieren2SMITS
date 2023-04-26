public class Main {
    public static void main(String[] args) {
       //Wenn in Subklasse ein attribut hat was gleich heißt wie attribut in Superklasse dann wir attribute von
       //Superklasse verdeckt und Subklasse erkennt nur attribut von sich selber

       //durch das Schlüsselwort super kann man dann auch auf das verdeckte attribute der Superklasse drauf zugreifen

       //verdeckte Attribut ist nur von dem variablen namen abhängig und nicht von dem Datentypen
       //Man kann die Überladene Variable auch für die folgenden Subklassen entfernen -> in dem man die private deklariert

       //Überladen von Methoden
       /*
       -Überladen tut man, in dem man mehrere Methoden hat mit dem gleichen Namen, die jedoch unterschiedliche parameter haben
       -ermöglicht Entwickler Methoden mit ähnlicher funktionalität zu gruppieren und unterschiedliche Parameter zu akzeptieren
       -Mehrere Methoden dürfen gleichen namen haben, jedoch muss Parameterliste unterschiedlich sein
            -Anzahl von Parameter ist unterschiedlich oder
            -Typen der Parameter unterscheiden sich
       -Compiler wählt dann Methode aus die, die beste Parameterliste hat
        */

        //Namens konventionen für Methoden
        /*
        -setXX -> Setzen des Attributes XX
        -getXX -> Lesen des Attributes XX
        -isXX -> Lesen des attributes XX wenn es boolean ist
        -hasXX -> Lesen des attributes XX wenn es boolean ist
         */

    }
}