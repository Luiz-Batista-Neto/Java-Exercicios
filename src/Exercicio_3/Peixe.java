package Exercicio_3;

public class Peixe extends Animal{

    public Peixe(String nome, String cor, String ambiente, float comprimento, float velocidadeMedia, int patas, String caracteristica) {
        super(nome, cor, ambiente, comprimento, velocidadeMedia, patas);
        this.caracteristica = caracteristica;
    }
    private String caracteristica;

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String dadosPeixe(){
        return "Nome: " + getNome()
                + "\nAmbiente: " + getAmbiente()
                + "\nNº Patas: " + getPatas()
                + "\nComprimento: " + getComprimento()
                + "\nCor: " + getCor()
                + "\nCaracteristica: " + getCaracteristica();
    }
}
