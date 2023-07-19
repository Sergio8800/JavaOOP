public class DoctorOfRun extends Doctors implements TypeOfFly {
    private String typeOfdoctor;
    public DoctorOfRun(String name, String secondName, Integer age, String specialization,
                       String typeOfdoctor){
        super(name,secondName,age, specialization);
        this.typeOfdoctor = typeOfdoctor;

    }

    @Override
    public void type() {
        System.out.println("я могу лечить всех кто бегает");

    }
}
