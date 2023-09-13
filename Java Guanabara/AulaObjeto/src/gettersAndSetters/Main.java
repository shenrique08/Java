package gettersAndSetters;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.status();

        Caneta c2 = new Caneta("RiC", "Azul", 0.7f);
        c2.status();
    }
}
