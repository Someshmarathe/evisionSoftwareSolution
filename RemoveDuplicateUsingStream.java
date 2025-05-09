package com;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args){
        List<Integer> arr = List.of(1,2,2,3,3,4,4,5);
        List<Integer> list = arr.stream().distinct().toList();
        System.out.println(list);

        List<Integer> reverse = arr.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(reverse);
    }
}
