package Caneta;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean estaTampada;

    public void status() {
        System.out.printf("\nModelo: %s\n", this.modelo);
        System.out.printf("Uma caneta %s\n", this.cor);
        System.out.printf("Está tampada? %b\n", this.estaTampada);
        System.out.printf("Carga: %d%%\n", this.carga);
        System.out.printf("Ponta: %.2f\n", this.ponta);
    }


    public void rabiscar() {
        if (this.estaTampada) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar() {
        this.estaTampada = true;
    }

    public void destampar() {
        this.estaTampada = false;
    }
}
