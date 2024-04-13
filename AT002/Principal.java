package AT002;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        IMC imc = new IMC();

        double peso;
        double altura;

        System.out.println("Digite seu Peso(Kg): ");
        peso = lerValorConsole.nextDouble();

        System.out.println("Digite sua Altura: ");
        altura = lerValorConsole.nextDouble();

        imc.CalculoIMCMetodo(peso, altura);

        
   }


}
