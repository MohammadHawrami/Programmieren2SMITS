public class Hallo {
    Mensch m = new Mensch();
    m.reden("Ich bin:");
    m.namenSagen();

    Mensch n = new Mensch("Hagi", 10, "Braun");
    n.reden("Ich bin:");
    n.namenSagen();

    Mensch o = new Mensch(n);
    o.reden("Ich bin:");
    o.namenSagen();

    /*
    Es werden sozusagen einfach die werte von n Kopiert, wieso das geht sieht man in der Klasse Mensch, das hat man
    einmal einen ganz normalen Konstrucktor, einen der mit Parameteren versehen ist und einmal der Copy-Konstruktor
     */
}
