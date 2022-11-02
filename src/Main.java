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

        System.out.println();
        System.out.println(lada);
        System.out.println(gazel);
        System.out.println(luaz);

        System.out.println();
        daaz.getMaxSpeed();
        yuaz.getBestLapTime();
        kia.pitStop();
        System.out.println();

        System.out.println();

        DriverB roger = new DriverB("Roger", true,40);
        roger.start(kia);

        DriverC peter = new DriverC("Peter",true,12);
        peter.start(gazel);

        DriverD lexie = new DriverD("Lexie",true,2);
        lexie.start(luaz);



    System.out.println();
        roger.start(bmw);
        roger.stop(bmw);
        roger.refill(bmw);

        System.out.println();
        peter.start(tayota);
        peter.stop(tayota);
        peter.refill(tayota);

        System.out.println();
        lexie.start(paz);
        lexie.stop(paz);
        lexie.refill(paz);
    }
}