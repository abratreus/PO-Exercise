// 3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.
package PO;

public class Ex3 {

    
}

class lampada {

    private boolean apagada;
    private boolean acesa;
    private boolean meialuz;

    public lampada(){
        
    }

    public boolean isApagada() {
        return apagada;
    }

    public void setApagada(boolean apagada) {
        this.apagada = apagada;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public boolean isMeialuz() {
        return meialuz;
    }

    public void setMeialuz(boolean meialuz) {
        this.meialuz = meialuz;
    } 

    
}