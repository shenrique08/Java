package Teste01;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Gerivaldo");
        p2.setNome("Claudivânia");
        p3.setNome("Girafales");
        p4.setNome("Claudiaberta");

        p1.setSexo("Masculino");
        p4.setSexo("Feminino");
        p2.setIdade(19);

        p2.setCurso("TI");
        p3.setSalario(2500f);
        p4.setSetor("Estoque");

        p3.receberAumento(200f);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}