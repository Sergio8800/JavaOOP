// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal catBarsik = new Cat();
        Cat catMaxik = new Cat("Maxim", "Nika", "Healthy", false, 4);
        Cat Maxik = new Cat("Maximus", "Nikol", "Healthy", true, 4);
        Cat Max = new Cat();
        System.out.println("-------------------------CAT------скорость передается как параметр-----");
        System.out.println(catBarsik.nameAnimal);
//       ((Cat)(catBarsik)).hunt();
//       catMaxik.hunt();
        catMaxik.setIsVaccinated(true);
        System.out.println(catMaxik.isVaccinated);
        System.out.println(catMaxik.getType("I am "));
//       System.out.format("%s, в следующем году вам будет %s", catMaxik.nameAnimal, catMaxik.toGo(12));
        catMaxik.toGo(15);
        Maxik.toGo(12);
        Max.toGo(17);
        ((Cat) (catBarsik)).toGo(20);
        Bird birdShell = new Bird("Carl", "Ivan", "Healthy", 2, 25);
        Bird birdMis = new Bird("MisisN", "Kirill", "Healthy", 2, 45);
        Bird birdShelly = new Bird();
        System.out.println("-------------------------BIRD-------скорость заложенна в конструктор класса----");
        birdShelly.fly();
        birdShell.fly();
        birdMis.fly();

        Animal dogBarsik = new Dog();
        Dog dogBill = new Dog();
        System.out.println("--------------------- DOG --------------");
        dogBill.setFreindOfman(false);
        System.out.println("friend - " + dogBill.getFreindOfman());

        System.out.println(dogBarsik.TYPE + " по кличке: " + dogBill.nameAnimal);
        ((Dog) (dogBarsik)).toGo(23);

        System.out.println("--------------------- Mouse --------------");
        Mouse mVasiliy = new Mouse();
        mVasiliy.setFreindOfman(false);
        System.out.println(mVasiliy.toString() + " + freind = " + mVasiliy.getFreindOfman());
        mVasiliy.toGo(22);
        System.out.println("--------------------- Fish --------------");
        Fish lili = new Fish();
        System.out.println(lili.TYPE + " name - " + lili.nameAnimal);
        lili.swim(22);
        System.out.println("--------------------- Clinic --------------");
        VetClinic clinic = new VetClinic();
        clinic.addNewAnimal(dogBarsik).addNewAnimal(dogBill).addNewAnimal(catBarsik).addNewAnimal(birdShell)
                .addNewAnimal(birdShelly).addNewAnimal(lili).addNewAnimal(mVasiliy);
        System.out.println(clinic.getAnimals());

        System.out.println(clinic.getCanSwim());
        clinic.printAnimals(clinic.getCanFly());
        System.out.println(clinic.getCanFly());
        clinic.printAnimals(clinic.getCanRun());
        Doctors Igor = new DoctorOfRun("Igor", "Nikolaev", 25,"Doctor", "Runnable");
        Doctors IgorN = new DoctorOfSwim("IgorN", "Niko", 56,"Doctor", "Swimable");
        Doctors IgorKN = new DoctorOfFly("IgorKN", "Valaev", 44,"Doctor", "Flyable");
        Doctors IgorPS = new DoctorOfFly("IgorPS", "Skolaev", 35,"Doctor", "Flyable");
        Doctors IgorRK = new DoctorOfRun("IgorRK", "Nasolaev", 33,"Doctor", "Runnable");
        clinic.addDoctor(Igor).addDoctor(IgorKN).addDoctor(IgorRK).addDoctor(IgorN).addDoctor(IgorPS);
        System.out.println(clinic.getDoctors());
        ((DoctorOfSwim) IgorN).type();
        ((DoctorOfRun) IgorRK).type();
        clinic.addPatient(Igor, catBarsik);
        clinic.addPatient(IgorRK, catMaxik);
        clinic.addPatient(Igor, dogBarsik).addPatient(IgorRK, dogBill).addPatient(IgorKN, birdMis);
        clinic.addPatient(IgorKN, birdShelly);
        clinic.addPatient(IgorPS, birdShell);
        clinic.addPatient(IgorN, lili);
        System.out.println(clinic.getPatient());
        System.out.println(clinic.getPatientSwim());
        System.out.println(clinic.getPatientFly());
    }
}