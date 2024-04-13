package AT010;
import java.util.Scanner;

import AT009.Musica;

import java.util.Locale;

public class Principal {
   public static void main(String[] args) {
        Scanner lerValorConsole = new Scanner(System.in);
        lerValorConsole.useLocale(Locale.US);

        String modelo;
        int ano;
        String cor;
        
        System.out.println("Modelo: ");
        modelo = lerValorConsole.nextLine();

        System.out.println("Ano: ");
        ano = lerValorConsole.nextInt();

        System.out.println("Cor: ");
        cor = lerValorConsole.nextLine();

        Carro carro = new Carro(modelo, ano, cor);
        carro.exibirFichaTecnica();

        System.out.println("A Idade do Carro é: " + carro.calcularIdade());


    
   }


}
