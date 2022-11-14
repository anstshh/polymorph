package racingCar;

public class Car extends Transport implements Competing{

    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void repair() {

    }

    @Override
    public void fixTransport() {

    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.7;
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
    public boolean takeDiagnostics() {
        return Math.random()>0.7;
    }

    @Override
    public void printType() {
        if(typeOfBody==null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто: " + typeOfBody);
        }

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
    public String toString() {
        return "Car{" +
                "typeBody=" + typeOfBody +
                '}';
    }
}
