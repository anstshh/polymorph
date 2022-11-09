package racingCar;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public String getBrand() {
        return brand;
    }

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "No information";
        } else {
            this.brand = brand;
        }
        if (model == null && model.isEmpty()) {
            this.model = "No information";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 000;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanik){
        mechanics.add(mechanik);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechaniks() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }


    public void setBrand(String brand) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "No information";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null && model.isEmpty()) {
            this.model = "No information";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 000;
        } else {
            this.engineVolume = engineVolume;
        }
    }





    public abstract void repair();

    public abstract void fixTransport();
    public abstract boolean diagnostics();


    public boolean service() {
        return service();
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    //public abstract void printType();


    public abstract boolean takeDiagnostics();



    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }


}