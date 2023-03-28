package Exercicio_3;

public class Mamifero extends Animal{

    private String alimento;
    public Mamifero(String nome, String cor, String ambiente, float comprimento, float velocidadeMedia, int patas, String alimento) {
        super(nome, cor, ambiente, comprimento, velocidadeMedia, patas);
        this.alimento = alimento;
    }


    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String dadosMamifero(){
        return "Nome: " + getNome()
                + "\nAmbiente: " + getAmbiente()
                + "\nNº Patas: " + getPatas()
                + "\nComprimento: " + getComprimento()
                + "\nCor: " + getCor()
                + "\nAlimento: " + getAlimento();
    }
}
