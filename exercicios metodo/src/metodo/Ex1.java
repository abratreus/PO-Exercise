package metodo;
/* 1)  [POO-014]  Crie  um  programa  de  conversão  de  temperaturas  em  Celsius  para  Fahrenheit.  O  usuário 
deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de 
conversão  deverá  ser  feito  através  de  um método  que  recebe  a  temperatura  em Celsius  como  parâmetro 
de  entrada  e  retorne  a  temperatura  convertida  para  Fahrenheit.  Para  o  cálculo  da  conversão,  utilize  a 
fórmula F= (9*C/5) + 32. 
 
 Entrada:      Saída: 
  Entre com temperatura em Celsius: 0   A temperatura em Fahrenheit é: 32  
  Entre com temperatura em Celsius: 100    A temperatura em Fahrenheit é: 212  
  Entre com temperatura em Celsius: 30   A temperatura em Fahrenheit é: 86
   */
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Fahrenheit(scannerCelsius(read));
    }

    public static int scannerCelsius(Scanner read){

        System.out.print("Entre com temperatura em Celsius: ");
        int celsius = read.nextInt();
        return celsius;
    }

    public static void Fahrenheit(int celsius){
        System.out.println("A temperatura em Fahrenheit é: " + ((9*celsius/5) + 32));
    }
}
