package PO;
// 7)  Escrever  uma  classe  ModeloDeComputador  que  encapsule  valores  que  definam  a  configuração  de  um 
// microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por 
// exemplo). Essa classe deve ter um método calcularPreco que calculará o preço do computador como sendo 
// a soma do custo de seus componentes: 
 
// • Placa-mãe: R$800 
// • Opções de processadores: 1600Mhz a R$700, 1800Mhz a R$830, 1900Mhz a R$910 
// • Opções de memória: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350. 
// • Opções de disco rígido: 500 GB a R$300, 1 TB a R$420, 2TB a R$500. 
// • Opções de monitor: 15 polegadas a R$320, 17 polegadas a R$520.


public class  ModeloDeComputador {
    private int processador;
    private int memoriaRam; // Representa a memória RAM em GB
    private int discoRigidoTamanho;
    private int tamanhoMonitorPolegadas;

    public ModeloDeComputador(int processador, int memoriaRam, int discoRigidoTamanho, int tamanhoMonitorPolegadas) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.discoRigidoTamanho = discoRigidoTamanho;
        this.tamanhoMonitorPolegadas = tamanhoMonitorPolegadas;
    }
    public int getProcessador() {
        return processador;
    }
    public void setProcessador(int processador) {
        this.processador = processador;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public int getDiscoRigidoTamanho() {
        return discoRigidoTamanho;
    }
    public void setDiscoRigidoTamanho(int discoRigidoTamanho) {
        this.discoRigidoTamanho = discoRigidoTamanho;
    }
    public int getTamanhoMonitorPolegadas() {
        return tamanhoMonitorPolegadas;
    }
    public void setTamanhoMonitorPolegadas(int tamanhoMonitorPolegadas) {
        this.tamanhoMonitorPolegadas = tamanhoMonitorPolegadas;
    }

    int calcularPreco(int processador,int ram, int discRigido, int monitorTamanho){
        int precoTotal = 800;

        //processador
        switch (processador) {
            case 1600:
                processador = 700;
                break;
            case 1800:
                processador = 830;
                break;
            case 1900:
                processador = 910;
            default:
                break;
        }
        //ram
        ram *= 350;
        //disco
        switch (discRigido) {
            case 500:
            discRigido = 300;
            break;
            case 1000:
            discRigido = 420;
            break;
            case 2000:
            discRigido = 500;
            break;
            default:
            discRigido = 0;
            break;
        }
        //monitor
        switch (monitorTamanho) {
            case 15:
            monitorTamanho = 320;
            break;
            case 17:
            monitorTamanho = 520;
            break;
            default:
            monitorTamanho = 0;
            break;
        }

        // Preço total
        
        precoTotal = 800 + processador + ram + discRigido + monitorTamanho;
        return precoTotal;
    }
}

