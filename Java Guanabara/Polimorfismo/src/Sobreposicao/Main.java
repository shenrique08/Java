package Sobreposicao;

public class Main {
    public static void main(String[] args) {
        // Sobreposicao.Animal animal = new Sobreposicao.Animal();
        // A linha acima não está correta, pois uma classe abstrata não pode ser instanciada

        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        Cachorro cachorro = new Cachorro();

        cachorro.locomover();

    }
}