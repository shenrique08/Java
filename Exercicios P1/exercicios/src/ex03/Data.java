package ex03;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesPorExtenso;



    public boolean isBissexto() {
        return (this.getAno() % 4 == 0 && this.getAno() % 100 == 0) || (this.getAno() % 400 == 0);
    }

    public int comparaData(Data data1) {
        if (this.getMes() == data1.getMes() && this.getDia() == data1.getDia() && this.getAno() == data1.getAno()) {
            return 0;
        } else {
            return 1;
        }
    }

    
    public void mostrarData() {
        System.out.printf("%d/%d/%d\n", this.getDia(), this.getMes(), this.getAno());
        System.out.printf("É bissexto? %b", isBissexto());
    }
    
    public Data(int dia, int mes, int ano, String mesPorExtenso) {
        if ((dia <= 1 || dia >= 31) || (mes < 1 || mes > 12) || (ano < 0)) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
            this.mesPorExtenso = "janeiro";
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.mesPorExtenso = mesPorExtenso;
        }
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getMesPorExtenso() {
        return this.mesPorExtenso;
    }
    
    public void setMesPorExtenso(String mesPorExtenso) {
        this.mesPorExtenso = mesPorExtenso;
    }
}
