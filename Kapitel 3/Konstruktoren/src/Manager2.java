import java.util.Date;

public class Manager2 extends Mitarbeiter{
    public String abteilung;

    public Manager2(String name, double gehalt, Date geboren, String abteilung){

        super(name, gehalt, geboren);
        this.abteilung = abteilung;
    }
}
