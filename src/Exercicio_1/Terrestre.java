package Exercicio_1;

public class Terrestre extends Transporte{

    private int nRodas;

    public Terrestre(int capacidade, int nRodas) {
        super(capacidade);
        this.nRodas = nRodas;
    }

    public int getnRodas() {
        return nRodas;
    }

    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }
}
