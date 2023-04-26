
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Tschüss"); //gibt sozusagen einen Puffer von 16 bit

        sb.deleteCharAt(0); //Löscht an einer Bestimmten stelle des String einen Index nach angabe
        sb.append(" Hallo");  //Änderung des Strings durch append
        sb.insert(0, "Wie ");   //Durch insert kann man etwas an einem beliebten Index hinzufügen
        sb.setLength(15);   //Setzt die Länge der Variable auf einen bestimmten wert
        //Thread = läuft Parallel zwischen zwei Prozessen
        System.out.println(sb);
    }
}