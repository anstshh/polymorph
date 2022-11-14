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

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public void repair() {

    }

    @Override
    public void fixTransport() {

    }

    @Override
    public boolean diagnostics() {
        return false;
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
    public boolean takeDiagnostics() {
        System.out.println("“Автобус "+ getBrand() + " " + getModel() + " в диагностике не требуется”");
        return true;
    }

    @Override
    public void printType() {
        if(capacity==null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom()+" до " + capacity.getTo());
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



}