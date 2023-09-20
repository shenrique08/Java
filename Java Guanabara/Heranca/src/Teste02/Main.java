package Teste02;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(23443);

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");

        a1.pagarMensalidade();
        b1.pagarMensalidade();
    }
}
