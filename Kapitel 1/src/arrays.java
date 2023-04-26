import java.util.Arrays;    //Hilfsmethoden für Arrays

public class arrays {
    public static void main(String[] args) {
        char[] charArray;  //Deklaration einer Referenzvariable auf ein Array
        charArray = new char[10];   //Array wird mit new angelegt, haben eine fixe Größe
        int[] intArray = {1,2,3,4,5};  //Array Literale
        int[] Alter = {2,3,5,3,5,6};
        int[] Array;
        //mit System.arraycopy() => Gößeres Array anlegen
        int twoDim[][] = new int [4][];    //Meherdimensionales Array
        //equals methode für ein Array
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};

        System.out.println(a.equals(b));
        System.out.println(Arrays.equals(a,b));

        //sort -> sortierung von Arrays
        int[] c = {4, 8, 5, 9, 2, 3, 1, 7, 6};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        //fill -> füllen eines Arrays
        int[] d = {1,2,3,4,5,6};
        Arrays.fill(d, 1);
        System.out.println(Arrays.toString(d));

        //For-each schleife
        int[] Zahlen = {1,2,3,4,5,6};
        for(int i : Zahlen){            //einfache schreibweise, hat den gleichen zweck wie ein normaler for-loop, nur einfacher und kürzer
            System.out.println(i);      //für jedes i wird der jeweilige index an der iten stelle ausgegeben
        }

        //Mehrdimensionale Arrays
        int[][] zahlen = {{1,2,3}, {4,5,6}};
        System.out.println(zahlen[1][2]);
    }
}
