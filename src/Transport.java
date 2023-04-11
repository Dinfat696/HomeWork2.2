public class Transport implements TransportInterface {
    protected String modelName;
    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    @Override
    public String getModelName() {
        return modelName;
    }


    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }


    @Override
    public void updateTyres() {
            System.out.println("Меняем покрышку");
        }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}


