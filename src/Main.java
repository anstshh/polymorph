import racingCar.Bus;
import racingCar.Driver1;
import racingCar.Passenger;
import racingCar.Truck;

public class Main {
        public static void main(String[] args) {

            Passenger kia = new Passenger("Kia", "Spectra", 1.8);
            Passenger lada = new Passenger("Lada", "Granta", 1.6);
            Passenger bmw = new Passenger("BMW", "E", 1.5);
            Passenger nissan = new Passenger("Nissan", "Almera", 1.3);

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

            Driver1<Passenger> roger = new Driver1<>("Roger", true,40);
            roger.startMoving(kia);

            Driver1<Truck> peter = new Driver1<>("Peter",true,12);
            peter.startMoving(gazel);

            Driver1<Bus> lexie = new Driver1<>("Lexie",true,2);
           lexie.startMoving(raf);
        }


    public static void printInfoPassenger(Passenger passenger) {
            System.out.println(passenger.getBrand() + " " + passenger.getModel() + ", обьем двигателя " + passenger.getEngineVolume());
        }
        public static void printInfoTruck(Truck truck) {
            System.out.println(truck.getBrand() + " " + truck.getModel() + ", обьем двигателя " + truck.getEngineVolume());
        }
        public static void printInfoBus(Bus bus) {
            System.out.println(bus.getBrand() + " " + bus.getModel() + ", обьем двигателя " + bus.getEngineVolume());
        }
    }