package OOP_Patterns.publisher;

import OOP_Patterns.Listener.Listener;

import java.util.*;

public class HH implements Publisher{
    private List<String> vacancies;
    private List<String> publicities;
    private List<Listener> listeners;
    private List<ListenerInterprise> oners;
    private Map<String, String> onerPublish;


    public HH() {
        this.vacancies = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.publicities = new ArrayList<>();
        this.oners = new ArrayList<>();
        this.onerPublish = new HashMap<>();
        }

    @Override
    public void add(Listener listener) {
         listeners.add(listener);
    }

    @Override
    public void addOner(ListenerInterprise oner) {
        oners.add(oner);
    }

    @Override
    public void remove(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notify(List<Listener> listeners) {
        for (Listener listener: listeners) {
            listener.handleEvent(vacancies);
        }
    }
    @Override
    public void notifyBig(List<Listener> ownerBigNotation) {
        for (Listener listener: ownerBigNotation) {

            for(Map.Entry<String, String> entry: onerPublish.entrySet()) {
                // get key
                String key = entry.getKey();
                // get value
                String value = entry.getValue();
                listener.handleEventBig(Collections.singletonList(key), Collections.singletonList(value));
            }

        }


    }


    @Override
    public void notifyOner(List<ListenerInterprise> publishers) {
        for (ListenerInterprise publisity: publishers) {
            publisity.HandleEvent(publicities);
        }
    }

    public void addMap(String name, String publish){
        onerPublish.put(name,publish);
        notifyBig(listeners);
    }
    public void addVacancy(String vacancy){
        vacancies.add(vacancy);
        notify(listeners);
    }
    public void removeVacancy(String vacancy){
        vacancies.remove(vacancy);
        notify(listeners);
    }
    public void addSearcher(String searcher){
        publicities.add(searcher);
        notifyOner(oners);
    }
}
