package StaticNestedExample;

public class NestedClassExample {
    static int a = 99;
    private static int b = 5;
    int c;

    class InnerClass {
        void show(){
            System.out.println("a =" + a);
            System.out.println("b =" + b);
            System.out.println("c =" + c);
        }
    }

}
