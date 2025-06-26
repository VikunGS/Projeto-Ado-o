package dados;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Usuario implements Adotar {

    Scanner ler = new Scanner(System.in);
    String email;
    String senha;

    public Cliente(String nome, String cpf, int anoNascimento, String email, String senha) {
        super(nome, cpf, anoNascimento);
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Implementação do método abstrato da classe Usuario
    @Override
    public void fazerLogin() {
        System.out.println("Insira seu nome: ");
        this.nome = ler.nextLine();
        System.out.println("Insira seu ano de nascimento: ");
        this.anoNascimento = ler.nextInt();
        ler.nextLine();
        System.out.println("Insira seu CPF: ");
        this.cpf = ler.nextLine();
        System.out.println("Insira seu email: ");
        this.email = ler.nextLine();
        System.out.println("Insira sua senha: ");
        this.senha = ler.nextLine();
    }

    public void adotar(ArrayList<Pet> pet, ArrayList<Adocao> adocao, ArrayList<Pet> carrinho, Cliente cliente) {
        Adotar.super.adotar(pet, adocao, carrinho, cliente);
    }

    @Override
    public String toString() {
        return "Cliente [numeroPets=" + ", email=" + email + ", senha="
                + senha + "]";
    }

}
