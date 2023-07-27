package IteratorLesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>{
    // для сортировки переопредляем метод compareTo(Pharmacy o) интерфейса Comparable
    private List<Component> components;
    String name;
    static Integer index = 0;
    public Pharmacy(){
        this.components = new  ArrayList<>();
        index +=1;
        name = "Drag№" +index;
    }
    public Pharmacy addComponent(Component component){
        this.components.add(component);
        return this;
    }
    public List<Component> getComponent(){
        return components;
    }
    public Integer getPowerComp(){
        int power = components.stream().mapToInt(Component::getPower).sum();
//        int power = 0;
//        for (Component item:components) {
//            power +=item.getPower();
//        }

        return power;
    }
public void ComparePh(Pharmacy o){
    int res = this.compareTo(o);
    boolean result;
    if(res==0){
        System.out.println("Объекты "+ this.name + " and "+ o.name + " равны");
    }else if (res>0){
        result = true;
//        System.out.println(result + ": " + this.getClass().getSimpleName() + " > " + o.getClass().getSimpleName());
        System.out.println(result + ": " + this.name + " > " + o.name);
    } else {
        result = false;
        System.out.println(result + ": " + this.name + " < " + o.name );
    }

}
    @Override
    public int compareTo(Pharmacy o) {
        if (o.getPowerComp() > this.getPowerComp()){
            return -1;
        } else if (o.getPowerComp() < this.getPowerComp()) {
            return 1;
        }
        return 0;
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Pharmacy drag = (Pharmacy) obj;
        if(this.name == drag.name && this.getPowerComp() == drag.getPowerComp()) return true;
        return false;
    }
    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + this.getPowerComp(); result = prime * result +
                ((this.getPowerComp() == null) ? 0 : this.getPowerComp().hashCode());
        return result;
    }
    // определяем имя класса в Java
//    public void getClassName()
//    {
//        String className = new Throwable()                // или new `Exception()`
//                .getStackTrace()[0]
//                .getClassName();
//
//        System.out.println("Current Class is " + className);
//    }
//    @Override
//    public boolean hasNext() {
//        if (index <components.size()) return true;
//        return false;
//    }
//    @Override
//    public boolean hasNext() {
//        return index <components.size();
//    }
//    @Override
//    public Component next() {
//        return components.get(index++);
//
//}
    @Override
    public String toString() {
        return String.format("%s %s Состав: %s\n", getClass().getSimpleName(), this.name,this.components);
    }
    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }


// немного разная реализация, здесь может отсуствовать getComponent() - а в классе ComponentIterator без него не работает.
//     @Override
//     public Iterator<Component> iterator() {
//     return new Iterator<>() {
//
//     @Override
//     public boolean hasNext() {
//     return index < components.size();
//     }
//
//     @Override
//     public Component next() {
//     // Component component = components.get(index);
//     // index++;
//     // return component;
//     return components.get(index++);
//     }
//
//     };
//     }

}