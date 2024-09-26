package Strings;

public class StringsTest {
    public static void main(String[] args){
        //StringBuffer
        StringBuffer buffer = new StringBuffer("welcome to ");

        System.out.println(buffer);
        System.out.println(buffer.insert(buffer.length(), "Java"));
        System.out.println(buffer.reverse());
        System.out.println(buffer.reverse());
        System.out.println(buffer.delete(0, 10));

        //StringBuilder (its synchronised and fast so in a single thread operation it is more preferred)
        StringBuilder builder = new StringBuilder("welcome to ");

        System.out.println(builder);
        System.out.println(builder.insert(builder.length(), "Java"));
        System.out.println(builder.reverse());
        System.out.println(builder.reverse());
        System.out.println(builder.delete(0, 10));
    }
}
