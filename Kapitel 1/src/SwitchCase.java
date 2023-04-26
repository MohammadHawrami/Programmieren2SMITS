public class SwitchCase {
    public static void main(String[] args) {
        int n = 8;

        //Switch Case
        //Beginn von dem Switch case in dem man in die Klammer vom switch seinen Index angibt
        //Momentane ausgabe bei Index 5 nicht nur Friday auch Saturday und Sunday
        //dagegen hilft ein Break, des springt raus und beendet dann die Zeile
        /* Was aber wenn ich als Index 8 habe?
        dann muss man ein default machen am ende, sozusagen wie ein else wenn nichts matchd
         */

        switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a right weekday, in one week we have 7 days");
        }

        //Gleiches beispiel ohne Switch case
        int i = 1;

        //sozusagen wie Switch und case zusammen gemischt
        if(i == 1){
            System.out.println("Monday");
        }else if(i == 2){
            System.out.println("Tuesday");
        }else if(i == 3){
            System.out.println("Wednesday");
        }else if(i == 4){
            System.out.println("Thursday");
        }else if(i == 5){
            System.out.println("Friday");
        }else if(i == 6){
            System.out.println("Saturday");
        }else if(i == 7){
            System.out.println("Sunday");
        }else{                              //wie mein default wert
            System.out.println("Pleas enter a right weekday, a week have 7 days");
        }
    }
}
