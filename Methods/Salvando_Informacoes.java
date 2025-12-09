package desafioCadastroAnimais.Methods;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Domain.GatoOuCachorro;
import desafioCadastroAnimais.Domain.SexoAnimal;

public class Salvando_Informacoes {
    public String salvamento_respostas(String [] respostas){
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
        System.out.println(animal.getIdade());
        return "";
    }
}
