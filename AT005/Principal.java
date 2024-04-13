package AT005;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        char letra;
        String palavra;

        Concatenacao concatenacao = new Concatenacao();

        System.out.println("Digite Uma Letra: ");
        letra = lerValorConsole.next().charAt(0);

        lerValorConsole.nextLine(); 

        System.out.println("Digite Uma Palavra: ");
        palavra = lerValorConsole.nextLine();

        concatenacao.ConcatenacaoMetodo(letra, palavra);


        System.out.printf("Sua Frase é " + concatenacao.getConcatenacao());
        
   }


}
