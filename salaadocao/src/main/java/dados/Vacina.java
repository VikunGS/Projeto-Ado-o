package dados;

public class Vacina {

    private String nome;
    private String fabricante;

    public Vacina(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "\nNome (" + nome + ") + Fabricante (" + fabricante + ")";
    }

}
