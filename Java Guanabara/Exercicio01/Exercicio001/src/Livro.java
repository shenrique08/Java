public class Livro implements Publicacao {
    private String tituloDoLivro;
    private String autorDoLivro;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor; // agregação

    public Livro(String tituloDoLivro, String autorDoLivro, int totalPaginas, Pessoa leitor) {
        this.tituloDoLivro = tituloDoLivro;
        this.autorDoLivro = autorDoLivro;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }


    public String detalhes() {
        return "Livro\n\n" +
                "\ntituloDoLivro = " + tituloDoLivro + '\'' +
                "\nautorDoLivro = " + autorDoLivro + '\'' +
                "\ntotalPaginas = " + totalPaginas +
                "\npaginaAtual = " + paginaAtual +
                "\naberto = " + aberto +
                "\nleitor = " + leitor.getNome() +
                '\n';
    }

    public String getTituloDoLivro() {
        return this.tituloDoLivro;
    }

    public void setTituloDoLivro(String tituloDoLivro) {
        this.tituloDoLivro = tituloDoLivro;
    }

    public String getAutorDoLivro() {
        return this.autorDoLivro;
    }

    public void setAutorDoLivro(String autorDoLivro) {
        this.autorDoLivro = autorDoLivro;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return this.paginaAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    @Override
    public void abrirPagina() {
        this.aberto = true;
    }

    @Override
    public void fecharPagina() {
        this.aberto = false;
    }

    @Override
    public void folhearPagina(int pagina) {
        if (pagina > this.totalPaginas) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = pagina;
        }
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
}
