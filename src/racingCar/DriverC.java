package racingCar;

public class DriverC<A extends Truck&Competing> extends Driver{

    public DriverC(String fullNameDriver, boolean driverLicense, int experience) {
        super(fullNameDriver, driverLicense, experience);
    }

    @Override
    public void start(Transport transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();
    }

    @Override
    public void stop(Transport transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    @Override
    public void refill(Transport transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    public void getInTheCar(A trucks) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет транспортным средством " + trucks.getBrand() + " "
                + trucks.getModel() + " и будет участвовать в заезде.");
    }
}