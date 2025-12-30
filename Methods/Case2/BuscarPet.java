package desafioCadastroAnimais.Methods.Case2;

import java.util.Scanner;

public class BuscarPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(""" 
                1- Nome ou sobrenome
                2- Sexo
                3- Idade
                4- Peso
                5- Raça
                6- Endereço
                7- Data de Cadastro""");

        scanner.nextLine();
        String escolha1 = scanner.nextLine();

        System.out.println("Deseja colocar outro critério (S/N)");
        scanner.nextLine();
        String escolhaOutroCriterio = scanner.nextLine().toUpperCase();
        if (escolhaOutroCriterio.equals("S")){
            System.out.println(""" 
                1- Nome ou sobrenome
                2- Sexo
                3- Idade
                4- Peso
                5- Raça
                6- Endereço
                7- Data de Cadastro""");
            String escolha2 = scanner.nextLine();

        }
        else {

        }
    }
}
