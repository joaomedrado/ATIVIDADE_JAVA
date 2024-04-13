package AT008;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        double precoCompra;
        

        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        System.out.println("Digite o Preço da Compra R$: ");
        precoCompra = lerValorConsole.nextDouble();
        
        calculadoraDesconto.CalculadoraDescontoMetodo(precoCompra);
        calculadoraDesconto.AplicarDescontoMetodo(precoCompra);


        System.out.printf("O preço original era de R$%.2f\n", precoCompra);
        System.out.printf("O desconto de %.2f%% resulta em um desconto de R$%.2f\n", calculadoraDesconto.getValorDesconto(), calculadoraDesconto.getValorDesconto());
        System.out.printf("O preço com desconto é de R$%.2f\n", calculadoraDesconto.getPrecoComDesconto());
        
   }


}
