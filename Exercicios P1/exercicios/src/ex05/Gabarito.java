package ex05;

import java.util.Random;

public class Gabarito {

    public char respostaQuestao(int numQuestao) {
        Random random = new Random();
        // A resposta da questão será entre A e E
        char[] letras = {'A', 'B', 'C', 'D', 'E'};
        // Aqui iremos associar um número aleatório para uma das 5 letras
        int indiceAleatorio = random.nextInt(4);
        return letras[indiceAleatorio];
    }
}
