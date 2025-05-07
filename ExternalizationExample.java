package com.ev.serializable;

import java.io.*;

class Employe implements Externalizable {
    public int id = 1;
    public String name = "somesh";

    public Employe(){};

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Writing Processing....");
        try{
             Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        out.writeInt(id);
        out.writeObject(name);
        System.out.println("Complete Writing..");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Reading Processing....");
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
          id = in.readInt();
          name = (String) in.readObject();
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
}

public class ExternalizationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
          Employe emp = new Employe();
          try(FileOutputStream obj = new FileOutputStream("main.txt");ObjectOutputStream out = new ObjectOutputStream(obj))
          {
               out.writeObject(emp);
          }
          catch(Exception e){
              System.out.println(e);
          }

        try(FileInputStream obj = new FileInputStream("main.txt");ObjectInputStream in = new ObjectInputStream(obj))
        {
             Employe ep = (Employe) in.readObject();
             System.out.println(ep);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
