package samplePrograms;

import java.io.*;
import java.util.Scanner;

public class BufferedReaderExample {

        public static void main(String args[])
        {
            int a;
            float b;
            String s;

            Scanner in = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try{
    System.out.println("Enter an integer");
//            a = in.nextInt();
    a = br.read();
    System.out.println("You entered integer "+a);
    s = br.readLine();

} catch (Exception e){

}

            try {
//                File file = new File("/Users/yc05r3a/Desktop/file.txt");
                BufferedWriter br2 = new BufferedWriter(new FileWriter("/Users/yc05r3a/Desktop/file1.txt"));
                br2.write("Sample java programs");
                br2.close();
                BufferedReader bread = new BufferedReader(new FileReader("/Users/yc05r3a/Desktop/file1.txt"));
                System.out.println("Reading file contents" +bread.readLine());

            }catch (Exception exc){

            }


            System.out.println("Enter a float");
//            s = br.readLine();
//            System.out.println("You entered float "+!b);

            System.out.println("Enter a string");
            s = in.nextLine();
            System.out.println("You entered string "+s);
        }

}
