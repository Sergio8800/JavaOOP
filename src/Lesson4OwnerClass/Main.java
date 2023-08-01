package Lesson4OwnerClass;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        GBArrayList<Integer> numb = new GBArrayList<>();
        GBlist<String> str1 = new GBArrayList<>();
        str1.add("dafdac43fcar");
        str1.add("dafd15415ar");
        str1.add("dafd1d45trar");
        str1.add("dafdar1234fer");
        numb.add(33);
        numb.add(433);
        numb.add(335);
        numb.add(343);
        System.out.println(numb);
        numb.add(2,3344);
        System.out.println(numb);
        numb.remove(2);
        System.out.println(numb);
        numb.update(2,44665);
        System.out.println(numb);
        System.out.println(str1);
        numb.remove(5);
    }
}
