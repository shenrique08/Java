package ex01;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionariosRH = new Funcionario[2];
        funcionariosRH[0] = new Funcionario("Tião", "01/12/1998", 1250);
        funcionariosRH[1] = new Funcionario("Mugel", "03/04/1988", 2200);

        Funcionario[] funcionariosVendas = new Funcionario[2];
        funcionariosVendas[0] = new Funcionario("Carmina", "23/12/2010", 8000);
        funcionariosVendas[1] = new Funcionario("Gerônimo", "12/05/2016", 4000);


        Departamento[] departamentos = new Departamento[2];
        departamentos[0] = new Departamento("RH", funcionariosRH);
        departamentos[1] = new Departamento("Vendas", funcionariosVendas);

        Empresa empresaTeste = new Empresa("Casas Minas", "9874635", departamentos);
        empresaTeste.criarEmpresa();

        empresaTeste.mostrarEmpresa();
        System.out.println(departamentos[0]);

        funcionariosRH[0].darAumento(0.5f);
        System.out.println(funcionariosRH[0].getSalario());
    }
}