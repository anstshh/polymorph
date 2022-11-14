package racingCar;

public abstract class Driver<A extends Transport&Competing>{

    private String fullNameDriver;
    private String driverLicense;
    private int experience;


    public Driver(String fullNameDriver, boolean driverLicense, int experience) {
        setFullNameDriver(fullNameDriver);
        setDriverLicense(String.valueOf(driverLicense));
        setExperience(experience);

    }

    public abstract void start(A transport);


    public abstract void stop(A transport);


    public abstract void refill(A transport);


    public String getFullNameDriver() {
        return fullNameDriver;
    }

    public void setFullNameDriver(String fullNameDriver) {

        if (fullNameDriver == null || fullNameDriver.isEmpty()) {
            this.fullNameDriver = "No information";
        } else {
            this.fullNameDriver = fullNameDriver;
        }
    }


    public String isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if(driverLicense == null) {
            throw new IllegalArgumentException("Необоходимо указать категорию прав!");
        }
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
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