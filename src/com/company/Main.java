package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 5, 8, 5);

        Iterator<Integer> simpleIterator = listOfNumbers.iterator();
        while (simpleIterator.hasNext()){
            System.out.print(simpleIterator.next()+" ");
        }
        System.out.println();
        PairIterator<Integer> pairIterator = new PairIterator<>(listOfNumbers);
        while (pairIterator.hasNext()){
            System.out.println(pairIterator.next()+" ");
        }

    }
}
