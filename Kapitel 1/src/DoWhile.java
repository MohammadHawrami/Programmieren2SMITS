public class DoWhile{
    public static void main(String[] args) {
        int i = 0;
        /*
        bei der do-while Schleife wird erst alles durchgeführt und dann wird erst abgebrochen wenn die überprüfung
        false ergibt
         */
        do{
            System.out.println("Sind wir schon da?");
            System.out.println("Ist es noch weit?");
            i++;
        }while(i < 10);

        System.out.println("Jetzt sind wir angekommen!");
    }
}
