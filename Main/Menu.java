package desafioCadastroAnimais.Main;

import desafioCadastroAnimais.Methods.LeituraArquivo;
import desafioCadastroAnimais.Methods.Cadastro;
import desafioCadastroAnimais.Methods.Salvando_Informacoes;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        LeituraArquivo leituraArquivo = new LeituraArquivo();
        String escolha;
        Scanner scanner = new Scanner(System.in);
        label:
        try {
            while (true) {
                leituraArquivo.leitura_Cases();
                escolha = scanner.nextLine();
                switch (escolha) {
                    case "1":
                        Cadastro.Perguntas();
                        break;
                    case "2":
                        System.out.println("Alterar os dados do pet cadastrado");
                        break;
                    case "3":
                        System.out.println("Deletar um pet cadastrado");
                        break;
                    case "4":
                        System.out.println("Listar todos os pets cadastrados\n");
                        break;
                    case "5":
                        System.out.println("Listar pets por algum critério (idade, nome, raça)\n");
                        break;
                    case "6":
                        System.out.println("Saindo Do Menu, Obrigado");
                        break label;
                    default:
                        System.out.println("Não existe essa opção, tente novamente");
                        break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}

