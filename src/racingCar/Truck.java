package racingCar;

public class Truck extends Transport implements Competing{

    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void repair() {

    }

    @Override
    public void fixTransport() {

    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.75;
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
        return Math.random()>0.75;
    }

    @Override
    public void printType() {
        if(weight==null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = weight.getFrom() == null ? " " : "от " + weight.getFrom() + " ";
            String to = weight.getTo() == null ? " " : "от " + weight.getTo();
            System.out.println("Грузоподъемность авто: " + from + to);
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
        return "Truck{" +
                "weight=" + weight +
                '}';
    }
}