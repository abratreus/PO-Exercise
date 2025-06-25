//  6) Utilizando o exercício 4 (Data) criar uma classe testadora de datas, onde o haverá duas datas e métodos 
// para comparar se são iguais, qual é a maior e a menor e a diferença, em dias, de uma para a outra. Supor 
// anos de 365 dias. 
package PO;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class testData {
    public static void main(String[] args) {
        Data data1 = new Data(18,12,2009);
        Data data2 = new Data(16,6,2003);

        LocalDate dataUm = LocalDate.of(data1.getAno(), data1.getMes(), data1.getDia());
        DateTimeFormatter formatoNormal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         String dataUmformatada = dataUm.format(formatoNormal);

        LocalDate dataDois = LocalDate.of(data2.getAno(), data2.getMes(), data2.getDia());
         String dataDoisformatada = dataDois.format(formatoNormal);

         System.out.printf("1ª Data: %s \n 2ª Data: %s \n", dataUmformatada, dataDoisformatada);
         comparaData(dataUm, dataDois);
    }
    
    static void comparaData(LocalDate dataUm, LocalDate dataDois){
        
        long dias = ChronoUnit.DAYS.between(dataUm, dataDois);
        dias = Math.abs(dias);
        System.out.println("Diferença em dias: " + dias);
        int resultado = dataUm.compareTo(dataDois);

        if (resultado < 0) {
            System.out.println("data1 é menor");
            System.out.println("data2 é maior");
        } else if (resultado > 0) {
            System.out.println("data1 é maior");
            System.out.println("data2 é menor");
        } else {
            System.out.println("As datas são iguais");
        }

    }
   
}
