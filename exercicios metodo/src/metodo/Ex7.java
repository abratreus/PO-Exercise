package metodo;
/*7) [POO-020] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que 
receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor 
Comum) destes números fornecidos.  
 
 Entrada:    Saída:   Cálculo: 
  Entre com um valor: 10   MDC: 10  10, 20 | 2  [√] 
  Entre com outro valor: 20     5, 10 | 2  [x] 
          5, 5 | 5  [√]  
          1, 1 | 1 * 2 * 5 = 10 
 
 
  Entre com um valor: 162  MDC: 18  162, 90 | 2  [√] 
  Entre com outro valor: 90     81, 45 | 3  [√] 
          27, 15 | 3  [√] 
          9, 5 | 3  [x] 
          3, 5 | 3  [x] 
          1, 5 | 5  [x] 
          1, 1 | 1 * 2 * 3 * 3 = 18 
 
 
  Entre com um valor: 23   MDC: 1    23, 21 | 3  [x] 
  Entre com outro valor: 21     23, 7 | 7  [x] 
          23, 1 | 23  [x] 
          1, 1 | 1 = 1
   */
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNumero(read);
        read.close();
    }

    static void scannerNumero(Scanner read){
        System.out.print("Entre com um valor: ");
        int num1 = read.nextInt();
        System.out.print("Entre com outro valor: ");
        int num2 = read.nextInt();
        System.out.println("MDC: " + Util.mdc(num1, num2));
    }

}
