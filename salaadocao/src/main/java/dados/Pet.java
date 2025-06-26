package dados;

public class Pet extends Animal {

    private String id;
    private Vacina vacina;

    public Pet(Vacina vacina, String id, String raça, Ong ong, String especie) {
        super(raça, especie, ong);
        this.vacina = vacina;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vacina getvacina() {
        return vacina;
    }

    public void setvacina(String vacina) {
        vacina = vacina;
    }

    public void mostrarId() {
        System.out.println(this.id);
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nVacina - " + vacina + "\nRaça: " + getRaca() + "\nEspécie: " + getEspecie() + "\nOng - " + getOng();
    }

}
