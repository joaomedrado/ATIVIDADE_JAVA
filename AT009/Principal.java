package AT009;
import java.util.Scanner;

import AT008.CalculadoraDesconto;

import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        String titulo;
        String artista;
        int anoLancamento;
        String curtidas;
        
        System.out.println("Titulo: ");
        titulo = lerValorConsole.nextLine();

        System.out.println("Artista: ");
        artista = lerValorConsole.nextLine();

        System.out.println("Ano Lançamento: ");
        anoLancamento = lerValorConsole.nextInt();


        System.out.println("Curtidas: SIM / NÃ0  " );
        curtidas = lerValorConsole.nextLine();
        
        Musica musica = new Musica(titulo, artista, anoLancamento, anoLancamento);
        if (curtidas.equalsIgnoreCase("SIM")) {
            musica.Curtidas();
        }
        musica.ExibirFichaTecnica();


    
   }


}
