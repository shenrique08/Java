package Teste02;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    // esse método está sobreposto
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + "Pagando mensalidade do aluno bolsista");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
