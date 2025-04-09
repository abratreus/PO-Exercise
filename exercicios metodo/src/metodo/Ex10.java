package metodo;
/*10)  [POO-023]  ===Desafio!!!===  Crie  um  programa  que  solicite  ao  usuário  um  número  inteiro,  que 
representará  a  quantidade  de  números  inteiros  que  serão  digitados  em  seguida  e  armazenados  em  um 
array.  Através  de  um  método  que  receba  esse  array  de  números  inteiros  como  parâmetro  de  entrada, 
calcule  e  retorne  o  MMC  (Mínimo  Múltiplo  Comum)  desse  conjunto  de  dados.  Valide  as  entradas  para 
aceitar  apenas  números  positivos  (pode  ser  um  método).  Utilize  decomposição  simultânea  ou  fatoração 
simultânea. 
 
Entrada:     Saída:  Cálculo: 
 Entre com a quantidade de termos: 4 MMC: 600  40, 50, 30, 20 | 2 
Entre com 1º número: 40     20, 25, 15, 10 | 2  
 Entre com 2º número: 50     10, 25, 15, 5 | 2 
 Entre com 3º número: 30     5, 25, 15, 5 | 3 
 Entre com 4º número: 20     5, 25, 5, 5 | 5 
         1, 5, 1, 1 | 5 
         1, 1, 1, 1 | 2 * 2 * 2 * 3 * 5 * 5 = 600 
 
   
 Entre com a quantidade de termos: 3 MMC: 540  45, 27, 36 | 2 
Entre com 1º número: 45     45, 27, 18 | 2 
 Entre com 2º número: 27     45, 27, 9 | 3 
 Entre com 3º número: 36     15, 9, 3 | 3 
         5, 3, 1 | 3 
         5, 1, 1 | 5 
         1, 1, 1 | 1 * 2 * 2 * 3 * 3 * 3 * 5 = 540 
 
 
 Entre com a quantidade de termos: 2 MMC: 8   8, 4 | 2 
Entre com 1º número: 8       4, 2 | 2 
 Entre com 2º número: 4       2, 1 | 2 
         1, 1 | 2 * 2 * 2 = 8 
 
 
 Entre com a quantidade de termos: 1 Erro! Valor inválido. 
 
 
 Entre com a quantidade de termos: 0 
 
 
 Entre com a quantidade de termos: -7 Erro! Valor inválido.
   */
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNumero(read);
        read.close();
    }     

    static void scannerNumero(Scanner read){
        int num;
        System.out.print("Entre com um valor: ");
        do{num = read.nextInt();}while(!Util.validaEntrada(num));
        System.out.println("O Mdc é = " + (Util.mmc(Util.scannerFillArr(num, read))));
        
    }
}
