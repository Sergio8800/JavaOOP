package OOP_Patterns;

import OOP_Patterns.Listener.Subscriber;
import OOP_Patterns.publisher.HH;
import OOP_Patterns.publisher.OnerPublisity;

public class EventMain {
    public static void main(String[] args) {
        HH hh = new HH();
       hh.addOner(new OnerPublisity("INTER"));

        hh.addVacancy("Middle Developer");
        hh.addSearcher("I search the Middle Developer");
//        hh.addVacancy("Senior Developer");

//        hh.add(new Subscriber("Oleg"));
//        hh.add(new Subscriber("Misha"));
        hh.add(new Subscriber("Tanya"));

//        hh.addVacancy("Junior Developer");

        hh.removeVacancy("Junior Developer");
        hh.addMap("InertALLO", "Developer JAVA");
    }
}
