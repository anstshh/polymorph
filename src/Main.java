import racingCar.*;

public class Main {
    public static void main(String[] args) {

        Car kia = new Car("Kia", "Spectra", 1.8);
        Car lada = new Car("Lada", "Granta", 1.6);
        Car bmw = new Car("BMW", "E", 1.5);
        Car nissan = new Car("Nissan", "Almera", 1.3);

        Truck gazel = new Truck("Gazel", "1010", 5);
        Truck tayota = new Truck("Tayota", "4568", 3.5);
        Truck gili = new Truck("Gili", "908q", 2.5);
        Truck yuaz = new Truck("Yuaz", "Siberia", 4.5);

        Bus luaz = new Bus("Luaz", "AZ", 4);
        Bus paz = new Bus("Paz", "1505", 2.5);
        Bus daaz = new Bus("Daaz", "5502", 4);
        Bus raf = new Bus("Far", "3002", 2);

        printInfoPassenger(kia);
        printInfoPassenger(lada);
        printInfoPassenger(bmw);
        printInfoPassenger(nissan);
        System.out.println();
        printInfoTruck(gazel);
        printInfoTruck(tayota);
        printInfoTruck(gili);
        printInfoTruck(yuaz);
        System.out.println();
        printInfoBus(luaz);
        printInfoBus(paz);
        printInfoBus(daaz);
        printInfoBus(raf);

        System.out.println();

        DriverB roger = new DriverB("Roger", true,40);
        roger.startMoving(kia);

        DriverC peter = new DriverC("Peter",true,12);
        peter.startMoving(gazel);

        DriverD lexie = new DriverD("Lexie",true,2);
        lexie.startMoving(raf);
    }


    public static void printInfoPassenger(Car passenger) {
        System.out.println(passenger.getBrand() + " " + passenger.getModel() + ", обьем двигателя " + passenger.getEngineVolume());
    }
    public static void printInfoTruck(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + ", обьем двигателя " + truck.getEngineVolume());
    }
    public static void printInfoBus(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + ", обьем двигателя " + bus.getEngineVolume());
    }
}