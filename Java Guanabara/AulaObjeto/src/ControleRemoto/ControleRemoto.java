package ControleRemoto;

public class ControleRemoto implements Controlador{
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // métodos especiais

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado1) {
        this.ligado = ligado1;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando1) {
        this.tocando = tocando1;
    }

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("<<<<< MENU >>>>>");
            System.out.printf("Está ligado? %b\n", this.isLigado());
            System.out.printf("Está tocando? %b\n", this.isTocando());
            System.out.printf("Volume: %d", this.getVolume());

            for (int i = 0; i <= this.getVolume(); i += 5) {
                System.out.print("|");
            }
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume!!!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume!!!");
        }

    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}
