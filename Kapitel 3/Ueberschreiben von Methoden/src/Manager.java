public class Manager extends Mitarbeiter{
    public String abteilung;

    public String getDetails(){
        return name + ", geb. am " + geboren + " hat ein Gehalt von " + gehalt + " und leitet die Abteilung " + abteilung;
    }
}
