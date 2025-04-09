package metodo;
/*11)  [POO-024]  Crie  um  programa  que  solicite  ao  usuário  um  número  inteiro.  Através  de  um  método  que 
receba  esse  número  inteiro  como  parâmetro  de  entrada,  verifique  e  retorne  um  valor  boolean,  que 
indicará, caso true que ele é um número perfeito, caso false, que não é. 
 
 Entrada:     Saída: 
  Entre com um número: 6   O número 6 é perfeito   
 
  Entre com um número: 11   O número 11 não é perfeito 
 
  Entre com um número: -4   Erro! Valor inválido. 
 
  Entre com um número: 0   Erro! Valor inválido.
   */
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNumero(read);
        read.close();
    }     

    static void scannerNumero(Scanner read){
        int num;
        System.out.print("Entre com um valor: ");
        do{num = read.nextInt();}while(!Util.validaEntrada(num));
        System.out.println("O Número " + (Util.isPerfect(num)?" é perfeito" : "não é perfeito"));
        
    }
}
