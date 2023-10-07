public class Gafanhoto extends Pessoa {
    private String login;
    private float totalAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.setLogin(login);
        this.setTotalAssistido(0);
    }


    public void viuMaisUm() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public float getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(float totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto {" + super.toString() +
                "login = '" + login + '\'' +
                ", totalAssistido = " + totalAssistido +
                " }";
    }
}
