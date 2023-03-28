package Exercicio_1;

public class Aquatico extends Transporte{

    private String nome;

    public Aquatico(int capacidade, String nome) {
        super(capacidade);
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
