package SOLID.homework;

public class User implements UserReport, UserSave{
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void report() {
         System.out.println("Report for user: " + this.getName());
      }

    @Override
    public void save() {
        System.out.println("Save for user: " + this.getName());
    }


//    public void save(){
//        Persister persister = new Persister(this);
//        persister.save();
//    }
//
//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}
