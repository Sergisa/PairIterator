package com.company;

import java.util.Iterator;
import java.util.List;

public class PairIterator<E> implements Iterator<Pair<E>> {
    int cursor;
    List<E> elementsList;

    public PairIterator(List<E> elementsList) {
        this.elementsList = elementsList;
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor != elementsList.size();
    }

    @Override
    public Pair<E> next() {
        int i = cursor;
        cursor = i + 1;
        return !hasNext() ? new Pair<>(elementsList.get(i), elementsList.get(0)) : new Pair<>(elementsList.get(i), elementsList.get(i + 1));
    }
}
