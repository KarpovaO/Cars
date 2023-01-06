import ru.pflb.vehicles.Car;
import ru.pflb.vehicles.Lorry;
import ru.pflb.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[]{new Lorry("КАМАЗ "), new SportCar("BMW "), new Car("Жигули ")};
        for (Car car: cars) {
            System.out.println(car);
            car.start();
            System.out.println("------------------------------------");

        }
    }
}
