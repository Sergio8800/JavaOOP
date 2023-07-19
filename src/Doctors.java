public class Doctors extends Employee{
    private String specialization;// Специализация
//    private int numberPatient;// Номер принятого пациента
//    private String category;// Категория
//    private String typeOfAnimals;

    public Doctors(String name, String secondName, Integer age, String specialization){
        super(name,secondName,age);
        this.specialization = specialization;

    }

    //    public String getSpecialization() {
//        return specialization;
//    }
//    public void setSpecialization(String specialization) {
//        this.specialization = specialization;
//    }
//    public String typeOfAnimals() {
//        return specialization;
//    }
//    public void typeOfAnimals(String typeOfAnimals) {
//        this.typeOfAnimals = typeOfAnimals;
//    }
}
