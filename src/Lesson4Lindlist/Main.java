package Lesson4Lindlist;

public class Main {
    public static void main(String[] args) {
        LindListOwn<Integer> numb = new LindListOwn<>();
        numb.add(55);
        numb.add(442355);
        numb.add(335145);
        numb.add(2251545);
        System.out.println(numb);
        System.out.println(numb.getElbyInx(3));

        numb.printE();
        System.out.println("");
        System.out.println("================= до удаления элемента");
//        System.out.println(numb.getElbyInxNext(2));

        for (Object n: numb) {
            System.out.println(n);
        }

        System.out.println("================= После удаления элемента");
        numb.removeE(0
        );
        numb.printE();
    }

}
