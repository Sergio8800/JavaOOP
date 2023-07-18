public class Dog extends Cat{
    private boolean freindOfman;
    public Dog (){
        this("Max",null,null, false, 4, true);
    }
    public Dog (String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, int countPaws, boolean freindOfman ){
        super(nameAnimal,ownerName,diagnosis,isVaccinated,countPaws);
        this.freindOfman = freindOfman;
    }
    public void setFreindOfman(boolean arg){
        this.freindOfman = arg;

    }
    public boolean getFreindOfman(){
        return this.freindOfman;
    }
}
