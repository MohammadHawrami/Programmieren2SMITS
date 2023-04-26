public class Main {
    /*
    -Konstruktor name muss immer gleich von Klassen name sein
    -initialisieren Objekte bei erzeugung (ist da um neue Objekte erstellen zu koennen)
    -keine vererbung und keine Methoden
    -kann ueberladen werden
    -gegenseitiger aufruf sowohl von der Superklass

    -aufruf von anderen Konstruktoren in selber Klass = this.name
    -aufruf von Konstruktor von Superklasse = super.name

    Default-Konstruktor:
    -default Konstruktor = Konstruktor ohne Parameter
    -wenn in einem Programm es keinen Konstruktor gibt, dann erstellt der compiler von sich selber einen
    default-Konstruktor, wenn aber einer dazu kommt, dann wird keine default Konstruktor automatisch erstellt

    Aufruf des Superklassen-Konstruktors:
    -Aufruf von Konstruktur auf Superklasse mit super.name
    -super.name muss in erster zeile angegeben werden
    -wenn in Elternklasse es keine Default-Konstruktor gibt, dann kommt es zu Compiler-Fehler
    -wenn alle Konstruktoren = private, dann kann man davon nicht ableiten und auch keine Objekte erstellen


    Aufrufhierarchie von Konstruktoren:
    -hat expilzit einen this und delegiert anderen Konstruktor der selben klasse
    -hat expilzit ein super und delegiert anderen Konstruktur von Superklasse
    -nichts geschrieben = Compiler erzeugt automatisch ein super
    -ein Konstruktor muss kein this enthalten sonst = Kreislauf
    -durch this und super wird sicher gestellt das alle Objekte korret initiallisiert wurden
    -bevor der eingen Konstruktor in der Superklasse aufgerufen wird, wird erst das mit dem this oder super aufgerufen
    -geerbte Variablen werden vor eigene Variablen initiallisiert und vor eigenen Anweisung durchgefuehrt

    Copy-Konstruktor:
    -initialisiert Objekt auf ein bereits basierendes Objekt
    -durch Copy-Konstruktor kann man weitere Objekte erzeugen und diese nachtraeglich anpassen

    Unveraenderliche Objekte:
    -Zustand von Objekt kann nach erzeugung nicht veraendert werden
    -Nur Konstruktor setzt den Zustand und keine ander Methode
    Vorteile:
        -irrelevant ob zwei Refernezen auf zwei gleiche oder identische Objekte zeigen
        -eigene Optimierung moeglich
    Nachteile:
        -Handhabung kompliziert
        -Performance kann leiden
   -immutable Objekte koennen in einigen Faellen zu Performance problemen fuehren
   -ersetzen von zwei gleiche und unveraenderliche Objekt = interning

     */
}
