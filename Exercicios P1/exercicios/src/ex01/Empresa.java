package ex01;


public class Empresa {
    private String nomeEmpresa;
    private String CNPJ;
    private boolean empresaEstaCriada;
    private Departamento[][] departamentos;

    public void mostrarEmpresa() {
        System.out.println("<<<<< EMPRESA >>>>>");
        System.out.printf("Nome da empresa: %s\n", this.getNomeEmpresa());
        System.out.printf("CNPJ: %s\n", this.getCNPJ());
        System.out.printf("A empresa está aberta? %b\n", this.isEmpresaEstaCriada());
    }

    public void criarEmpresa() {
        this.empresaEstaCriada = true;
    }

    public void fecharEmpresa() {
        this.empresaEstaCriada = false;
    }

    public Empresa(String nomeEmpresa, String CNPJ, Departamento[] departamentos) {
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento[][]{departamentos};
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public boolean isEmpresaEstaCriada() {
        return empresaEstaCriada;
    }

    public void setEmpresaEstaCriada(boolean empresaEstaCriada) {
        this.empresaEstaCriada = empresaEstaCriada;
    }

    public Departamento[][] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = new Departamento[][]{departamentos};
    }
}
