package StaticNestedExample;

public class StaticNestedTest {
    static int a = 0;
    private static int b = 1;
    int c = 2;

    static class StaticNestedClass {

        void show(){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
//            System.out.println("c = "+ c);
        }

    }
}
