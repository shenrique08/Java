package ex02;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente("Maricléudo", 234534);
        contaCorrente1.abrirConta();
        contaCorrente1.depositar(200);

        System.out.println(contaCorrente1);
    }
}
