package com.ev.serializable;

import java.io.*;

class Games
{
    public String gameName = "FootBall";
    @Override
    public String toString() {
        return gameName;
    }
}
class Students implements Serializable
{
     public int id = 10;
     public String name = "Somesh";
     public int age = 22;
     public Games game = new Games();

    @Override
    public String toString() {
        return id+" "+name+" "+age+" "+game;
    }
}

public class JavaSerializationwithAggregation {
    public static void main(String[] args) throws ClassNotFoundException , IOException
    {
        Students std = new Students();

       try( FileOutputStream fos = new FileOutputStream("Test.txt"); ObjectOutputStream ois = new ObjectOutputStream(fos))
        {
            ois.writeObject(std);
        }
        catch(Exception e){
            System.out.println(e);
         }

       try(FileInputStream fis = new FileInputStream("Test.txt"); ObjectInputStream ois = new ObjectInputStream(fis))
       {
            Students obj = (Students) ois.readObject();
           System.out.println(obj);

       }
       catch (Exception e){
           System.out.println(e);
       }
    }
}
