package dados;

public abstract class Usuario {

    protected String nome;
    protected String cpf;
    protected int anoNascimento;

    public Usuario(String nome, String cpf, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

    // Método abstrato para fazer login
    public abstract void fazerLogin();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", cpf=" + cpf + ", anoNascimento=" + anoNascimento + "]";
    }

}
