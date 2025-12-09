package desafioCadastroAnimais.Methods;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Domain.GatoOuCachorro;
import desafioCadastroAnimais.Domain.SexoAnimal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Salvando_Informacoes {
    public String salvamento_respostas(String[] respostas) {
        String nome = respostas[0];
        String raca = respostas[6];
        SexoAnimal sexo = SexoAnimal.valueOf(respostas[2].toUpperCase());
        String endereco = respostas[3];
        Double idade = Double.valueOf(respostas[4]);
        Double peso = Double.valueOf(respostas[5]);
        GatoOuCachorro gatoOuCachorro = GatoOuCachorro.valueOf(respostas[1].toUpperCase());
        if (idade > 20) {
            System.out.println("Idade Invalida do seu pet invalida, Tente Novamente");
            return null;
        }
        if (peso > 60 || peso < 0.5) {
            System.out.println("Peso do seu pet Invalido, Tente Novamente");
            return null;
        }
        Animal animal = new Animal();
        animal.setNome(nome);
        animal.setEndereco(endereco);
        animal.setIdade(idade.toString());
        animal.setPeso(peso.toString());
        animal.setSexoAnimal(sexo);
        animal.setGatoOuChachorro(gatoOuCachorro);
        animal.setRaca(raca);
        if (idade < 1) {
            idade = 0. + idade;
        }


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
            return "";
        }
}

