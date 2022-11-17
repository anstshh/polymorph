package racingCar;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanics = (Mechanic<?>) o;
        return Objects.equals(name, mechanics.name) && Objects.equals(surname, mechanics.surname) && Objects.equals(company, mechanics.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}

