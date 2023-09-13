package ContaBanco;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Zé Maria");
        conta1.abrirConta("CC");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2222);
        conta2.setDono("Maricleuda");
        conta2.abrirConta("CP");

        conta1.depositar(100);
        conta2.depositar(500);
        conta1.estadoAtual();
        conta2.estadoAtual();


        conta1.sacar(conta1.getSaldo());
        conta2.sacar(conta2.getSaldo());
        conta1.fecharConta();
        conta2.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();


    }
}
