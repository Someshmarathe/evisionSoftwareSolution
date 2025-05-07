package com.ev.serializable;

import java.io.*;

public class SerializationWithStatic implements Serializable
{
    int a = 10;
    String name = "somesh";
    static String company= "evision";

    @Override
    public String toString() {
        return a+" "+name+" "+company;
    }

    public static void main(String[] args) throws IOException {
        try(FileOutputStream fis = new FileOutputStream("Test.txt"); ObjectOutputStream ois = new ObjectOutputStream(fis)){
             ois.writeObject(new SerializationWithStatic());
            System.out.println(new SerializationWithStatic());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
