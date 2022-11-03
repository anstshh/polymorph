package racingCar;

public class Car extends Transport implements Competing{

    public TypeBody typeBody;

    public Car(String brand, String model, double engineVolume, TypeBody typeBody) {
        super(brand, model, engineVolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
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
        if(typeBody == null) {
            System.out.println("Тип не указан");
        } else {
            System.out.println("Тип кузова -" + typeBody.getEnumerationTypeBody());
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeBody=" + typeBody +
                '}';
    }
}
