package com.java.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterface {

     public int function(int a){
         return a;
     }

    public static void main(String[] args) {

         FunctionalInterface obj = new FunctionalInterface();

        BiFunction<Integer , Integer , Integer> addtion = (take1 , take2)-> take1 + take2;
        BiFunction<Integer , Integer , Integer> substraction = (take1 , take2)-> take1 - take2;
        BiFunction<Integer , Integer , Integer> multiplication = (take1 , take2)-> take1 * take2;
        BiFunction<Integer , Integer , Integer> divide = (take1 , take2)-> take1/take2;
        System.out.println(multiplication.apply(32,3));

        Function<Integer , Integer> fun = obj::function;
        System.out.println(fun.apply(10));


    }
}
