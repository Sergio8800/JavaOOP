package OOP_Patterns.publisher;

import OOP_Patterns.Listener.Listener;

import java.util.HashMap;
import java.util.List;

public interface Publisher {
    void add(Listener listener);
    void addOner(ListenerInterprise oner);
    void remove(Listener listener);
    void notify(List<Listener> listeners);
    void notifyOner(List<ListenerInterprise> publicity);
    void notifyBig(List<Listener> ownerBigNotation);

}
