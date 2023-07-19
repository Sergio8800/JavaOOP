public class Bird extends Animal implements Flyable {
    private int wing;
    private int speed;
//    public void setSpeed(Integer speed){
//        this.speed = speed;
//    }
    public Bird(){
        this(null, null, null, 2, 30);
    }

    public Bird(String nameAnimal, String ownerName, String diagnosis, Integer wing, Integer speed){
        super(nameAnimal, ownerName, diagnosis);
        this.wing = wing;
        this.speed = speed;
    }

    @Override
    public void fly() {
        System.out.println("I can fly, my speed is " + this.speed + "km/h");
    }
//    @Override
//    public void toGo(){
//        System.out.println("я не умею бегать");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println(getClass().getName() + ": I can fly! ");
//    }
}
