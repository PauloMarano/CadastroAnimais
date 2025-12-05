package desafioCadastroAnimais.Domain;

public class Animal {

    protected enum gatoOuCachorro{
        GATO,CACHORRO;
    }

    protected enum sexo{
        M,F;
    }

    protected String animal_Cadastro (String nome, String gatoOuCachorro, String endereco, String raca, String sexo, String idade, String  peso){
         String[] animal = {nome, gatoOuCachorro, endereco, raca, sexo, idade, peso};
         return nome;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        String string = animal.animal_Cadastro("Joao", "Gato", "Avenida bla bla bla", "Cachorro", "M", "19", "8,9");
        }
    }
