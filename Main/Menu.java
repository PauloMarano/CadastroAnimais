package desafioCadastroAnimais.Main;

import desafioCadastroAnimais.Methods.LeituraArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        LeituraArquivo leituraArquivo = new LeituraArquivo();
        leituraArquivo.leitura_Cases();
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();
        switch (escolha){
            case 1 -> {
                leituraArquivo.leitura_Perguntas();
            }
            case 2 -> {
                System.out.println("2");
            }
            case 3 -> {
                System.out.println("3");
            }
            case 4 -> {
                System.out.println("4");
            }
            case 5 -> {
                System.out.println("5");
            }
            case 6 -> {
                System.out.println("Saindo do menu..");
            }
        }
    }
}
