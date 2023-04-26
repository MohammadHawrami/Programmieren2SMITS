//Erzeugt random irgendein Datum und Uhrzeit
import java.util.Date;

public class Mitarbeiter extends Manager{
    public double gehalt;
    public String name;
    public Date geboren;

    public String getDetails(){
        return name + ", geboren am " + geboren + " hat ein Gehalt von " + gehalt;
    }
}
