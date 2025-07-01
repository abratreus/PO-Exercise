// 8)  Escrever  a  classe  ConversaoDeUnidadesDeArea  com  métodos  para  conversão  das  unidades  de  área 
// segundo a lista abaixo: 
 
// • 1 metro quadrado = 10.76 pés quadrados 
// • 1 pé quadrado = 929 centímetros quadrados 
// • 1 milha quadrada = 640 acres 
// • 1 acre = 43.560 pés quadrados 
package PO;

public class ConversaoDeUnidadesDeArea {
        
    public static double metroQuadradoParaPesQuadrados(double metrosQuadrados) {
        return metrosQuadrados * 10.76;
    }

    public static double peQuadradoParaCentimetrosQuadrados(double pesQuadrados) {
        return pesQuadrados * 929;
    }

    public static double milhaQuadradaParaAcres(double milhasQuadradas) {
        return milhasQuadradas * 640;
    }

    public static double acreParaPesQuadrados(double acres) {
        return acres * 43.560;
    }
}