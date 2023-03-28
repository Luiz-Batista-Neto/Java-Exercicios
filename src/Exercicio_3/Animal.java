package Exercicio_3;

public class Animal {
    private String nome, cor, ambiente;
    private float comprimento, velocidadeMedia;
    private int patas;

    public Animal(String nome, String cor, String ambiente, float comprimento, float velocidadeMedia, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidadeMedia = velocidadeMedia;
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String dados(){
        return "Nome: " + getNome()
                + "\nAmbiente: " + getAmbiente()
                + "\nNº Patas: " + getPatas()
                + "\nComprimento: " + getComprimento()
                + "\nCor: " + getCor();
    }

}