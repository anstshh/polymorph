package racingCar;

public class DriverB<A extends Transport&Competing> extends Driver {

    public DriverB(String fullNameDriver, boolean driverLicense, int experience) {
        super(fullNameDriver, driverLicense, experience);
    }

    @Override
    public void start(Transport transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();

    }

    @Override
    public void refill(Transport transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    @Override
    public void stop(Transport transport){
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    public void getInTheCar(A car) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет транспортным средством " + car.getBrand() + " "
                + car.getModel() + " и будет участвовать в заезде.");
    }
}