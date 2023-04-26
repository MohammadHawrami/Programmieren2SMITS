import java.util.Random;

public class Computer {
    String auswahl;
    public void Computer(){

    }

    public void zug(){
        //r = Stein, p = Papier, s = Schere
        String [] wahl = {"r" , "p" , "s"};
        Random zufall = new Random();
        auswahl = wahl [zufall.nextInt(3)];
    }
}