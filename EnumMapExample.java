package com.java.collection;

import java.util.EnumMap;

enum Numbers{
     ONE , TOW , THREE , FOUR , FIVE , SIX;
}
public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Numbers , Integer> em = new EnumMap<>(Numbers.class);
        em.put(Numbers.ONE,1);
        em.put(Numbers.THREE,3);
        em.put(Numbers.FOUR,null);
        System.out.println(em.keySet());
        System.out.println(em.values());
        for (Numbers n : Numbers.values()){
            System.out.println(n);
        }
    }
}
