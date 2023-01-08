import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;
import ru.pflb.vehicles.Car;
import ru.pflb.vehicles.Lorry;
import ru.pflb.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Lorry("КАМАЗ ", new Engine(6, "CUMMINS "), new Driver("Вася Иванов ", 20, 2, 5566545)),
                new SportCar("BMW ", new Engine(5, "Valvetronic "), new Driver("Жанна Начинка ", 40, 22, 1234567)),
                new Car("Жигули ", new Engine(3, "ВАЗ-2103"), new Driver("Петя ", 30, 3, 2589654))
        };

        for (Car car : cars) {
            System.out.println(car);
            car.start();
            System.out.println("------------------------------------");

        }

    }
}
