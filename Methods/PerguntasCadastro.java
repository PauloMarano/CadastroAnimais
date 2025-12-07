package desafioCadastroAnimais.Methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PerguntasCadastro {
    Scanner scanner = new Scanner(System.in);

    public static void ler_Perguntas() throws IOException {
        File file_Perguntas = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\Perguntas.txt");
        FileReader fileReader = new FileReader(file_Perguntas);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }
    }

    public String[] Respostas() {
        LeituraArquivo leituraArquivo = new LeituraArquivo();
        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[7];
        for (int i = 0; i < respostas.length; i++) {
            String resposta = scanner.nextLine();
            respostas[i] = resposta;
        }
        for (String s : respostas) {
            System.out.println(s);
        }
        return respostas;
    }
}

