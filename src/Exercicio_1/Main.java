package Exercicio_1;

public class Main {
    public static void main(String[] args) {
        Aquatico barco = new Aquatico(200, "Barco");
        Automovel carro = new Automovel(4, 4, "Vermelho","ABC-3737", 4);
        Aereo aviao = new Aereo(50, "Avião");

        System.out.println("Nome: " + barco.getNome() + " | " + "Capacidade: " + barco.getCapacidade());
        System.out.println("Nome: " + aviao.getNome() + " | " + "Capacidade: " + aviao.getCapacidade());

        System.out.println(carro.getCapacidade() + " | " + carro.getnRodas() + " | "
                + carro.getCor() + " | " + carro.getPlaca() + " | " + carro.getnRodas());
    }
}

/*
1.Usando a lógica de herança responda:
  Quantos e quais são os atributos da classe Exercicio_1.Terrestre?  E da classe Automóvel?

  Exercicio_1.Terrestre: Número de rodas
  Automóvel: Cor, Número de portas e Placa
*/