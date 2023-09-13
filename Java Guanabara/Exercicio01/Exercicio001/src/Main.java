public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[2];

        pessoas[0] = new Pessoa("Maracau", "Masculino", 39);
        pessoas[1] = new Pessoa("Carlota", "Feminino", 57);

        livros[0] = new Livro("Coaching agora e sempre", "Coach Master", 123, pessoas[0]);
        livros[1] = new Livro("Desaprendendo Java", "Java Tranquilo", 1565, pessoas[1]);

        livros[0].abrirPagina();
        livros[0].folhearPagina(50);

        System.out.printf("%s",livros[0].detalhes());

    }
}