package dados;

import java.util.ArrayList;

public class Admin extends Usuario implements Adicionar, Listar, Excluir, Adotar {

    private String idAdmin;
    private String senha;

    public Admin(String nome, String cpf, int anoNascimento, String idAdmin, String senha) {
        super(nome, cpf, anoNascimento);
        this.idAdmin = idAdmin;
        this.senha = senha;
    }

    @Override
    public void fazerLogin() {
        System.out.println("Insira seu ID de Administrador: ");
        java.util.Scanner lerAdmin = new java.util.Scanner(System.in);
        this.idAdmin = lerAdmin.nextLine();
        System.out.println("Login executado.\n");
    }

    //Implementação dos métodos listar, adicionar e exluir**
    public void adicionarOng(ArrayList<Ong> ong) {
        Adicionar.super.adicionarOng(ong);
    }

    public void listarOng(ArrayList<Ong> Ong) {
        Listar.super.listarOng(Ong);
    }

    public void excluirOng(ArrayList<Ong> Ong) {
        Excluir.super.excluirOng(Ong);
    }

    public void adicionarPet(ArrayList<Pet> pet, ArrayList<Ong> ong, ArrayList<Vacina> vacina) {
        Adicionar.super.adicionarPet(pet, ong, vacina);
    }

    public void listarPet(ArrayList<Pet> pet) {
        Listar.super.listarPet(pet);
    }

    public void excluirPet(ArrayList<Pet> pet) {
        Excluir.super.excluirPet(pet);
    }

    public void listarAdocao(ArrayList<Adocao> adocoes) {
        Listar.super.listarAdocao(adocoes);
    }

    public void adicionarVacina(ArrayList<Vacina> vacina) {
        Adicionar.super.adicionarVacina(vacina);
    }

    public void listarVacina(ArrayList<Vacina> vacina) {
        Listar.super.listarVacina(vacina);
    }

    public void excluirVacina(ArrayList<Vacina> vacina) {
        Excluir.super.excluirVacina(vacina);
    }

    public void menuAdicionar(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        Adicionar.super.menuAdicionar(ong, pet, vacina, tipoUsuario, adocoes);
    }

    public void menuListar(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        Listar.super.menuListar(ong, pet, vacina, tipoUsuario, adocoes);
    }

    public void menuExcluir(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        Excluir.super.menuExcluir(ong, pet, vacina, tipoUsuario, adocoes);
    }
    //Fim da implementação dos métodos listar, adicionar e excluir**

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
