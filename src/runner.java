import java.util.InputMismatchException;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {

        Car[] cars = new Car[4];

        for (int i = 0; i < cars.length; i++) {
            if (i % 2 == 0) {
                cars[i] = createCar("BMW");
            } else cars[i] = createCar("Mazda");
        }


        for (Car car : cars) {
            car.move();
            if (car instanceof BMW) {
                BMW bmw = (BMW) car;
                System.out.println(bmw.getNumberOfSpoilers());
            }
            if (car instanceof Mazda) {
                Mazda mazda = (Mazda) car;
                System.out.println(mazda.isPraviyRul());
            }
        }
    }

    public static Car createCar(String className) {
        if (className.equals(className)) {
            return createBMW();
//        } else if (className.equals(className)) {
//            return createMazda();
        }
        return null;
    }

    public static BMW createBMW() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("BMW creation started");
            System.out.println("enter cclour");
            String colour = scanner.next();
            System.out.println("enter isAutomat");
            boolean isAutomat = scanner.nextBoolean();
            System.out.println("enter power");
            int power = scanner.nextInt();
            System.out.println("enter numbersOfSpoilers");
            int numberOfSpoilers = scanner.nextInt();
            return new BMW(colour, isAutomat, power, numberOfSpoilers);
        } catch (
                InvalidCarParametrsExceptiopn e)

        {
            System.out.println("Invalid parameter: " + e.getMessage());
            return createBMW();
        } catch (
                InputMismatchException e)

        {
            System.out.println("Invalid input, try again");
            return createBMW();
        }
    }
}