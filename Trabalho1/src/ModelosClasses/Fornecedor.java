package ModelosClasses;

public class Fornecedor extends Pessoa {

    String CNPJ;
    String razaoSoci;
    
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public String getRazaoSoci() {
        return razaoSoci;
    }
    public void setRazaoSoci(String razaoSoci) {
        this.razaoSoci = razaoSoci;
    }
    @Override
    public String toString() {
        return "Fornecedor [CNPJ=" + CNPJ + ", razaoSoci=" + razaoSoci + ", nome= " + nome + ", email=" + email + ", telefone=" + telefone + ", idade=" + idade
        + ", endereco=" + endereco + "]";
    }
    public Fornecedor(String CNPJ, String razaoSoci, String nome, String email, String telefone, int idade, String endereco) {
        this.CNPJ = CNPJ;
        this.razaoSoci = razaoSoci;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;
    }

    
    
}
