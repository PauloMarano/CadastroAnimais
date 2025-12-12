package desafioCadastroAnimais.Methods;

import desafioCadastroAnimais.Domain.Animal;

public class VerificadorDeRegras {
    public boolean verificador(Animal animal) {
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
            if (verifique){
                System.out.println("Tente Novamente");
            }
        }
        return verifique;
    }
}


