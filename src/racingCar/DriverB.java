package racingCar;

public class DriverB extends Driver <Car> {

    public DriverB(String fullNameDriver, boolean driverLicense, int experience) {
        super(fullNameDriver, driverLicense, experience);
    }

    @Override
    public void start(Car transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();

    }

    @Override
    public void refill(Car transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    @Override
    public void stop(Car transport){
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    public void getInTheCar(Car cars) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет транспортным средством " + cars.getBrand() + " "
                + cars.getModel() + " и будет участвовать в заезде.");
    }
}