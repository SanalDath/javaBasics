package test2;

public class backup {
    public static void main(String[] args){
        //       double myNumber = 1.1111111111111d;
//       boolean learnJava = true;
//       char myChar = '1';
//       String myString = "Sanal Dath G S";
//       System.out.println(myNumber);
//       System.out.println(learnJava);
//       System.out.println(myChar);
//       System.out.println(myString);
//        int x = 10;
//        int a = 10;
//        int b = 10;
//        int c = 10;
//
//        c *= 2;
//        b /= 2;
//        a -= 4;
//        x += 4;
//        c %= 2;
//
//        System.out.println(c);
//        System.out.println(a);
//        System.out.println(x);
//        System.out.println(b);

//        int a = 10, b = 2 ;
//
//
//        System.out.println("less then" + " " + (a<=b) );
//        System.out.println( a<b );
//        System.out.println( a>b && a<b);
//        System.out.println( a>b || a<b);
//        System.out.println( !(a>b) ); //logical not

        //if condition
//        int i = 1;
//
//        if(i < 0) {
//            System.out.println("I is a Negative Number");
//        } else if(i == 0){
//            System.out.println("I is a zero");
//        } else if(i > 0) {
//            System.out.println("I is a Postive number");
//        } else {
//            System.out.println("Invalid operator");
//        }

        //Switch Statement
//        int myNum = 34;
//
//        switch (myNum){
//            case 1:
//            System.out.println("One");
//            break;
//            case 2:
//            System.out.println("Two");
//            break;
//            case 3:
//            System.out.println("Three");
//            break;
//            default:
//                System.out.println("Invalid");
//                break;
//        }
//        int a = 10 ;

        //While loop
//        while (a <= 20) {
//            System.out.println(a);
//            ++a;
//        }
        //do - while loop
//        do {
//            System.out.println(a);
//            ++a;
//        } while (a <= 20) ;

//        for (int i =0 ; i <= 10; i ++) {
//            System.out.println(i);
//        }

        //String Methods


//        String message = "Sanal Dath G S";
//        String upperCase = message.toUpperCase();
//        String lowerCase = message.toLowerCase();
//
//        String fName = "Sanal";
//        String sName = "Dath";
//        String LName = "G S";
//
//        String fullName = fName.concat(" " + sName+ " " + LName);
//
//        System.out.println(fullName);
//
//        System.out.println(lowerCase);
//        System.out.println(upperCase);

        //Math in Java

//        int num = Math.max(1,2);
//        int num1 = Math.min(1,2);
//        int num2 = (int) Math.sqrt(10);
//        int num3 = Math.abs(-10);
//
//        System.out.println(num);
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);

        //otp generation using math.random

//        double otp = Math.random(); //generate random numbers between 0 - 1 ,eg :0.9891322479442907


//        int otp1 = (int) (Math.random()* 999999) + 100000;
//        System.out.println(otp1);
        //
        //array and

        //        String[] array = { "apple", "Orenge", "Mango"};
//
//        array[1] = "Changed";
//
//        System.out.println(array[1]);
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(array.length);
//        String[][] arr = {{"apple", "Orenge", "Mango"}, {"earth", "mars", "sun", "moon"}, {"cat", "dog", "cow", "hen", "duck"} };
//
//        for(int i = 0 ; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++){
//                if(arr[i][j].equals("cow")) {
//                    System.out.println("i: " + i + " " + "j: " + j);
//                }
//            }
//        }

//        System.out.println(Arrays.deepToString(arr));
//        System.out.println();


         //Method Overloading

//        static int addNum(int a){
//            int sum = a + a;
//            return sum;
//        }
//        static int addNum(int a, int b){
//            return a + b;
//        }
//        public static void main(String[] args){
//
//            int b = addNum(2);
//            int d = addNum(1, 2);
//
//            System.out.println(d);
//            System.out.println(b);


        //Recursion

//        public class dataType {
//    static int demoRecusrsion(int a){
//        if(a > 0) {
//            return a + demoRecusrsion(a -1);
//        } else {
//            return 0;
//        }
//    }
//    public static void main(String[] args){
//        int sum1 = demoRecusrsion(5);
//        System.out.println(sum1);

        //oops

        //        smartPhone phone1 = new smartPhone();
//        phone1.make = "Realme";
//        phone1.model = "Narzo 30";
//        phone1.price = 14000;
//
//        System.out.println(phone1.make);
//
//        phone1.call();
//        smartPhone.message();
//
//        person student_1 = new person();
//        student_1.name = "Sanal";
//        student_1.number = 123;
//
//        student_1.addAddress();
//
//        person teacher_1 = new teachers();
//        teacher_1.name = "ammu";
//        teacher_1.number = 456;
//
//        teacher_1.addAddress();
//
//        demo s = new demo();
//        s.setName("Sanal");
//        s.setNumber(12323);
//
//        System.out.println("Name : " + s.getName() + "number : " + s.getNumber());
//        audioCall a = new audioCall();
//        videoCall v = new videoCall();
//
//        a.call();
//        v.hangUp();
        }
}
