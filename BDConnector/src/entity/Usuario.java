package entity;

public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String email;


    public Usuario() {
    }

    public Usuario(String nome, String login, String senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "" + "ID: " + id + '\n' + "Nome: " + nome + '\n' + "Login: " + login + '\n' + "Senha: " + senha + '\n' + "Email: " + email + '\n';
    }
}
