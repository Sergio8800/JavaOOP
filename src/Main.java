// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Animal dogBarsik = new Dog();
       Dog dogBill = new Dog();
       System.out.println(dogBarsik.TYPE);
       Animal catBarsik = new Cat();
       Cat catMaxik = new Cat();
       Bird birdShell = new Bird();

       System.out.println(catBarsik.nameAnimal);
       ((Cat)(catBarsik)).hunt(); // во второй лекции показали как изменить поведение экземпляря, если он от базового создан.
       catMaxik.hunt();
       catMaxik.setIsVaccinated(true);
       System.out.println(catMaxik.isVaccinated);
       dogBill.setFreindOfman(false);
       System.out.println("friend - " + dogBill.getFreindOfman());
       System.out.println(catMaxik.getType("I am "));

       dogBarsik.toGo();
       dogBarsik.fly();
       dogBill.sweem();
       System.out.println("--------------------- Mouse --------------");
       Mouse mVasiliy = new Mouse();
       mVasiliy.setFreindOfman(false);
       System.out.println(mVasiliy.toString() + " + freind = " + mVasiliy.getFreindOfman());
       mVasiliy.toGo();
       mVasiliy.fly();
       mVasiliy.sweem();
    }
}