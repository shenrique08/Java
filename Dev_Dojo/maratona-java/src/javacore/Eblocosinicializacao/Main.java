package javacore.Eblocosinicializacao;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(Arrays.toString(anime.getEpsodios()));
    }
}