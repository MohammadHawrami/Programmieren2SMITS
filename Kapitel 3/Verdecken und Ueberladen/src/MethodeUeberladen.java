public class MethodeUeberladen {
    int a1;
    int a2;
    int a3;
    int a4;

    //Überladene Methode
    public int average(int a1, int a2){
        return 1;
    }

    public int average(int a1, int a2, int a3){
        return 2;
    }

    public int average(int a1, int a2, int a3, int a4){
        return 3;
    }
}
