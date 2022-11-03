package racingCar;

public class Bus extends Transport implements  Competing{

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        setCapacity(capacity);
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");

    }

    @Override
    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");

    }

    @Override
    public void pitStop() {
        System.out.println(this.getBrand() + " " + this.getModel() + " совершает пит-стоп!");
    }

    @Override
    public double getBestLapTime() {
        System.out.println(this.getBrand() + " " + this.getModel() + " устанавливает лучшее время круга!");
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        System.out.println(this.getBrand() + " " + this.getModel() + " развивает максимальную скорость!");
        return 0;
    }

    @Override
    public void printInfo() {
        if(capacity==null) {
            System.out.println("Тип не указан");
        } else {
            System.out.println("Вместимость -" + capacity.getEnumerationCapacity());
        }
    }
}