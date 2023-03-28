package Exercicio_3;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Morcego", "Preto", "Cavernas",
                7, 7, 2);

        Peixe peixe = new Peixe("Lambari", "Prata", "Rio",  50,
                45, 0, "Guelras");

        Mamifero mamifero = new Mamifero("Boi", "Branco", "Fazenda", 165,
                3, 4, "Pasto");


        System.out.println(animal.dados() + "\n-----------------");
        System.out.println(peixe.dadosPeixe() + "\n-----------------");
        System.out.println(mamifero.dadosMamifero());
    }
}
