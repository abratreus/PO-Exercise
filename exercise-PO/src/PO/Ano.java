package PO;
// Elabore  um  programa em  java  que contenha  um  método  booleano  que teste  se  um  ano é  ou  não 
// bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que 
// sejam também divisíveis por 400.

public class Ano {

	public static boolean ehBissexto(int ano) {
		if (ano % 4 != 0) {
			return false;
		} else if (ano % 100 != 0) {
			return true;
		} else if (ano % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

    private int ano;

    public Ano(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método de instância usando o atributo ano
    public boolean ehBissexto() {
        return ehBissexto(this.ano);
    }
}
