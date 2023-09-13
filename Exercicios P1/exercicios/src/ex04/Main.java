package ex04;

public class Main {
    public static void main(String[] args) {
        Passageiro[] passageiros = new Passageiro[100];
        passageiros[0] = new Passageiro("Joselton", 1);
        passageiros[1] = new Passageiro("Marianeta", 2);

        Voo voo1 = new Voo(12, 8, 2023, "Agosto", 23254, passageiros);

    }
}
