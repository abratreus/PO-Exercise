// 4)  Criar uma classe  para representar uma Data,  onde teremos dia, mês e  ano. Criar um método booleano 
// que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.
package PO;

public class Data {

    private int dia = 8;
    private int mes = 8;
    private int ano = 2005;

     boolean validarData(int dia, int mes, int ano ){
        if (dia < 1 || dia >= 32)return false;
        if ( mes == 2 && dia >= 29)return false;
        if (mes <= 0 || mes >= 13)return false;
        if (ano <= -1 || ano >= 2026)return false;
        return true;
    }

     public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano;
    }
}