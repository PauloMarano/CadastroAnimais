package desafioCadastroAnimais.Methods;

import java.io.*;
import java.util.Scanner;

public class LeituraArquivo {
    Scanner scanner = new Scanner(System.in);

    public void Leitura_Perguntas() throws IOException {
        File file_Perguntas = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\Perguntas.txt");
        FileReader fileReader = new FileReader(file_Perguntas);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;
        while((linha = bufferedReader.readLine()) != null){
            System.out.println(linha);
        }
    }
    public void leitura_Cases() throws IOException {
        File file_Cases = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\Cases.txt");
        System.out.println("================= Bem vindo ao menu =================");
        FileReader fileReader_Cases = new FileReader(file_Cases);
        BufferedReader bufferedReader_Cases = new BufferedReader(fileReader_Cases);
        String linha;
        while ((linha = bufferedReader_Cases.readLine()) != null){
            System.out.println(linha);
        }
    }
}
