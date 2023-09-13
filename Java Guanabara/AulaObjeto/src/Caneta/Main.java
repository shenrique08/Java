package Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta(); // instanciei a nova caneta
        caneta1.modelo = "BIC Cristal";
        caneta1.cor = "Azul";
        caneta1.carga = 80;
        caneta1.destampar();
        caneta1.status();
    }
}