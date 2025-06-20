/*2)  Imagine  o  problema  de  sair  com  os  amigos  para  uma  refeição  em  um  restaurante  e  ao  final  ter  que 
dividir  a  conta  para  cada  pessoa.  Outra  coisa  importante,  os  10%  do  garçom  é  opcional.  Criar  uma  classe 
para  solucionar  o  problema  proposto,  onde  tem  o  valor  da  conta  a  ser  paga  (sem  os  10%  do  garçom),  a 
quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os 
dados inseridos não permitindo absurdos.*/
package PO;

public class Ex2 {
    public static void main(String[] args) {
        
    }
}

class Bill{

    /* atributos */
    private double bill;
    private int qntPeople;
    private boolean serviceTax;

    /* Metodos */

    /* Construtor */

    public Bill(double bill, int qntPeople, boolean serviceTax){
        this.bill = bill;
        this.qntPeople = qntPeople;
        this.serviceTax = serviceTax;
    }
    /* Getther */

    public double getBill(){
        return bill;
    }

    public int getQntPeople(){
        return qntPeople;
    }

    public boolean getServiceTax(){
        return serviceTax;
    }

    /* Setther */

    public void setBill(double bill){
        this.bill = bill;
    }

    public void setQntPeople(int qntPeople){
        this.qntPeople = qntPeople;
    }

    public void setServiceTax(boolean serviceTax){
        this.serviceTax = serviceTax;
    }
}
