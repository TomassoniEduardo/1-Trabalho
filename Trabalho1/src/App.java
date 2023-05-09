import ModelosClasses.Cliente;
import ModelosClasses.Fornecedor;
import ModelosClasses.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
       
       Cliente cliente  = new Cliente ("10325142645", "eduardo", "etomassoni@minha.fag.edu.com", 
       "45999107349", 25, "Barão");
       
        System.out.println(cliente);
    

    Fornecedor fornecedor = new Fornecedor("152054521452154", "Fag Toledo", "Leonardo", 
    "lsnichetti@minha.fag.edu.br", "45998463652" , 18 , "JJ");

        System.out.println(fornecedor);

    Funcionario funcionario = new Funcionario("Leonardo", "lsnichetti@minha.fag.edu.br", 
    "45998463652", 18, "JJ", "Gerente");

    System.out.println(funcionario);
}
}

