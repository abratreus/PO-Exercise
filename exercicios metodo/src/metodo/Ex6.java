package metodo;
/*6)  [POO-019]  Crie  um  programa  que  solicite  ao  usuário  dois  números  inteiros. Estes,  devem  ser  passados 
como  parâmetros  de  entrada  para  um  método  que  irá  gerar  todos  os  números  primos  existentes  no 
intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com 
a  responsabilidade  de  imprimir  o  array  de  primos  retornado  pelo  método.  O  método  deve  aceitar  e 
entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1. 
 
 Entrada:    Saída: 
  Entre com um valor: 10   >> 11 13 17 19 23 29 31 37 41 43 47 
  Entre com outro valor: 50 
        
  Entre com um valor: 231  >> 211 223 227 229 
  Entre com outro valor: 205 
 
  Entre com um valor: 19   >> 19 
  Entre com outro valor: 19 

   */
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNumero(read);
        read.close();
    }

    static void scannerNumero(Scanner read){
        System.out.print("Entre com um valor: ");
        int primeiro = read.nextInt();
        System.out.print("Entre com outro valor: ");
        int ultimo = read.nextInt();
        if(primeiro > ultimo){
            int aux = primeiro;
            primeiro = ultimo;
            ultimo = aux;
        }
        primo(primeiro, ultimo);
    }

    static void primo(int primeiro, int ultimo){
        for(int i = primeiro; i < ultimo; i++){
            if(Util.isPrimo(i)){
                System.out.print(i + " ");
            }
        }
    }
}
