package dados;

import java.util.ArrayList;
import java.util.Scanner;

public interface Adotar {

    Scanner ler = new Scanner(System.in);

    default void adotar(ArrayList<Pet> pet, ArrayList<Adocao> adocoes, ArrayList<Pet> carrinho, Cliente cliente) {
        String[] opcoesPet = new String[pet.size()];
        for (int i = 0; i < pet.size(); i++) {
            opcoesPet[i] = pet.get(i).getId();
        }
        System.out.println("Pets disponíveis: ");
        if (pet.isEmpty()) {
            System.out.println("\nNenhum pet disponível\nDigite 1 para sair");

        } else {
            for (int i = 0; i < opcoesPet.length; i++) {
                System.out.println(i + 1 + " - " + opcoesPet[i]);
            }
        }
        int escolhaPet = ler.nextInt();
        ler.nextLine();

        Pet petEscolhido = null;

        for (int i = 0; i < pet.size(); i++) {
            if (i == escolhaPet - 1) {
                petEscolhido = pet.get(i);
                System.out.println("Informações do pet:\n" + petEscolhido.toString() + "\n");
                System.out.println("1 - Adicionar ao carrinho\n2 - Sair");
                int escolha = ler.nextInt();

                if (escolha == 1) {
                    carrinho.add(petEscolhido);
                    System.out.println("Pet adicionado com sucesso!");
                    pet.remove(i);
                    Adocao novaAdocao = new Adocao(cliente, petEscolhido);
                    adocoes.add(novaAdocao);
                } else if (escolha == 2) {
                    break;
                } else {
                    System.out.println("Opção inválida");
                }
                break;
            }
        }
    }

    default void listarCarrinho(ArrayList<Pet> carrinho) {
        if (carrinho.isEmpty()) {
            System.out.println("Nenhum item no carrinho\n");
        } else {
            System.out.println("Carrinho atual:\n");
            for (Pet carro : carrinho) {
                System.out.println("Pet ID: " + carro.getId());
            }
        }
    }

    default void finalizarAdocao(ArrayList<Pet> carrinho, Cliente cliente) {
        listarCarrinho(carrinho);
        System.out.println("\nDeseja finalizar a compra?\n1 - Sim\n2 - Não(sair)");

        int escolhaAdotar = ler.nextInt();
        ler.nextLine();

        if (escolhaAdotar == 1) {
            System.out.println("Insira seu email: ");
            String emailDigitado = ler.nextLine();
            System.out.println("Insira sua senha: ");
            String senhaDigitada = ler.nextLine();

            if (emailDigitado.equals(cliente.email) && senhaDigitada.equals(cliente.senha)) {
                System.out.println("\nAdoção realizada com sucesso!");
            } else {
                System.out.println("Email ou senha incorretos.");
            }
        } else if (escolhaAdotar == 2) {
            System.out.println("Finalização cancelada.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
