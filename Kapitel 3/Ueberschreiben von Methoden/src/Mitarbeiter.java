import java.util.Date;

public class Mitarbeiter {
    public String name;
    public double gehalt;
    public Date geboren;

    public String getDetails(){
        return name + ", geb. am " + geboren + " hat ein Gehalt von " + gehalt;
    }
}
