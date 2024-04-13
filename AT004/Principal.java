package AT004;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        double variavelDouble;

        Casting  casting = new Casting();

        System.out.println("Digite o Valor da Sua Variavel Double: ");
        variavelDouble = lerValorConsole.nextDouble();

        casting.ConversorTipoMetodo(variavelDouble);


        System.out.printf("O Tipo da Sua Variavel Double %.2f agora é do Tipo INT %d", variavelDouble, casting.getCasting());
        
   }


}
