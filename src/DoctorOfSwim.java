import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DoctorOfSwim extends Doctors implements TypeOfSwim {
    private String typeOfdoctor;
    public DoctorOfSwim(String name, String secondName, Integer age,  String specialization,
                       String typeOfdoctor){
        super(name,secondName,age,specialization);
        this.typeOfdoctor = typeOfdoctor;

    }


    @Override
    public void type() {
        System.out.println("я лечу тех кто плавает");
    }
}
