public class Bicycle {
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre(Bicycle other) {
        if (this.wheelsCount > other.wheelsCount) {
            System.out.println("Не Меняем покрышку");
        } else {
            System.out.println("Меняем покрышку");
        }
    }
}

