public class Mensch{
    private String Name = "Namenlos";
    private int IQ = 100;
    private String Haarfarbe = "Unbekannt";

    //Konstrutor
    public Mensch() {
        //uebernimmt Standartwerte
    }

    public Mensch(String Name, int IQ, String Haarfarbe){
        this.Name = Name;
        this.IQ = IQ;
        this.Haarfarbe = Haarfarbe;
    }

    public Mensch(Mensch mensch){
        this.Name = mensch.Name;
        this.IQ = mensch.IQ;
        this.Haarfarbe = mensch.Haarfarbe;
    }


}
