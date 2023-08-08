package OOP_Patterns.publisher;

import java.util.List;

public class OnerPublisity implements ListenerInterprise {
    private String nameCompany;
    private String vocance;

    public OnerPublisity(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public void HandleEvent(List<String> publicity) {
        System.out.printf("Dear %s!%n Bingo!!!! new proposition:%s%n", nameCompany, publicity);
        System.out.printf("%n====================================%n");
    }
}
