package racingCar;

public class DriverC<A extends Truck&Competing> extends Driver{

    public DriverC(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void finishTheMovement() {
        super.finishTheMovement();
    }
}