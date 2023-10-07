public class App {
    public static void main(String[] args) {

        Video[] videos = new Video[2];
        videos[0] = new Video("Aula 01");
        videos[1] = new Video("Aula 02");


        Gafanhoto[] gafanhotos = new Gafanhoto[2];
        gafanhotos[0] = new Gafanhoto("Gionberto", "M", 32, "Capeus123");
        gafanhotos[1] = new Gafanhoto("Joana", "F", 32, "Joana321");

        Visualizacao visualizacao = new Visualizacao(gafanhotos[0], videos[1]);
        System.out.println(visualizacao);
    }
}