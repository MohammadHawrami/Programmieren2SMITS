import java.util.Date;

public class Manager extends Geschaeftsfuehrer{
    public double gehalt;
    public String name;
    public Date geboren;
    public String abteilung;

    //Methode für Detail zusammenfassung
    public String getDetails(){
        return name + ", geboren am " + geboren + " hat ein Gehalt von " + gehalt;
    }
}
