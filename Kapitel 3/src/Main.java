public class Main {
    public static void main(String[] args) {
        //Eigenschaft von vorhandener Klasse wir auf vererbete Klasse übertragen
        //zwei arten von Vererbungen:
        //Einfachevererbung = jede Klasse erbt maximal von einer anderne Klasse
        //Mehrfachvererbung = eine Klasse kann von mehr als einer Klasse erben
        //Vererbung nur nutzen, wenn ich eine ist-ein Beziehung habe -> bsp. B ist ein A = Manager ist ein Mitarbeiter

        /*
        Syntax beispiel: public class B extends A {} → Klasse B erbt alles von der Klasse A
        -B leitet alles attribute von der Klasse A ab
        -A wäre in diesem fall eine Superklasse, Oberklasse oder Elternklasse
        -B wäre in diesem fall eine Subklasse, Unterklasse, Kindklasse oder abgeleitete Klasse

        -von A wird abgeleitet und B leitet alles ab von A
         */

        //Beispiel zu Vererbung, Aggregation und Komposition
        /*
        -Vererbung = modelliert eine "ist-eine" Beziehung zwischen Klassen → ein Manager ist ein Mitarbeiter

        -Aggregationen = modellieren eine "hat" Beziehung zwischen Klassen → ein Manager hat Kinder

        -Kompositionen = sind Aggregationen, bei denen die Elemente nicht getrennt existieren, können
                        → ein Manager hat ein Gehirn
         */

        //Zugriffskontrollen
        /*
        -private -> nur Methode innerhalb der Klasse können zugreifen
        -public → Jeder darf zugreifen
        -protected -> Methoden innerhalb der Klasse und Subklassen(Klasse die von der jeweiligen gerade ableitet)
                      dürfen darauf zugreifen
        -default -> Methoden dürfen nur innerhalb des Pakets zugreifen, nur in Interfaces nutzbar
        -Klassen und Interfaces können public und default sein
         */
    }
}