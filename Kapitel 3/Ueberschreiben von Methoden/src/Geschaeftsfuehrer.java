public class Geschaeftsfuehrer extends Manager{
    public boolean prokura = true;

    public String getDetails(){
        return name + ", geb. am " + geboren + " hat ein Gehalt von " + gehalt + " und leitet die Abteilung " +
                abteilung + " und hat Prokura " + prokura;
    }
}
