package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MutliCatch {
    public static void main(String[] args) {
        int arr[] = {1,3,4};
        int i = 10;
        int j = 0;
        try {
            if(j==0){
                throw new AException();
            }
            if(j==-1){
                throw new BException();
            }
            int result = arr[5] / j;

            File file = new File("");
            FileWriter writer = new FileWriter(file);
            writer.write("abc");
            writer.close();


        }catch (IOException | ArithmeticException | AException | BException | ArrayIndexOutOfBoundsException e ) {
            throw new RuntimeException(e);
        }

    }

    static class AException extends Exception{

    }

//    static class BException extends AException{
//
//    }

    static class BException extends Exception{

    }
}
