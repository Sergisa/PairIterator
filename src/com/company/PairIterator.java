package com.company;

import java.util.Iterator;
import java.util.List;

public class PairIterator<E> implements Iterator<Pair<E>> {
    int cursor;
    List<E> elementsList;
    private final Type iteratorType;

    public PairIterator(List<E> elementsList, Type t) {
        this.elementsList = elementsList;
        cursor = 0;
        iteratorType = t;
    }

    public PairIterator(List<E> elementsList) {
        this(elementsList, Type.CLOSED);
    }

    @Override
    public boolean hasNext() {
        return cursor != ((iteratorType == Type.CLOSED) ? elementsList.size() : elementsList.size() - 1);
    }

    @Override
    public Pair<E> next() {
        int i = cursor;
        cursor = i + 1;
        if (iteratorType == Type.CLOSED) {
            return new Pair<>(elementsList.get(i), elementsList.get(hasNext() ? i + 1 : 0));
        } else {
            return new Pair<>(elementsList.get(i), elementsList.get(i + 1));
        }
    }

    @Override
    public void remove() {
        elementsList.remove(cursor);
    }

    enum Type {
        OPENED,
        CLOSED
    }
}
