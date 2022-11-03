package racingCar;

public class Truck extends Transport implements Competing{

    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    @Override
    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");

    }

    @Override
    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение.");

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
        if(weight==null) {
            System.out.println("Тип не указан");
        } else {
            System.out.println("Грузоподъемность -" + weight.getEnumerationWeight());
        }
    }

    public Weight getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}';
    }
}