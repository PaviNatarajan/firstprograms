package com.cts;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
 interface Add
{
    public int getSum(int a,int b);
    
}
public class Test123 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       // Add add1 =( a,  b) ->  a+b ;
       // System.out.println(add1.getSum(5, 6));
        
    	 List<String> words = 
                 Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
        words.forEach(System.out::println);
    }
}

