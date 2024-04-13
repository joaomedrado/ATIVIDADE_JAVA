package AT006;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        double precoProduto;
        int quantidade;

        CalculoPreco calculoPreco = new CalculoPreco();

        System.out.println("Digite O Preço do Produto: ");
        precoProduto = lerValorConsole.nextDouble();


        System.out.println("Digite A Quantidade do Produto: ");
        quantidade = lerValorConsole.nextInt();

        calculoPreco.CalculoPrecoMetodo(precoProduto, quantidade);


        System.out.printf("O Valor Total: %.2f", calculoPreco.getCalculoPreco());
        
   }


}
