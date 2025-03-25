/*2) [POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O 
usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a 
entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de 
conversão  deverá  ser  feito  através  de  um  ou  mais  métodos  que  recebe  a  temperatura  fornecida  como 
parâmetro  de  entrada  e  retorne  a  temperatura  convertida.  Para  os  cálculos  de  conversão,  utilize  as 
fórmulas  C  =  5  *  (F  -  32)  /  9  e  F  =  (9  *  C  /  5)  +  32.  O  programa  deve  ser  executado  enquanto  o  usuário 
desejar.  
 Entrada:      Saída:   Cálculo: 
  [C]Celsius, [F] Fahrenheit e [S] Sair: V 
   Opção Inválida! 
  [C]Celsius, [F] Fahrenheit e [S] Sair: C 
  Entre com a temperatura: 0    Saída: 32    [ F = (9 * 0 / 5) + 32 ] 
  [C]Celsius, [F] Fahrenheit e [S] Sair: S  
  [C]Celsius, [F] Fahrenheit e [S] Sair: S  
  [C]Celsius, [F] Fahrenheit e [S] Sair: C    
  Entre com a temperatura: 100    Saída: 212    [ F = (9 * 100 / 5) + 32 ] 
  [C]Celsius, [F] Fahrenheit e [S] Sair: F 
  Entre com a temperatura: 86    Saída: 30 [ C = 5 * (86 – 32) / 9 ] 
  [C]Celsius, [F] Fahrenheit e [S] Sair: S
   */
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        char opcao;
        do { 
            opcao = menu(read);
            if(opcao == 'S') break;
            switch(opcao){
                case 'C':
                    double temp = temperatura(read);
                    fahrenheit(temp);
                    break;
                case 'F':
                    temp = temperatura(read);
                    celsius(temp);
                    break;
                    case 'S':
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 'S');
    }

    public static char menu(Scanner read){

        System.out.print("[C]Celsius, [F] Fahrenheit e [S] Sair: ");
        return Character.toUpperCase(read.next().charAt(0));
    }

    static double temperatura(Scanner read){
        System.out.println("Entre com a temperatura: ");
        return read.nextDouble();
    }

    public static void fahrenheit(double temp){
        System.out.println("A temperatura em Fahrenheit é: " + ((9*temp/5) + 32));
    }

    public static void celsius(double temp){
        System.out.println("A temperatura em Fahrenheit é: " + (5  *  (temp  -  32)  /  9));
    }
}
