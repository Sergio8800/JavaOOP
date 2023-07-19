public interface Runnable {
    default void toGo(Integer speed) {
        System.out.println("Беги!" + " Твоя максимальная скорость = " + speed);
    }


}
