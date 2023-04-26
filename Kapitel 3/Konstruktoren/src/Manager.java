import java.util.Date;

public class Manager {
    public String name;
    public double gehalt;
    public Date geboren;

    //erster Konstruktor
    public Manager(String name, double gehalt, Date geboren){
        this.name = name;
        this.gehalt = gehalt;
        this.geboren = geboren;
    }

    //zweiter Konstruktor
    public Manager(String name, double gehalt){
        this(name, gehalt, null);
    }

    //dritter Konstruktor
    public Manager(String name){
        this(name, 0.0d, null);
    }
}
