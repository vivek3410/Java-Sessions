package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileConcept {
    public static void writeFile(File file,String str){
        try{
            FileOutputStream fileOut = new FileOutputStream(file);
            try{
                fileOut.write(str.getBytes());
                fileOut.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Written...");
    }

    public static String readFile(File file){
        String content = "";
        int b = 0;
        try{
            FileInputStream inFile = new FileInputStream(file);

            while((b = inFile.read()) != -1){
                System.out.print((char)b);
            }

            inFile.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return content;

    }

    public static void copy(File file1,File file2){
        String sourceContent = readFile(file1);

        System.out.println(sourceContent);

        writeFile(file2, sourceContent);
    }
    public static void main(String[] args) {
        File file = new File("./src/FileHandling/file.txt");
        File file1 = new File("./src/FileHandling/file2.txt");
        // System.out.println(file.getName());
        // System.out.println(file.canRead());
        // System.out.println(file.canWrite());
        // System.out.println(file.exists());
        // System.out.println(file.getAbsolutePath());

        copy(file, file1);

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the String: ");
        // String str = sc.nextLine();

        // writeFile(file, str);

        // readFile(file);

        // try{
        //     FileWriter fw = new FileWriter(file);
        //     fw.write("Hello world fw");
        //     fw.close();
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
    }

}
