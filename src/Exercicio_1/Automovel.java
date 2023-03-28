package Exercicio_1;

public class Automovel extends Terrestre{
    private String cor, placa;
    private int nPortas;

    public Automovel(int capacidade,int nRodas, String cor, String placa, int nPortas) {
        super(capacidade, nRodas);
        this.cor = cor;
        this.placa = placa;
        this.nPortas = nPortas;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
}
