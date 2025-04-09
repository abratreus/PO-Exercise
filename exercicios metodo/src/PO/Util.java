package PO;
import java.util.Scanner;

public class Util {

    // Scanner para ler o número de elementos do array
    // e preencher o array com números inteiros positivos
    static int[] scannerFillArr(int n, Scanner read){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            do{
            System.out.print("Entre com o " + (i+1) + "º número: ");
                arr[i] = read.nextInt();
            }while(!validaEntrada(arr[i]));
        }
        return arr;
    }

    // Inprima o array
    static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Verifica se o número é positivo
    static boolean isPositivo(int n){
        return n > 0;
    }

    // Verifica se o número é positivo e imprime mensagem de erro
    static boolean validaEntrada(int n){
        if(!isPositivo(n)){
            System.out.println("Erro! Valor inválido.");
            return false;
        }
        return true;
    }

    // Verifica se o número é primo
    static boolean isPrimo(int n){
        if(n < 2)return false;
        for(int i = 2; i * i <= n; i++){
            if(n%i == 0)return false;
        }
        return true;
    }

    // Verifica se o número é primo e retorna o n-ésimo número primo
    // Exemplo: se n = 5, retorna o 5º número primo (11)
    static int primo(int n){
        int[] primos = new int[n];
        int cont = 0;
        int num = 2;
        while(cont < n){
            if(isPrimo(num)){
                primos[cont] = num;
                cont++;
            }
            num++;
        }
        return primos[n-1];
    }

    // Mínimo Múltiplo Comum
    // utilizando a fórmula: MMC(a, b) = (a * b) / MDC(a, b)
    static int mmc(int a, int b){
        return (a / mdc(a, b)) * b;
    }

    // Mínimo Múltiplo Comum para um array
    static int mmc(int[] arr){
        int mmc = arr[0];
        for(int i = 1; i < arr.length ; i++){
            mmc = mmc(mmc, arr[i]);
        }
        return mmc;
    }

    // Maximo Divisor Comum
    // utilizando o algoritmo de Euclides

    // Maximo Divisor Comum para dois números
    static int mdc(int a, int b){
        return (a == 0) ? b : mdc(b % a, a);
    }

    // Maximo Divisor Comum para um array
    static int mdc(int[] arr){
        int mdc = arr[0];
        for(int i = 1; i < arr.length; i++){
            mdc = mdc(mdc, arr[i]);
        }
        return mdc;
    }

    // Verifica se o número é perfeito
    static boolean isPerfect(int n){
        if(n < 6)return false;
        int soma = 0;
        for(int i = 1; i < n; i++){
            if(n%i == 0){
                soma += i;
            }
        }
        return soma == n;
    }

    // Mostra os números perfeitos de 6 a n
    static void showThePerfectNumber(int n){
        System.out.print(">> ");
        for(int i = 0; i <= n; i++){
            // Verifica se o número é perfeito
            do{
                i++;
                if(isPerfect(i)){
                    System.out.print(i + " ");
                    break;
                }
            }while(i <= n);
        }
    }

    static void showThePerfectNumber(int[] n){
        System.out.print(">> ");

        for(int i = 0; i < n.length; i++){
            // Verifica se o número é perfeito
            do{
            if(isPerfect(n[i])){
                System.out.print(n[i] + " ");
                break;
            }
            }while(i < n.length);
        }
    }

    static int inverteNumero(int n){
        Integer num = n;
        String str = num.toString();
        str = (new StringBuilder(str).reverse().toString());
        return Integer.parseInt(str);
    }

}
