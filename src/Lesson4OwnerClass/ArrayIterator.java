package Lesson4OwnerClass;


import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private int index;
    private T[] value; // alt+insert вызов конструктора

    public ArrayIterator(T[] value) {
        this.value = value;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.value.length;
    }

    @Override
    public T next() {
        return this.value[index++];
    }
}
