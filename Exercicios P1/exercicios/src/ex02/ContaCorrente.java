package ex02;

public class ContaCorrente {
    private String donoConta;
    private double saldoDaConta;
    private long numConta;
    private boolean aContaEstaAberta;

    @Override
    public String toString() {
        return "\nContaCorrente" +
                "\nDono da Conta = " + getDonoConta() + '\n' +
                "Saldo da Conta = " + getSaldoDaConta() +
                "\nNumConta = " + getNumConta() +
                "\nA Conta Esta Aberta = " + isaContaEstaAberta() +
                ' ';
    }

    public void abrirConta() {
        this.aContaEstaAberta = true;
    }

    public void fecharConta() {
        this.aContaEstaAberta = false;
    }

    public void depositar(double valor) {
        if (!aContaEstaAberta) {
            return;
        }
        setSaldoDaConta(getSaldoDaConta() + valor);
    }

    public int sacar(double valor) {
        if (this.getSaldoDaConta() <= 0 || !aContaEstaAberta) {
            return -1;
        } else {
            setSaldoDaConta(getSaldoDaConta() - (valor + (valor * 0.05)));
            return 0;
        }
    }


    public ContaCorrente(String donoConta, long numConta) {
        this.setDonoConta(donoConta);
        this.setSaldoDaConta(0f);
        this.setNumConta(numConta);
        this.aContaEstaAberta = false;
    }


    public String getDonoConta() {
        return this.donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getSaldoDaConta() {
        return this.saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public long getNumConta() {
        return this.numConta;
    }

    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }

    public boolean isaContaEstaAberta() {
        return this.aContaEstaAberta;
    }
}
