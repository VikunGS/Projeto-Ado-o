package dados;

public class Adocao {

    private Cliente cliente;
    private Pet pet;

    public Adocao(Cliente cliente, Pet pet) {
        this.cliente = cliente;
        this.pet = pet;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        String cpf = (cliente != null) ? cliente.getCpf() : "Cliente não definido";
        String petId = (pet != null) ? String.valueOf(pet.getId()) : "Pet não definido";
        return "\nCPF do cliente: " + cpf + "\nPet: " + petId;
    }
}
