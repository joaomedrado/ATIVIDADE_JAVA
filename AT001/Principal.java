import java.util.Scanner;
import java.util.Locale;
public class Principal{
    public static void main(String[] args) {
        
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        Conversor conversor = new Conversor();

        double temperaturaCelsius;
        int temperaturaFahrenheitInteira;

        System.out.println("Digite a temperatura em Celsius para conversão: ");
        temperaturaCelsius = lerValorConsole.nextDouble();

        conversor.ConversorMetodo(temperaturaCelsius);

        temperaturaFahrenheitInteira = (int) conversor.getConversor();

        System.out.printf("A Conversão de %.2fºC para %dºF é: ", temperaturaCelsius,temperaturaFahrenheitInteira);

    }
}