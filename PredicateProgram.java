package com.java.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateProgram {
    public static void main(String[] args){
        Predicate<Integer> p = (a)-> a > 10;
        Predicate<Integer> p2 = (a)-> a > 5;

        System.out.println(p.and(p2).test(6));

         System.out.println(p.or(p2).test(8));

         System.out.println(p.negate().test(6));

        Predicate<String> p3 = (a)-> a.length() > 5 && a.charAt(0) == Character.toUpperCase(a.charAt(0));
        Predicate<String> p5 = (a) -> a.charAt(a.length()-1) == Character.toUpperCase(a.charAt(a.length()-1));
        System.out.println(p3.and(p5).test("SomesH"));


    }
}
