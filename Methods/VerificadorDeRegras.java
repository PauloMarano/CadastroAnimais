package desafioCadastroAnimais.Methods;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Regexs.Regexs;

public class VerificadorDeRegras {
    public boolean verificador(Animal animal) {
        Regexs regexs = new Regexs();
        boolean verifique = false;
        for (int i = 0; i < 1; i++) {
            if (animal.getPeso() > 20.0) {
                System.out.println("Idade Invalida do seu pet invalida");
                verifique = true;
            }
            if (animal.getPeso() > 60.0 || animal.getPeso() < 0.5) {
                System.out.println("Peso do seu pet Invalido");
                verifique = true;
            }
            if (animal.getNome().equals(regexs.naoInformado(animal.getNome()))){
                System.out.println("Voce nao pode cadastrar um pet sem nome");
                verifique = true;
            }
            if (!animal.getNome().equals(regexs.nomeComposto(animal.getNome()))){
                System.out.println("Voce nao pode cadastrar um pet só com o nome, \n precisa de um sobrenome! \n");
                verifique = true;
            }
        }
        return verifique;
    }
}


