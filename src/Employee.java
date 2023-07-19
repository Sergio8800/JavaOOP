import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected String name;
    protected String secondName;
    protected Integer age;
//    protected List<String> titleJob = new ArrayList<String>("Runnable", "Swimable", "Flyable");
    protected final String TYPE = getClass().getSimpleName();

    public Employee() {
        this("Basic Employee", null, 20);
    }

    public Employee(String name, String secondName, Integer age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
//        this.titleJob = titleJob;
    }
    public String getType(){
        return TYPE;

    }
    @Override
    public String toString (){
        return String.format("%s{name = %s, age = %s}", TYPE, name, age);
    }
}
