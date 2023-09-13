package ex01;

public class Funcionario {
    private String nomeFuncionario;
    private String dataAdmissao;
    private float salario;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nomeFuncionario='" + nomeFuncionario + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void darAumento(float percentual) {
        setSalario((getSalario() + getSalario() * percentual));
    }

    public Funcionario(String nomeFuncionario, String dataAdmissao, float salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
