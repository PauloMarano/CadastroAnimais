package desafioCadastroAnimais.Methods;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Domain.GatoOuCachorro;
import desafioCadastroAnimais.Domain.SexoAnimal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Cadastro {
    public static void Perguntas() throws IOException {
        Salvando_Informacoes salvandoInformacoes = new Salvando_Informacoes();
        File file_Perguntas = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\Perguntas.txt");
        FileReader fileReader = new FileReader(file_Perguntas);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[7];
        String linha;
        int i = 0;
        try {
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                String resposta = scanner.nextLine().toUpperCase();
                respostas[i] = resposta;
                i += 1;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            salvandoInformacoes.salvamento_respostas(respostas);
        }

    }
}

