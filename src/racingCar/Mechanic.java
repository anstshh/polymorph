package racingCar;

import java.util.Set;

public class Mechanic <T extends Transport> {
    private final String name;
    private final String surname;
    private String company;
    public Set<T> MaintainingCars;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public Set<T> getMaintainingCars() {
        return MaintainingCars;
    }

    public void setMaintainingCars(Set<T> maintainingCars) {
        MaintainingCars = maintainingCars;
    }

    public void maintainCars(T car) {
        System.out.println("Механик " + this.name + " провел техобслуживание машины " + car.getBrand());
    }

    public void fixCar(T car) {
        System.out.println("Механик " + this.name + " починил машину " + car.getBrand());
    }
}

