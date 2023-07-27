import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VetClinic {
    private List<Animal> animals;
    private List<Doctors> doctors;
    private Map<DoctorOfSwim, Swimable> patientSwimAnddoctorOfSwims;
    private Map<Doctors, Animal> patients;

    public VetClinic() {
        this.animals = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new HashMap<>();
        this.patientSwimAnddoctorOfSwims = new HashMap<>();
    }

    public VetClinic addNewAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public VetClinic addDoctor(Doctors doctor) {
        doctors.add(doctor);
        return this;
    }

    public VetClinic addPatient(Doctors doctor, Animal animal) {
        patients.put(doctor, animal);
        return this;
    }
    public VetClinic addPatientSwimable(DoctorOfSwim doctor, Animal animal) {
        if (animal instanceof Swimable){
            patients.put(doctor, animal);
        }else {
            System.out.printf(" patient %s do dot add to doctor %s", animal, doctor);
        }


        return this;
    }

    public Map<Doctors, Animal> getPatient() {
        return patients;
    }

    public Map<Doctors, Animal> getPatientSwim() {
        Map<Doctors, Animal> result = new HashMap<>();
        for (Map.Entry<Doctors, Animal> k : patients.entrySet()) {
//            System.out.println(k.getValue()+": "+ k.getKey());
            if (k.getKey() instanceof TypeOfSwim) {
                result.put(k.getKey(), k.getValue());
            }

        }
        System.out.println("Пациенты, которые плавают, докторов, который лечет тех, кто плавает:");
        return result;
    }
    public Map<Doctors, Animal> getPatientFly() {
        Map<Doctors, Animal> result = new HashMap<>();
        for (Map.Entry<Doctors, Animal> k : patients.entrySet()) {
//            System.out.println(k.getValue()+": "+ k.getKey());
            if (k.getKey() instanceof TypeOfFly) {
                result.put(k.getKey(), k.getValue());
            }

        }
        System.out.println("Пациенты, которые летают, докторов, который лечет тех, кто летает:");
        return result;
    }

    public Map<DoctorOfRun, Animal> getPatientRun(DoctorOfRun doctor, Animal animal) {
        Map<DoctorOfRun, Animal> result = new HashMap<>();
        if (doctor instanceof TypeOfRun || animal instanceof java.lang.Runnable) {
            result.put(doctor, animal);
        }
        return result;
    }

    public Map<DoctorOfFly, Animal> getPatientFly(DoctorOfFly doctor, Animal animal) {
        Map<DoctorOfFly, Animal> result = new HashMap<>();
        if (doctor instanceof TypeOfFly || animal instanceof Flyable) {
            result.put(doctor, animal);
        }
        return result;
    }

    public List<Animal> getAnimals() {
        System.out.println("Животные Клиники: ");
        return animals;
    }

    public List<Doctors> getDoctors() {
        System.out.println("Doctors: ");
        return doctors;
    }

    public void printAnimals(List animals) {
        List<Animal> result = animals;
        for (int j = 0; j < result.size(); j++) {
            System.out.println(result.get(j));
        }
    }

    public List<Animal> getCanFly() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                result.add(animal);
            }
        }
        System.out.println("Животные которые умеют летать: ");
        return result;
    }

    public List<Animal> getCanSwim() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                result.add(animal);
            }
        }
        System.out.println("Животные которые умеют плавать: ");
        return result;
    }

    public List<Animal> getCanRun() {
        List<Animal> result = new ArrayList<>();
        for (Animal el : animals) {
            if (el instanceof java.lang.Runnable) {
                result.add(el);
            }
        }
        System.out.println("Животные которые умеют бегать:");
        return result;
    }
}
