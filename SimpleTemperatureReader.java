import java.util.Scanner;

public class SimpleTemperatureReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsiusTemperature = input.nextDouble();
        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheitTemperature);
        input.close();
    }
}
