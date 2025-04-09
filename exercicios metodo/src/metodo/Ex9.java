package metodo;
/*9) [POO-022] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que 
receba  esses  dois  números  inteiros  como  parâmetro  de  entrada,  calcule  e  retorne  o  MMC  (Mínimo 
Múltiplo Comum) destes números fornecidos. Utilize decomposição simultânea ou fatoração simultânea. 
 
Entrada:    Saída:   Cálculo: 
 Entre com um valor: 10   MMC: 20  10, 20 | 2 
 Entre com outro valor: 20     5, 10 | 2 
         5, 5 | 5 
         1, 1 | 2 * 2 * 5 = 20 
 
 
 Entre com um valor: 162  MMC: 810  162, 90 | 2 
 Entre com outro valor: 90     81, 45 | 3 
         27, 15 | 3 
         9, 5 | 3 
         3, 5 | 3 
         1, 5 | 5 
         1, 1 | 2 * 3 * 3 * 3 * 3 * 5 = 810 
 
 
 Entre com um valor: 23   MMC: 483  23, 21 | 3 
 Entre com outro valor: 21     23, 7 | 7 
         23, 1 | 23 
         1, 1 | 3 * 7 * 23 = 483 

   */
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNumero(read);
        read.close();
    }

    static void scannerNumero(Scanner read){
        int num1, num2;
        do{
            System.out.print("Entre com um valor: ");
            num1 = read.nextInt();
        }while(!Util.validaEntrada(num1));
        do{
            System.out.print("Entre com outro um valor: ");
            num2 = read.nextInt();
        }while(!Util.validaEntrada(num2));
        System.out.println("O Mmc é = " + Util.mmc(num1, num2));
        
    }

}
