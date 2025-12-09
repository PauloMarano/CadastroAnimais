package desafioCadastroAnimais.Methods;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Domain.GatoOuCachorro;
import desafioCadastroAnimais.Domain.SexoAnimal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Salvando_Informacoes {
    public String salvamento_respostas(String [] respostas) {
        String nome = respostas[0];
        String raca = respostas[6];
        SexoAnimal sexo = SexoAnimal.valueOf(respostas[2].toUpperCase());
        String endereco = respostas[3];
        Float idade = Float.valueOf(respostas[4]);
        Float peso = Float.parseFloat(respostas[5]);
        GatoOuCachorro gatoOuCachorro = GatoOuCachorro.valueOf(respostas[1].toUpperCase());

        Animal animal = new Animal();
        animal.setNome(nome);
        animal.setEndereco(endereco);
        animal.setIdade(idade.toString());
        animal.setPeso(peso.toString());
        animal.setSexoAnimal(sexo);
        animal.setGatoOuChachorro(gatoOuCachorro);
        animal.setRaca(raca);

        String nomeArquivo = animal.getNome()+".txt";
        String[] animalFinal = {nome, endereco, idade.toString(), peso.toString(), sexo.toString(), gatoOuCachorro.toString(), raca};

        File file = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados\\file.txt");
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRename = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados", nomeArquivo);
        boolean fileNome = file.renameTo(fileRename);
        System.out.println("Cadastro Realizado: " + fileNome);

        try (FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (String string : animalFinal) {
                bufferedWriter.write(string + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
