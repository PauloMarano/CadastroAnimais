package desafioCadastroAnimais.Domain;

public class Animal {

    protected String nome;
    protected String endereco;
    protected String raca;
    protected String  idade;
    protected String peso;
    protected SexoAnimal sexoAnimal;
    protected GatoOuCachorro gatoOuChachorro;

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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
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
