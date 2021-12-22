package com.company.Pair;

import java.util.ArrayList;
import java.util.Iterator;

public class PointList<E> extends ArrayList<E> implements Iterable<E> {
    public PairIterator getPairIterator() {
        return new PairIterator();
    }

    class PairIterator implements Iterator<Pair<E>> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex != PointList.this.size();
        }

        @Override
        public Pair<E> next() {
            return new Pair<>(
                    PointList.this.get(currentIndex++),
                    PointList.this.get(hasNext() ? currentIndex : 0)
            );
        }

        @Override
        public void remove() {
            PointList.this.remove(--currentIndex);
        }
    }
}
