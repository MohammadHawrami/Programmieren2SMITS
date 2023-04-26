import java.util.Date;

public class Mitarbeiter {
    public double gehalt;
    public String name;
    public Date geboren;

    public Mitarbeiter(String name, double gahalt, Date geboren){
        this.name = name;
        this.gehalt = gehalt;
        this.geboren = geboren;
    }
}
