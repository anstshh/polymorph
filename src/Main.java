import racingCar.*;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Main {

    private static void takeDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            takeDiagnosticsTransport(transport);
        }
    }



    public static void takeDiagnosticsTransport (Transport transport) {
        try {
            if (!transport.takeDiagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getModel() + " " + transport.getBrand() + "не прошел диагностику ");
            }
        } catch(RuntimeException e){
                System.out.println(e.getMessage());

            }
        }

                public static void printInfoCar (Car car)
                {
                    System.out.println("Информация о легковом автомобиле:" +
                            " марка " + car.getBrand() +
                            ", модель " + car.getModel() +
                            ", мощность двигателя " + car.getEngineVolume() +
                            " литров. Тип кузова - " + car.getTypeOfBody());
                }

   public static void printInfoByBus(Bus bus) {
        System.out.println("Информация о автобусе:" +
                " марка " + bus.getBrand() +
                ", модель " + bus.getModel() +
                ", мощность двигателя " + bus.getEngineVolume() +
                " литров. Тип вместимости - " + bus.getCapacity());
    }

    public static void printInfoByTruck(Truck truck) {
        System.out.println("Информация о грузовом автомобиле:" +
                " марка " + truck.getBrand() +
                ", модель " + truck.getModel() +
                ", мощность двигателя " + truck.getEngineVolume() +
                " литров. Тип грузоподъёмности - " + truck.getWeight());
    }


                public static <Driver> void main (String[]args){

                    Car kia = new Car("Kia", "Spectra", 1.8, TypeOfBody.COUPE);
                    Car lada = new Car("Lada", "Granta", 1.6, TypeOfBody.COUPE);
                    Car bmw = new Car("BMW", "E", 1.5, TypeOfBody.COUPE);
                    Car nissan = new Car("Nissan", "Almera", 1.3, TypeOfBody.COUPE);

                    Truck gazel = new Truck("Gazel", "1010", 5, Weight.N_3);
                    Truck tayota = new Truck("Tayota", "4568", 3.5, Weight.N_3);
                    Truck gili = new Truck("Gili", "908q", 2.5, Weight.N_3);
                    Truck yuaz = new Truck("Yuaz", "Siberia", 4.5, Weight.N_3);

                    Bus luaz = new Bus("Luaz", "AZ", 4, Capacity.LARGE);
                    Bus paz = new Bus("Paz", "1505", 2.5, Capacity.LARGE);
                    Bus daaz = new Bus("Daaz", "5502", 4, Capacity.LARGE);
                    Bus raf = new Bus("Far", "3002", 2, Capacity.LARGE);

                    takeDiagnostics(kia, lada, bmw, nissan,
                            gazel, tayota, gili, yuaz,
                            luaz, paz, daaz, raf);

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

                    DriverB roger = new DriverB("Roger", true, 40);
                    roger.start(kia);

                    DriverC peter = new DriverC("Peter", true, 12);
                    peter.start(gazel);

                    DriverD lexie = new DriverD("Lexie", true, 2);
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

                    List<Transport> transports = List.of(lada,bmw,kia,luaz,paz,nissan,tayota,yuaz,gazel,raf);

                    Sponsor lukoil =  new Sponsor("Lukoil",50000);
                    lada.addSponsor(lukoil);
                    Driver<Car> denis = new Driver<>("Denis.", 5, "B") {

                    };
                    lada.addDriver(denis);

                    Mechanic<Car> sally = new Mechanic<>("Sally", " Vol", "Extra");
                    lada.addMechanic(sally);

                    for(Transport transport : transports){
                        printInfo(transport);
                    }
                }

    public static void printInfo(Transport transport){
        System.out.println("Информация по автомобилю " + transport.getModel() + transport.getBrand());
        System.out.println("Водители :");
        for(Driver<?> driver : transport.getDrivers()){
            System.out.println(driver.getFullNameDriver());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()){
            System.out.println(sponsor.getNameCompany());
        }
        System.out.println("Механики ");
        for (Mechanic<?> mechanic: transport.getMechanics()){
            System.out.println(mechanic.getSurname() + mechanic.getName());
        }
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.diagnostics()) {
                throw new RuntimeException("Автомобиль" + transport.getBrand() + transport.getModel() + " прошел диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}









