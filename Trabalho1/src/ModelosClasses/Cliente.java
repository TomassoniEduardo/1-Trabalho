package ModelosClasses;

public class Cliente extends Pessoa {


    String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }



    @Override
    public String toString() {
        return "Cliente [CPF=" + CPF + ", nome= " + nome + ", email=" + email + ", telefone=" + telefone + ", idade=" + idade
        + ", endereco=" + endereco + "]";
    
    }

    public Cliente(String CPF, String nome , String email , String telefone , int idade , String endereco) {
    this.CPF = CPF;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.idade = idade;
    this.endereco = endereco;
    }




}
