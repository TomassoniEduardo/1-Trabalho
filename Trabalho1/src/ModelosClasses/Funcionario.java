package ModelosClasses;

public class Funcionario extends Pessoa {

    String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo +  ", nome= " + nome + ", email=" + email + ", telefone=" + telefone + ", idade=" + idade
        + ", endereco=" + endereco + "]";
    }

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

   public Funcionario(String nome, String email, String telefone, int idade, String endereco, String cargo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    
}