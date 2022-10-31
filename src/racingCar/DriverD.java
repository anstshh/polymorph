package racingCar;

public class DriverD <A extends Bus & Competing> extends Driver{

    public DriverD(String fullNameDriver, boolean driverLicense, int experience) {
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

    public void getInTheCar(A bus) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет транспортным средством " + bus.getBrand() + " "
                + bus.getModel() + " и будет участвовать в заезде.");
    }
}