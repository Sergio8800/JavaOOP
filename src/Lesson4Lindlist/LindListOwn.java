package Lesson4Lindlist;

import java.util.ArrayList;
import java.util.Iterator;

public class LindListOwn <E> implements Iterable<E>{
    transient Node<E> first;
    transient Node<E> last;
    transient int  size = 0;
    public LindListOwn(){
        last = new Node<E>( first,null,null);
        first = new Node<E>(null,null, last);

    }
//    public void dataStructureInvariants() {
//        assert (size == 0)
//                ? (first == null && last == null)
//                : (first.prev == null && last.next == null);
//    }


    public boolean add(E el) {
        final Node<E> l = last;
        l.setItem(el);
//        System.out.println(l.prev.item);
        last = new Node<>(l, null, null);
        l.setItemNext(last);
        size++;
//        if (l == null)
//            first = newNode;
//        else
//            l.next = newNode;

//        final Node<E> l = last;
//        final Node<E> f = first;
//        System.out.println(f.item);
//        System.out.println(l.item);
//
//        if (f == null) {
//            first = new Node<>(null, el, l);
//            System.out.println(f);
//        } else {
//            last = new Node<>(l, el, null);
//        }

//        if (l.getItem() == null)
//            first = newNode;
//        else
//            l.setItemNext(newNode);

//        System.out.println(l.item);
//        System.out.println("prev  " + l.prev.item);
//        System.out.println("next " + l.next.item);

        return true;
    }
    public E getElbyInx(int index){
        Node<E> result = last.getItemPrev();
//        System.out.println(result);
//        System.out.println("====================");
//        System.out.println(result.next);
//        System.out.println(result.item);
        for (int i = 0; i > index; i--) {
            result = getPrevElm(result);

        }
        return result.getItem();
    }
    private Node<E> getPrevElm(Node<E> item){
        return item.getItemPrev();
    }
    public void removeE(int index){
        Node<E> result = first.getItemNext();
        for (int i = 0; i < index; i++) {
            result = getNextElm(result);
        }
//        System.out.println( result.getItem());
        Node<E> prev = result.getItemPrev();
        if (prev == null) prev = first;
        Node<E> next = result.getItemNext();
        prev.setItemNext(next);
        next.setItemPrev(prev);
        result.clearE();
        size--;

    }
    public void printE(){
//        Node<E> result = last.getItemPrev();
//        for (int i = 0; i < size ; i++) {
//            result = getPrevElm(result);
//            System.out.printf(" %s,",result.item);
        Node<E> result = first.getItemNext();
        for (int i = 0; i < size ; i++) {
            System.out.printf(" %s,",result.item);
            result = getNextElm(result);
     }
        }

    public E getElbyInxNext(int index){
        Node<E> result = first.getItemNext();
        for (int i = 0; i < index; i++) {
            result = getNextElm(result);
        }
        return result.getItem();
    }
    private Node<E> getNextElm(Node<E> item){
        return item.getItemNext();
    }

    @Override
    public String toString() {
        Node<E> res = last;
        return "LindListOwn{" +
                "prev=" + last.prev.item +
                ", item=" + last.item +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int idx = 0;
            @Override
            public boolean hasNext() {
                return idx<size;
            }

            @Override
            public E next() {

                return getElbyInxNext(idx++);
            }
        };
    }


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;


        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }
        public Node<E> getItemNext() {
            return next;
        }

        public void setItemNext(Node<E> next) {
            this.next = next;
        }
        public Node<E> getItemPrev() {
            return prev;
        }

        public void setItemPrev(Node<E> prev) {
            this.prev = prev;
        }
        public Node<E> clearE() {
            Node<E> crear = new Node<E>(null, null, null);
            return crear;
        }


//        @Override
//        public String toString() {
//            return "Node{" +
//                    "item=" + item +
//                    ", next=" + next +
//                    ", prev=" + prev +
//                    '}';
//        }
    }
}
