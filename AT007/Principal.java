package AT007;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        double dollar;
        

        ConversaoMoeda conversaoMoeda = new ConversaoMoeda();

        System.out.println("Digite O Valor em Dollars: $ ");
        dollar = lerValorConsole.nextDouble();
        
        conversaoMoeda.ConversaoMoedaMetodo(dollar);


        System.out.printf("O Valor de $%.2f convertido em R$%.2f",dollar,conversaoMoeda.getConversor());
        
   }


}
