package desafioCadastroAnimais.Domain;

public class Animal {

    protected String nome;
    protected String endereco;
    protected String raca;
    protected Double  idade;
    protected Double peso;
    protected SexoAnimal sexoAnimal;
    protected GatoOuCachorro gatoOuChachorro;

    public Animal(String nome, String endereco, String raca, Double idade, Double peso, SexoAnimal sexoAnimal, GatoOuCachorro gatoOuChachorro) {
        this.nome = nome;
        this.endereco = endereco;
        this.raca = raca;
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

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public SexoAnimal getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(SexoAnimal sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public GatoOuCachorro getGatoOuChachorro() {
        return gatoOuChachorro;
    }

    public void setGatoOuChachorro(GatoOuCachorro gatoOuChachorro) {
        this.gatoOuChachorro = gatoOuChachorro;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
