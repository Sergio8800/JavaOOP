package OOP_Patterns.Listener;

import OOP_Patterns.publisher.Publisher;

import java.util.List;

public class Subscriber implements Listener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.printf("Dear %s!%n We have some changes in vacancies:%s%n", name, vacancies);
        System.out.printf("%n====================================%n");

    }

    @Override
    public void handleEventBig(List<String> owner, List<String> vacancies) {
        System.out.printf("Dear %s!%n We have some changes in vacancies:%s%n  company is: %s%n", name, vacancies, owner);
        System.out.printf("%n====================================%n");
    }


}
