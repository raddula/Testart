package samplePrograms;

import java.io.*;
import java.nio.charset.Charset;
//import java.nio.file.Files;


public class SamplePrograms {


    public static void main (String args[]){

//        try {
//           int arr[] = new int[2];
//           System.out.println(arr[1]);
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception " + e);
//        }


        try {
//            File file = new File("/Users/yc05r3a/Desktop/file.txt");
            BufferedWriter br = new BufferedWriter(new FileWriter("/Users/yc05r3a/Desktop/file1.txt"));
            br.write("Sample java programs");
            br.close();
            BufferedReader bread = new BufferedReader(new FileReader("/Users/yc05r3a/Desktop/file1.txt"));
            System.out.println("Reading file contents" +bread.readLine());

        }catch (Exception exc){

        }


    System.out.println("Completed");
    }

}