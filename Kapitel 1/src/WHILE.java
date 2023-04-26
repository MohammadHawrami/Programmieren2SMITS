public class WHILE {
    public static void main(String[] args) {
        int i = 0;

        //Ist eine überprüfung wie ein if sozusagen, wenn z.B. i < 10 = true gibt den inhalt von while aus
        //Wenn i > 10 oder i = 10 dann false
        //die Schleife läuft so lange, bis false rauskommt
        while(i < 10){
            System.out.println("Sind wir schon da?");
            System.out.println("Ist es noch weit?");
            System.out.println(i);
            i++;
        }

        System.out.println("Jetzt sind wir angekommen!");
    }
}
