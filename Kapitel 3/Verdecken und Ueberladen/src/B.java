public class B extends A{
    public String i = "Ein String in B";

    public void doItNew(){
        System.out.println(i);
        System.out.println(", " + super.i);
    }
}
