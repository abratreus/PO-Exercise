package PO;
public class PessoaTest {
    public static void main(String[] args) {
        
        // Arrange
        Pessoa pessoa = new Pessoa("João", 30, 1.80);

        // Act
        pessoa.fazAniversario(true);

        // Assert
        System.out.println(pessoa.getIdade());
    }
}
