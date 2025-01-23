package org.example;

import java.util.ArrayList;

public class WorkintechList<E> extends ArrayList<E> {

    public void sort() {
        this.sort(null);
    }

    @Override
    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        }
        return super.add(e);
    }

    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);
        if (result) {
            sort();
        }
        return result;
    }
}
