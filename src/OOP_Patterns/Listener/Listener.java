package OOP_Patterns.Listener;

import OOP_Patterns.publisher.Publisher;

import java.util.List;

public interface Listener {
    void handleEvent(List<String> vacancies);
    void handleEventBig(List<String> owner, List<String> vacancies);

}
