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
        while (true) {
            if ((int) escolha == 1) {
                leituraArquivo.leitura_Perguntas();
            } else if ((int) escolha == 2) {

            } else if ((int) escolha == 3) {

            } else if ((int) escolha == 4) {

            } else if ((int) escolha == 5) {

            } else if ((int) escolha == 6) {
                System.out.println("Saindo Dom Menu, Obrigado");
                break;
            } else {
                System.out.println("Caracter incorreta, tente novamente");
            }
        }
    }
}
