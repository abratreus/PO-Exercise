// 4)  Criar uma classe  para representar uma Data,  onde teremos dia, mês e  ano. Criar um método booleano 
// que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.
package PO;

public class Ex4 {
    public static void main(String[] args) {
        data.GetData();
    }
}

class data {

    static byte dia = 8;
    static byte mes = 8;
    static short ano = 2005;

    static boolean validarData(byte dia, byte mes, short ano ){
        if (dia <= -1 || dia >= 32)return false;
        if ( mes == 2 && dia >= 29)return false;
        if (mes <= 0 || mes >= 13)return false;
        if (ano <= -1 || ano >= 2026)return false;
        return true;
    }

    static void GetData(){
        if (validarData(dia, mes, ano)){
        System.out.printf("%02d/%02d/%d",dia,mes,ano);
        }else{System.out.print("Data invalida");}
    }
}