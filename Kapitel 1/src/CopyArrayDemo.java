import java.util.Arrays;

public class CopyArrayDemo {
    public static void main(String[] args) {

        int[] eins = {0, 1, 2, 3, 4, 5};
        int[] zwei = {00, 10, 20, 30, 40, 50};

        System.out.println("Primer array:");
        for(int i = 0; i < eins.length; i++){
            System.out.print(eins[i] + " ");
        }

        System.out.println("\nSegoundo array:");
        for(int x = 0; x < zwei.length; x++){
            System.out.print(zwei[x] + " ");
        }
    }
}
