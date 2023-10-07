public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;


    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setQtdViews(this.filme.getQtdViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float nota) {
        int tot = 0;
        if (nota <= 20)
            tot = 3;
        else if (nota <= 50)
            tot = 5;
        else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualização { " +
                "espectador = " + espectador +
                ", filme = " + filme +
                " } ";
    }
}
