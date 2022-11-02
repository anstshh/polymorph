package racingCar;

public class DriverD extends Driver <Bus>{

    public DriverD(String fullNameDriver, boolean driverLicense, int experience) {
        super(fullNameDriver, driverLicense, experience);
    }

    @Override
    public void start(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();
    }

    @Override
    public void stop(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    @Override
    public void refill(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    public void getInTheCar(Bus buses) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет транспортным средством " + buses.getBrand() + " "
                + buses.getModel() + " и будет участвовать в заезде.");
    }
}