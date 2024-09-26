package StaticNestedExample;

public class NestedClassTest {
    public static void main(String[] args){
        NestedClassExample outer = new NestedClassExample();
        NestedClassExample.InnerClass inner = outer.new InnerClass();
        inner.show();
    }
}
