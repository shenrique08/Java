package ex04;

import ex03.Data;

public class Voo extends Data {
    private boolean estaCheio;
    private int numVoo;
    private Passageiro[][] passageiros;


    public int proxPoltronaLivre() {
        return passageiros.length + 1;
    }

    public boolean cadeiraEstaOcupada(int numPoltrona) {
        return numPoltrona <= passageiros.length;
    }

    public boolean ocupaPoltrona(int numPoltrona) {
        return !cadeiraEstaOcupada(numPoltrona);
    }

    public int numPoltronasVagas() {
        return 100 - passageiros.length;
    }

    public Voo(int dia, int mes, int ano, String mesPorExtenso, int numVoo, Passageiro[] passageiro) {
        super(dia, mes, ano, mesPorExtenso);
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
        this.setMesPorExtenso(mesPorExtenso);
        this.numVoo = numVoo;
        this.passageiros = new Passageiro[][]{passageiro};
        this.estaCheio = false;
    }

    public boolean isEstaCheio() {
        return estaCheio;
    }

    public void setEstaCheio(boolean estaCheio) {
        this.estaCheio = estaCheio;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public Passageiro[][] getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Passageiro[] passageiros) {
        this.passageiros = new Passageiro[][]{passageiros};
    }
}
