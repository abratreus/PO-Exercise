package PO;
// Elabore  um  programa  em  java  que  contenha  um  método  que  aceite  um  valor  inteiro  e  retorne  o 
// número com os dígitos invertidos. O valor deve ser solicitado ao usuário.
public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int inverteNumero(int n){
        Integer num = n;
        String str = num.toString();
        str = (new StringBuilder(str).reverse().toString());
        return Integer.parseInt(str);
    }
}
