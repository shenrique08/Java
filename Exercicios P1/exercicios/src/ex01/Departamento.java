package ex01;

import java.util.Arrays;

public class Departamento {
    private String nomeDepartamento;
    private Funcionario[] funcionarios;

    @Override
    public String toString() {
        return "Departamento{" +
                "nomeDepartamento='" + nomeDepartamento + '\'' +
                ", funcionários=" + Arrays.toString(funcionarios) +
                '}';
    }

    public Departamento(String nomeDepartamento, Funcionario[] funcionarios) {
        this.nomeDepartamento = nomeDepartamento;
        this.funcionarios = funcionarios;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
