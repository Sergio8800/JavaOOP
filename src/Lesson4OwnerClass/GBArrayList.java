package Lesson4OwnerClass;

import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<T> implements GBlist<T> {
    private T[] values;
    @SuppressWarnings("unchecked") // что бы не подсвечилвалось ошибка реализации(в будущем возможность не сообтв-я классов
    public GBArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
        try {
            T[] tempArray = values;
            values = (T[]) new Object[tempArray.length + 1];
            System.arraycopy(tempArray, 0, values, 0, tempArray.length);//tempArray.length - кол-во вставленых эл-в.
            values[values.length - 1] = t;
            return true;
        } catch (ClassCastException e) {
            return false;
        }

    }

    @Override
    public boolean add(int index, T t) {
        try {
            T[] tempArray = values;
            values = (T[]) new Object[tempArray.length + 1];
            System.arraycopy(tempArray, 0, values, 0, index);
            System.arraycopy(tempArray, index, values, index+1, tempArray.length-index);
            values[index] = t;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public void remove(int index) {
        try {
            T[] tempArray = values;
            values =  (T[]) new Object[tempArray.length-1];
            System.arraycopy(tempArray, 0, values, 0, index);
            System.arraycopy(tempArray, index+1, values, index,tempArray.length-index-1);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Выход за размер массива");
        }

    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }

    @Override
    public Object[] toArray() {
        return values;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(values);
    }
    @Override
    public String toString() {
        return "GBArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
