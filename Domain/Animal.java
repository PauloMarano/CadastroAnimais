package desafioCadastroAnimais.Domain;

public class Animal {

    protected String nome;
    protected String endereco;
    protected float idade;
    protected float peso;
    protected SexoAnimal sexoAnimal;
    protected GatoOuChachorro gatoOuChachorro;

    public Animal(String [] respostas) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.sexoAnimal = sexoAnimal;
        this.gatoOuChachorro = gatoOuChachorro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
