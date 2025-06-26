package dados;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Listar, Adicionar, Excluir, Adotar {

    Scanner ler = new Scanner(System.in);

    public void menuGeralFuncAdmin(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        while (true) {
            System.out.println("*****Menu*****\nEscolha um tipo de ação (ONG's, Pet's, Vacinas):\n1 - Adicionar\n2 - Listar\n3 - Excluir\n4 - Voltar");
            int escolha = ler.nextInt();
            ler.nextLine();

            if (escolha == 1) {
                menuAdicionar(ong, pet, vacina, tipoUsuario, adocoes);
            } else if (escolha == 2) {
                menuListar(ong, pet, vacina, tipoUsuario, adocoes);
            } else if (escolha == 3 && tipoUsuario.equals("Funcionário")) {
                System.out.println("\nNível de acesso insuficiente!\n");
            } else if (escolha == 3) {
                menuExcluir(ong, pet, vacina, tipoUsuario, adocoes);
            } else if (escolha == 4) {
                break;
            } else {
                System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
    }

    public void menuGeralUser(ArrayList<Pet> pets, ArrayList<Adocao> adocao, ArrayList<Pet> carrinho, Cliente cliente, Pet petEscolhido, ArrayList<Adocao> adocoes) {
        while (true) {
            System.out.println("\n*****Menu*****\nEscolha uma ação:\n1 - Adotar pet\n2 - Listar Pet's\n3 - Visualizar Carrinho\n4 - Finalizar adoção\n5 - Voltar");
            int escolha = ler.nextInt();
            ler.nextLine();

            if (escolha == 1) {
                adotar(pets, adocao, carrinho, cliente);
            } else if (escolha == 2) {
                listarPet(pets);
            } else if (escolha == 3) {
                listarCarrinho(carrinho);
            } else if (escolha == 4) {
                finalizarAdocao(carrinho, cliente);
            } else if (escolha == 5) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
