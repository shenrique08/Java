package ex03;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(12, 9, 2020, "Setembro");
        Data data2 = new Data(12, 9, 2020, "Setembro");
        int verdade = data1.comparaData(data2);
        if (verdade == 0) {
            System.out.println("As datas são iguais");
        } else {
            System.out.println("As datas são diferentes");
        }
        data1.mostrarData();
    }
}
