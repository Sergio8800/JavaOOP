public class Cat extends Animal{
    private int countPaws;

    public Cat (){
        this("Max",null,null, false, 4);
    }
    public Cat (String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, int countPaws ){
        super(nameAnimal,ownerName,diagnosis,isVaccinated);
        this.countPaws = countPaws;
    }
    private void wakeUp (){
        System.out.println(TYPE + "wack up");
    }
    private void findFood (){
        System.out.println(TYPE + "find food");
    }
    private void eat (){
        System.out.println(TYPE + " ate");
    }
    private void sleep (){
        System.out.println(TYPE + " sleeping");
    }
    public void hunt(){

        wakeUp();
        findFood ();
        eat ();
        sleep();
    }
    @Override
    public void fly() {
        System.out.println("Я не умею летать! ");
    }
    @Override
    public void sweem() {
        System.out.println("Я умею плавать, но не долго!");
    }
}
