package com.santos.iostrems;

import java.io.FileInputStream;
import java.io.InputStream;

public class ByteArraystream {
    public static void main(String args[]) {

        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("/media/sant-code-monk/B/job_switch/resumedraft.txt");

            System.out.println("Available bytes in the file: " + input.available());

//            // Read byte from the input stream
//            input.read(array);
//            System.out.println("Data read from the file: ");
//
//            // Convert byte array into string
//            String data = new String(array);
//            System.out.println(data);
                while(input.read(array)!=-1){
                    String data=new String(array);
                    System.out.println("printing chunks");
                    System.out.println(data);
                }
            // Close the input stream
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
