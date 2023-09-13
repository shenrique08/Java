package javacore.Eblocosinicializacao;

public class Anime {
    private String nome;
    private int[] epsodios;

    {
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {
        for (int epsodio: this.epsodios) {
            System.out.printf("Epsodio %d\n", epsodio);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
