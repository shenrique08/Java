public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int qtdViews;
    private int qtdCurtidas;
    private boolean estaReproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setQtdViews(0);
        this.setQtdCurtidas(0);
        this.setEstaReproduzindo(false);
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }

    public int getQtdCurtidas() {
        return qtdCurtidas;
    }

    public void setQtdCurtidas(int qtdCurtidas) {
        this.qtdCurtidas = qtdCurtidas;
    }

    public boolean isEstaReproduzindo() {
        return estaReproduzindo;
    }

    public void setEstaReproduzindo(boolean estaReproduzindo) {
        this.estaReproduzindo = estaReproduzindo;
    }

    @Override
    public String toString() {
        return "Video {" +
                "titulo = " + titulo + '\'' +
                "\navaliação = " + avaliacao +
                "\nqtdViews = " + qtdViews +
                "\nqtdCurtidas = " + qtdCurtidas +
                "\nestaReproduzindo = " + estaReproduzindo;
    }
}
