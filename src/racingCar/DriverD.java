package racingCar;

public class DriverD <A extends Bus&Competing> extends Driver{

    public DriverD(String brand, String model, double engineVolume) {
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