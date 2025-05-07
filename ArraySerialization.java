package com.ev.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArraySerialization {
    public static void main(String[] args) throws Exception {

        Integer[] data = {1,2,3,4};

        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("array.txt"));
        out.writeObject(data);
        out.close();

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("array.txt"));
        Integer[] result = (Integer[]) in.readObject();
        in.close();

        for (Integer s : result) {
            System.out.print(s+" ");
        }

    }
}
