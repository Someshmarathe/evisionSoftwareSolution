package com.java.collection;

import java.util.EnumSet;

enum Number{
     ONE , TWO , THREE , FOUR , FIVE;
}
public class EnumSetExample {
    public static void main(String[] args){

        EnumSet<Number> enumset = EnumSet.allOf(Number.class);

        enumset.remove(Number.FIVE);

        enumset.add(Number.FIVE);

        for(Number n : Number.values()){
            System.out.println(n);
        }

        System.out.println(enumset);
    }
}
