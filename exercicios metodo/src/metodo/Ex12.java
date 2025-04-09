package metodo;
/*12)  [POO-025]  Crie  um  programa  que  solicite  ao  usuário  um  número  inteiro.  Utilizando  métodos,  exiba  a 
sequência dos números perfeito até o número informado. 
 
 Entrada:     Saída: 
  Entre com um número: 10   >> 6 
 
  Entre com um número: 50   >> 6  28 
 
  Entre com um número: -4   Erro! Valor inválido. 
 
  Entre com um número: 0   Erro! Valor inválido. 
 
Referência: POO-024. 
 

   */
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNumero(read);
        read.close();
    }     

    static void scannerNumero(Scanner read){
        int num;
        System.out.print("Entre com um valor: ");
        do{num = read.nextInt();}while(!Util.validaEntrada(num));
        Util.showThePerfectNumber(num);
        
    }
}
