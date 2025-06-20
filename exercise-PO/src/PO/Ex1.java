/*1) Criar uma classe para representar uma lâmpada vendida em um supermercado. Além de marca, modelo 
e  tipo,  esta  deve  conter  um  atributo  que  indique  um  dos  dois  possíveis  estados  da  lâmpada  (acesa  ou 
apagada). */
package PO;

public class Ex1 {
    public static void main(String[] args) {
        
    }
}

class Lamp {
    
    /* Atributos */
    private String brand = "Philips";
    private String model = "LED";
    private String type = "Bold";
    private boolean status = false; // true = acesa, false = apagada

    /* Metodos */
    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }

    public void showStatus(){
        if(status){
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    /* Construtor */
    public Lamp(String brand, String model, String type, boolean status) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.status = status;
    }

    /* Getther */
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;  
    }
    public String getType(){
        return type;  
    }
    public boolean getStatus(){
        return status;  
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setStatus(boolean status){
        this.status = status;
    }


}
