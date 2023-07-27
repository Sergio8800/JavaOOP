package IteratorLesson3;

public class Component {
    private String name;
    private String weight;
    private int power;
    public Component(String name, String weight, Integer power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower(){
        return power;
    }

    @Override
    public String toString() {
        return String.format("%s Состав: %s %s power: %s", getClass().getSimpleName(), this.name, this.weight, this.power);
    }

}
