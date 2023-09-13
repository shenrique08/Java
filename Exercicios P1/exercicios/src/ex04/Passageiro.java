package ex04;

public class Passageiro {
    private String nome;
    private int assento;

    public Passageiro(String nome, int assento) {
        this.nome = nome;
        this.assento = assento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }
}
