package AT003;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        CalculoMedia media = new CalculoMedia();

        double notaONe;
        double notaTwo;
        double notaThree;

        System.out.println("Digite sua Nota 1: ");
        notaONe = lerValorConsole.nextDouble();

        System.out.println("Digite sua Nota 2: ");
        notaTwo = lerValorConsole.nextDouble();

        System.out.println("Digite sua Nota 3: ");
        notaThree = lerValorConsole.nextDouble();

        media.CalculoMediaMetodo(notaONe, notaTwo, notaThree);

        System.out.printf("A Sua Média é %.2f", media.getMedia());
        
   }


}
