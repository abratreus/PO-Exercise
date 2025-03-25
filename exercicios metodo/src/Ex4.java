/*3)  [POO-016]  ===Desafio!!!===  Semelhante  ao  exercício  [POO-015]  Crie  um  programa  de  conversão  de 
temperaturas,  mas  agora  com  três  possibilidades  de  unidade  de  medida:  Celsius,  Fahrenheit  e  Kelvin.  A 
saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit 
e  Kelvin.  O  processo  de  conversão  deverá  ser  feito  através  de  um  ou  mais  métodos  que  recebe  a 
temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos 
de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser 
executado enquanto o usuário desejar.  
Entrada:      Saída:   Cálculo: 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: M 
  Opção Inválida! 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C     [ F = (9 * 0 / 5) + 32 ] 
 Entre com a temperatura: 0    F: 32 e K: 273  [ K = 0 + 273 ] 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S 
 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S 
 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C     [ F = (9 * 100 / 5) + 32 ] 
 Entre com a temperatura: 100    F: 212 e K: 373  [ K = 100 + 273 ] 
 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: F     [ C = 5 * (86 – 32) / 9 ] 
 Entre com a temperatura: 86    C: 30 e F: 303  [ F = (9 * 100 / 5) + 32 ] 
 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: K     [ C = 0 – 273 ] 
 Entre com a temperatura: 0    C: -273 e F: -459,4 [ F = (9 * (0 – 273) / 5) + 32 ] 
 
 [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
   */
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        char opcao;
        do { 
            opcao = menu(read);
            if(opcao == 'S') break;
            switch(opcao){
                case 'C':
                    double temp = temperatura(read);
                    celsius(temp, opcao);
                    System.out.println();
                    break;
                case 'F':
                    temp = temperatura(read);
                    fahrenheit(temp, opcao);
                    System.out.println();
                    break;
                case 'K':
                    temp = temperatura(read);
                    kelvin(temp, opcao);
                    System.out.println();
                case 'S':
                    break;
                default:
                    System.out.println("Opçao Inválida!");
                    break;
            }
        } while (opcao != 'S');
    }

    public static char menu(Scanner read){

        System.out.print("[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
        return Character.toUpperCase(read.next().charAt(0));
    }

    static double temperatura(Scanner read){
        System.out.print("Entre com a temperatura: ");
        return read.nextDouble();
    }

    public static void fahrenheit(double temp, char opcao){
        System.out.println("A temperatura em Celsius é: " + 5 * ((temp - 32) / 9));
        System.out.println("A temperatura em Kelvin é: " + ((temp - 32) * 5 / 9 + 273));
    }

    public static void celsius(double temp, char opcao){
        System.out.println("A temperatura em Fahrenheit é: " + ((9 * temp / 5) + 32));
        System.out.println("A temperatura em Kelvin é: " + (temp + 273));
    }

    public static void kelvin(double temp, char opcao){
        System.out.println("A temperatura em Celsius é: " + (temp - 273));
        System.out.println("A temperatura em Fahrenheit é: " + (9 * (temp - 273) / 5 + 32));
    }
}
