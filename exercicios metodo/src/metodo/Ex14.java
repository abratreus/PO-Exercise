package metodo;
/*14)  [POO-027]  Crie  um  programa  que  solicite  ao  usuário  um  número  inteiro.  Através  de  um  método  que 
receba esse número inteiro como parâmetro  de entrada, inverta  dígito-a-dígito e  retorne  um valor inteiro 
com o número invertido. 
 
 Entrada:     Saída: 
  Entre com um número: 12   >> 21 
 
  Entre com um número: 430   >> 34 
 
  Entre com um número: -27   >> -72 
 
  Entre com um número: 0   >> 0 
 
 
 
   */
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNumero(read);
        read.close();
    }     

    static void scannerNumero(Scanner read){
        int num;
        System.out.print("Entre com um valor: ");
        do{num = read.nextInt();}while(!Util.validaEntrada(num));
        System.out.print("Valor invertido: " + Util.inverteNumero(num) + "\n");
        
    }
}
