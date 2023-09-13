package javacore.Associacao2;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Belinton");
        Professor[] professores = {professor};
        Escola escola = new Escola("Escola do Giro", professores);

        escola.imprime();
    }
}
