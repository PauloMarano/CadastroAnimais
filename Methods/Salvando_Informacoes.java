package desafioCadastroAnimais.Methods;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Domain.GatoOuCachorro;
import desafioCadastroAnimais.Domain.SexoAnimal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Salvando_Informacoes {
    public void salvamento_respostas(String[] respostas) {
        VerificadorDeRegras verificadorDeRegras = new VerificadorDeRegras();
        String nome = respostas[0];
        String raca = respostas[6];
        SexoAnimal sexo = SexoAnimal.valueOf(respostas[2].toUpperCase());
        String endereco = respostas[3];
        Double idade = Double.valueOf(respostas[4]);
        Double peso = Double.valueOf(respostas[5]);
        GatoOuCachorro gatoOuCachorro = GatoOuCachorro.valueOf(respostas[1].toUpperCase());

        Animal animal = new Animal(nome, endereco, raca, idade, peso, sexo, gatoOuCachorro);
        if (verificadorDeRegras.verificador(animal))return;
        else {
            String nomeArquivo = animal.getNome() + ".txt";
            String[] animalFinal = {"Nome: " + nome, "Endereco: " + endereco, ("Idade: ") + idade.toString(), "Peso: " + (peso.toString()), "Sexo: " + sexo.toString(), "Tipo: " + gatoOuCachorro.toString(), "Raca: " + raca};

            File file = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados\\file.txt");

            try {
                boolean newFile = file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            File fileRename = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados", nomeArquivo);
            boolean fileNome = file.renameTo(fileRename);
            System.out.println("Cadastro Realizado: " + fileNome);


            try (FileWriter fileWriter = new FileWriter(fileRename);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
                for (String string : animalFinal) {
                    bufferedWriter.write(string + "\n");
                    bufferedWriter.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

