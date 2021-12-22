package com.company.Pair;

public class Pair<E> {
    private final E firstElementOfPair;
    private final E secondElementOfPair;

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
        return "\033[01;38;05;24mPair \033[0m{" + firstElementOfPair +
                ", " + secondElementOfPair +
                '}';
    }
}
