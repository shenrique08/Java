package ContaBanco;

import java.util.Objects;

public class ContaBanco {
    // atributos da classe
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // método construtor
    public ContaBanco () {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual() {
        System.out.print("\n<<<<< ESTADO ATUAL DA CONTA >>>>>\n");
        System.out.printf("Conta: %d\n", this.getNumConta());
        System.out.printf("Tipo: %s\n", this.getTipo());
        System.out.printf("Dono: %s\n", this.getDono());
        System.out.printf("Saldo: R$%.2f\n", this.getSaldo());
        System.out.printf("A conta está aberta: %b\n", this.getStatus());
    }

    // métodos getters and setters
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean status1) {
        this.status = status1;
    }

    public boolean getStatus () {
        return this.status;
    }

    public void abrirConta(String tipoDaConta) {
        this.setTipo(tipoDaConta);
        this.setStatus(true);
        if (Objects.equals(tipoDaConta, "CC")) {
            this.setSaldo(50);
        } else if (Objects.equals(tipoDaConta, "CP")) {
            this.setSaldo(150);
        } else {
            System.out.println("ERRO");
        }

        System.out.println("Conta aberta!!!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.printf("Conta com R$%.3f reais\n", getSaldo());
        } else if (this.getSaldo() < 0) {
            System.out.printf("Conta com débito de R$%.3f reais\n", getSaldo());
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada!!!\n");
        }
    }

    public void depositar(float valorDepositar) {
        // se a conta estiver aberta
        if (this.getStatus()) { // é a mesma coisa que this.status == true. Ou seja, isso seria redundância
            this.setSaldo(getSaldo() + valorDepositar); // é a mesma coisa que "saldo = saldo + valor"
            System.out.printf("Depósito de R$%.2f realizado na conta de %s\n", valorDepositar, this.getDono());
        } else {
            System.out.println("Impossível depositar nesta conta\n");
        }
    }

    public void sacar(float valorSacar) {
        if (this.getStatus()) {
            if (valorSacar <= this.getSaldo()) {
                this.setSaldo(getSaldo() - valorSacar);
                System.out.printf("R$%.2f sacado com sucesso!\n", valorSacar);
            } else {
                System.out.println("Saldo insuficiente para saque!\n");
            }
        } else {
            System.out.println("Impossível sacar\n");
        }
    }

    public void pagarMensalidade() {
        float num = 0;
        if (Objects.equals(this.tipo, "CC")) {
            num = 12;
        } else if (Objects.equals(this.tipo, "CP")) {
            num = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() > num) {
                setSaldo(getSaldo() - num);
                System.out.println("Mensalidade paga com sucesso\n");
            } else {
                System.out.println("Saldo insuficiente!\n");
            }
        } else {
            System.out.println("Impossível pagar!\n");
        }
    }

}
