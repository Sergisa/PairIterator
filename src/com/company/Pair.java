package com.company;

import java.util.Iterator;
import java.util.List;

public class Pair<E> {
    E firstElementOfPair;
    E secondElementOfPair;

    public Pair(E firstElementOfPair, E secondElementOfPair) {
        this.firstElementOfPair = firstElementOfPair;
        this.secondElementOfPair = secondElementOfPair;
    }

    public E getFirstElementOfPair() {
        return firstElementOfPair;
    }

    public E getSecondElementOfPair() {
        return secondElementOfPair;
    }

    @Override
    public String toString() {
        return "Pair{" +
                firstElementOfPair +
                ", " + secondElementOfPair +
                '}';
    }
}
