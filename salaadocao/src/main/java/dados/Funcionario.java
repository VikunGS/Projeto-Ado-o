package dados;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Usuario implements Adicionar, Listar, Adotar {

    Scanner lerFunc = new Scanner(System.in);
    private String idFuncionario;
    private String senha;

    public Funcionario(String nome, String cpf, int anoNascimento, String idFuncionario, String senha) {
        super(nome, cpf, anoNascimento);
        this.idFuncionario = idFuncionario;
        this.senha = senha;
    }

    @Override
    public void fazerLogin() {
        System.out.println("Insira seu ID de Funcionario: ");
        this.idFuncionario = lerFunc.nextLine();
        System.out.println("Login executado.\n");
    }

    //Implementação dos métodos listar e adicionar**
    public void adicionarOng(ArrayList<Ong> ong) {
        Adicionar.super.adicionarOng(ong);
    }

    public void listarOng(ArrayList<Ong> Ong) {
        Listar.super.listarOng(Ong);
    }

    public void adicionarPet(ArrayList<Pet> pet, ArrayList<Ong> ong, ArrayList<Vacina> vacina) {
        Adicionar.super.adicionarPet(pet, ong, vacina);
    }

    public void listarPet(ArrayList<Pet> pet) {
        Listar.super.listarPet(pet);
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

    public void menuAdicionar(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        Adicionar.super.menuAdicionar(ong, pet, vacina, tipoUsuario, adocoes);
    }

    public void menuListar(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        Listar.super.menuListar(ong, pet, vacina, tipoUsuario, adocoes);
    }
    //Fim da implementação dos métodos listar e adicionar**

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
