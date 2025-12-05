package desafioCadastroAnimais.Methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PerguntasCadastro {
    Scanner scanner = new Scanner(System.in);

    public void perguntas() throws IOException {
        File file_Perguntas = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\Perguntas.txt");
        FileReader fileReader = new FileReader(file_Perguntas);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;
        while((linha = bufferedReader.readLine()) != null){
            System.out.println(linha);
            String resposta = scanner.nextLine();
        }
    }
    private final String respostas(String [] respostas ){
        respostas = new String[]{};

        return "";
    }
}
