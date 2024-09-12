import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car(true, i));
        }
        for (int i = 0; i < 10; i++) {
            //FOR INUTIL
            System.out.println(i);
        }
        System.out.println(cars);
    }
}