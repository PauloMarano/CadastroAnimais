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
            if (animal.getNome().equals(regexs.naoInformado(animal.getNome()))) {
                System.out.println("Voce nao pode cadastrar um pet sem nome");
                verifique = true;
            }
            if (!animal.getNome().equals(regexs.nomeComposto(animal.getNome()))) {
                System.out.println("Nome do pet Invalido, Tente novamente");
                verifique = true;
            }
            if (!animal.getRaca().equals(regexs.filtroRaca(animal.getRaca()))) {
                System.out.println("Raca Invalida, Tente novamente");
                verifique = true;
            }
        }
        return verifique;
    }
}


