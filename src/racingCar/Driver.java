package racingCar;

abstract class Driver<A extends Transport&Competing>{

    private String fullNameDriver;
    private boolean driverLicense = true;
    private int experience;

    public Driver(String fullNameDriver, boolean driverLicense, int experience) {
        setFullNameDriver(fullNameDriver);
        setDriverLicense(driverLicense);
        setExperience(experience);

    }

    public abstract void startMoving(A transport) {
        System.out.println("Водитель " + fullNameDriver + " управляет транспортным средством " + transport.getBrand() + " и будет участвовать в заезде.");
    }

    public abstract void finishMoving(A transport) {

    }

    public abstract void refuelTheCar(A transport) {

    }

    public String getFullNameDriver() {
        return fullNameDriver;
    }

    public void setFullNameDriver(String fullNameDriver) {
        this.fullNameDriver = fullNameDriver;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullNameDriver='" + fullNameDriver + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience=" + experience +
                '}';
    }
}