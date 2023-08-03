package composition;
class engine
{
   private String engineType;
   int enginePower;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public engine(String engineType, int enginePower) {
        this.engineType = engineType;
        this.enginePower = enginePower;
    }
}
class car
{

    String carName;
    private final engine objEngine;

    public String getCarName() {
        return carName;
    }

    public engine getObjEngine() {
        return objEngine;
    }

    public car(String carName, engine objEngine) {
        this.carName = carName;
        this.objEngine = objEngine;
    }
}
public class composition_demo {
    public static void main(String args[])
    {
        engine myeng = new engine("petrol",3000);
        car mycar=new car("bmw",myeng);
        System.out.println("name of car "+ mycar.getCarName()+" is having engine of "+ myeng.getEngineType()+" with power of "+myeng.getEnginePower());
    }
}
