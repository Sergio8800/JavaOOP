public class Bird extends Animal {
    private int wing;
    public Bird(){
        this(null, null, null, 2);
    }

    public Bird(String nameAnimal, String ownerName, String diagnosis, Integer wing){
        super(nameAnimal, ownerName, diagnosis);
        this.wing = wing;
    }
    @Override
    public void toGo(){
        System.out.println("я не умею бегать");
    }
    @Override
    public void fly(){
        System.out.println("я не умею летать, но некоторые из нас умеют нырять");
    }
}
