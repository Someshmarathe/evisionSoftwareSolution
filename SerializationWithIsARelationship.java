package com.ev.serializable;

import java.io.*;

class Game implements Serializable
{
    public String gameName = "FootBall";
    @Override
    public String toString() {
        return gameName;
    }
}
class Studt extends Game
{
    public int id = 10;
    public String name = "Somesh";
    public int age = 22;

    @Override
    public String toString() {
        return id+" "+name+" "+age+" "+gameName;
    }
}

public class SerializationWithIsARelationship {
    public static void main(String[] args){
        Studt std = new Studt();

        try(FileOutputStream fos = new FileOutputStream("Test.txt"); ObjectOutputStream ois = new ObjectOutputStream(fos))
        {
            ois.writeObject(std);
        }
        catch(Exception e){
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("Test.txt"); ObjectInputStream ois = new ObjectInputStream(fis))
        {
            Studt obj = (Studt) ois.readObject();
            System.out.println(obj);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
