import java.util.Scanner;

public class WeatherAdviso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final: ");
        int fin = scanner.nextInt();

        for (int i = inicio; i <= fin; i++) {
            System.out.printf("%3d : ", i);

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBoom");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBoom");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("BuzzBoom");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }
    }
}
