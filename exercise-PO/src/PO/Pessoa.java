// 1) Criar  uma  classe  para  representar  uma  Pessoa.  A  pessoa  tem  como  características  o  nome,  em 
// formato  String,  a  idade,  em  números  inteiros  e  a  altura,  que  pode  ter  casas  decimais.  Além  dos 
// métodos  assessores  de  cada  característica,  temos  um  método  que  recebe  como  parâmetro  de 
// entrada  um  valor  lógico,  que  quando  verdadeiro,  incrementa  em  um  a  idade  da  pessoa  e  esse 
// método  deve  ser  chamado  por  fazAniversario,  não  havendo  retorno.  Siga  o  diagrama  abaixo  para 
// implementar  a  classe  Pessoa.  Após  crie  uma  classe  para  testar.  Observe  os  sinais  de  mais  e  de 
// menos antes dos nomes dos atributos e métodos. Respeite-os! 

package PO;

public class Pessoa {
    private String nome = "abraão";
    private int idade = 19;
    private double altura = 1.88;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

    public void fazAniversario(boolean niver){
        if (niver){
            this.idade++;
        }
    }

    
}
