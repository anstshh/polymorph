package racingCar;

public class DriverB<A extends Transport&Competing> extends Driver {

    public DriverB(String brand, String model, double engineVolume) {
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