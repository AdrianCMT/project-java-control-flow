public class WeatherAdviso {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String resultado = "";

            if (i % 3 == 0) resultado += "Fizz";
            if (i % 5 == 0) resultado += "Buzz";

            if (resultado.isEmpty()) {
                System.out.printf("%3d : %3d%n", i, i);
            } else {
                System.out.printf("%3d : %s%n", i, resultado);
            }
        }
    }
}