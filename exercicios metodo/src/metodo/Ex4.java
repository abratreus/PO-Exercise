package metodo;
/*4) [POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta  as 
duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário o valor double das 3 
notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota 
mais  alta  e  a  nota  mais  baixa.  Tente  criar  apenas  um  método  para  retornar  essas  médias.  Este  método 
deverá  receber as 3 notas como  parâmetros de  entrada e  retornar os valores  solicitados. As notas  devem 
ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero. 
 
 Entrada:    Saída:    Cálculo: 
  Entre com a nota 1: 6   Média maiores: 7  [ (6 + 8) / 2 ] 
  Entre com a nota 2: 8   Média aritmética: 6  [ (6 + 8 + 4) / 3 ] 
  Entre com a nota 3: 4   Maior nota: 8   [ 6, 8, 4 ] 
       Menor nota: 4   [ 6, 8, 4 ] 
        
  Entre com a nota 1: 6   Média maiores: 7  [ (6 + 8) / 2 ] 
  Entre com a nota 2: 8   Média aritmética: 4,7  [ (6 + 8 + 0 ) / 3 ] 
  Entre com a nota 3: 14   Maior nota: 8   [ 6, 8, 0 ] 
       Menor nota: 0   [ 6, 8, 0 ]
   */
import java.util.Arrays;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        scannerNotas(read);
    }

    static void scannerNotas (Scanner read){
        System.out.print("Entre com a nota 1: ");
        double nota1 = read.nextDouble();
        if(nota1 < 0 || nota1 > 10)nota1 = 0;
        System.out.print("Entre com a nota 2: ");
        double nota2 = read.nextDouble();
        if(nota2 < 0 || nota2 > 10)nota2 = 0;
        System.out.print("Entre com a nota 3: ");
        double nota3 = read.nextDouble();
        if(nota3 < 0 || nota3 > 10)nota3 = 0;
        calculaNota(nota1, nota2, nota3);
    }

    static void calculaNota(double nota1, double nota2, double nota3){
        double[] notas = {nota1, nota2, nota3};
        Arrays.sort(notas);
        double maiorNota = notas[2];
        double menorNota = notas[0];
        double mediaAritmetica = (nota1 + nota2 + nota3) / 3;
        double mediaMaiores = (notas[2] + notas[1]) / 2;
        System.out.println("Média maiores: " + mediaMaiores);
        System.out.println("Média aritmética: " + mediaAritmetica);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }
}
