package test2;

import java.io.File;

public class fileModule {
    public static void main(String[] args){
        char[] data = new char[29];
        File file = new File("C:/Users/Sanal Dath/IdeaProjects/first/src/sample1.txt");

        String message = "This is dummy message to test";
        try {
            boolean status = file.createNewFile();

            if(status){
                System.out.println("File is created successfully");
            } else {
                System.out.println("File name already exists!");
            }
        } catch (Exception err){
            System.out.println("An error occured during file creation!");
        }

//        try {
//            FileWriter fw = new FileWriter("C:/Users/Sanal Dath/IdeaProjects/first/src/sample.txt");
//            fw.write(message);
//            fw.close();
//            System.out.println("Message write into sample.txt successfully");
//        } catch (Exception err) {
//            System.out.println("An error occured when writing file");
//        }

//        try {
//            FileReader fr = new FileReader("C:/Users/Sanal Dath/IdeaProjects/first/src/sample.txt");
//            fr.read(data);
//            System.out.println("Data is read successfully");
//
//            fr.close();
//            System.out.println(data);
//        }catch (Exception err) {
//            System.out.println("Error occured while reading file");
//        }

        try {
            File fd = new File("C:/Users/Sanal Dath/IdeaProjects/first/src/sample.txt1");
            fd.delete();

            System.out.println("File deleted successfully");
        }catch (Exception err) {
            System.out.println("Error occured while deleting file");
        }
    }
}
