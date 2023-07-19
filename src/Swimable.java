public interface Swimable {
    default void swim(Integer speed) {
        System.out.println("Плыви!" + " Твоя максимальная скорость = " + speed);
    }
//    void swim();
}
