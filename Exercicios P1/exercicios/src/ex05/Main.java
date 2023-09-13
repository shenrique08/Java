package ex05;

public class Main {
    public static void main(String[] args) {
        Gabarito gabarito1 = new Gabarito();
        Prova prova1 = new Prova(gabarito1);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Resposta da questão %d = %c\n", i + 1, gabarito1.respostaQuestao(i));
        }
    }
}
