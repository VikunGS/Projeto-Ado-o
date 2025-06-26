package dados;

public abstract class Animal {

    private String raca;
    private String especie;
    private Ong ong;

    public Animal(String raça, String especie, Ong ong) {
        this.raca = raça;
        this.especie = especie;
        this.ong = ong;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Ong getOng() {
        return ong;
    }

    public void setOng(Ong ong) {
        this.ong = ong;
    }

    @Override
    public String toString() {
        return "Raça: " + raca + "\nEspécie: " + especie + "\nOng: " + ong;
    }
}
