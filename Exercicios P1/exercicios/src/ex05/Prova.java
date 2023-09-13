package ex05;

public class Prova {
    private final Gabarito gabarito;

    public Prova(Gabarito gabarito) {
        this.gabarito = gabarito;
        for (int i = 0; i < 5; i++) {
            int[] questoes = new int[5];
            questoes[i] = gabarito.respostaQuestao(i);
        }
    }

    public boolean acertou(char respostaQuestao, int numQuestao) {
        return respostaQuestao == gabarito.respostaQuestao(numQuestao);
    }
}
