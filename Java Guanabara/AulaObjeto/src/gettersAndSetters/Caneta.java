package gettersAndSetters;
public class Caneta {
    private String modelo;
    private float ponta;
    private final String cor;
    private boolean estaTampada;
    public Caneta (String m, String c, float p) { // este é o método construtor
        this.setModelo(m);
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo (String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.estaTampada = true;
    }

    public void destampar() {
        this.estaTampada = false;
    }

    public void status() {
        System.out.println("\n<<< SOBRE A CANETA >>>");
        System.out.printf("Modelo: %s\n", this.getModelo());
        System.out.printf("Ponta: %.2f\n", this.getPonta());
        System.out.printf("Cor: %s\n", this.cor);
        System.out.printf("Tampada: %b\n", this.estaTampada);

    }
}
