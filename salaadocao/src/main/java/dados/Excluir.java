package dados;

import java.util.ArrayList;
import java.util.Scanner;

public interface Excluir {

    Scanner ler = new Scanner(System.in);

    default void excluirOng(ArrayList<Ong> ong) {

        System.out.println("Escolha uma ong para excluir\nOngs cadastradas: \n");

        for (int i = 0; i < ong.size(); i++) {
            System.out.println(i + 1 + " - " + ong.get(i).getNome());
        }
        int escolhaOng = ler.nextInt();

        for (int i = 0; i < ong.size(); i++) {
            if (i == escolhaOng - 1) {

                ong.remove(i);

                System.out.println("Ong removida com sucesso!");
            } else {
                System.out.println("Não foi possível realizar a exclusão");
            }
        }
    }

    default void excluirPet(ArrayList<Pet> pet) {

        System.out.println("Escolha um pet para excluir\nPets cadastradas: \n");

        for (int i = 0; i < pet.size(); i++) {
            System.out.println(i + 1 + " - " + pet.get(i).getId());
        }
        int escolhaPet = ler.nextInt();

        for (int i = 0; i < pet.size(); i++) {
            if (i == escolhaPet - 1) {

                pet.remove(i);

                System.out.println("Pet removido com sucesso!");
            } else {
                System.out.println("Não foi possível realizar a exclusão");
            }
        }
    }

    default void excluirVacina(ArrayList<Vacina> vacina) {

        System.out.println("Escolha uma vacina para excluir\nVacinas cadastradas: \n");

        for (int i = 0; i < vacina.size(); i++) {
            System.out.println(i + 1 + " - " + vacina.get(i).getNome());
        }
        int escolhaVacina = ler.nextInt();

        for (int i = 0; i < vacina.size(); i++) {
            if (i == escolhaVacina - 1) {

                vacina.remove(i);

                System.out.println("Vacina removida com sucesso!");
            } else {
                System.out.println("Não foi possível realizar a exclusão");
            }
        }
    }

    default void menuExcluir(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        while (true) {
            System.out.println("*****Menu*****\nEscolha uma ação:\n1 - Excluir ONG\n2 - Excluir Pet\n3 - Excluir vacina\n4 - Voltar");
            int escolha = ler.nextInt();
            ler.nextLine();

            if (escolha == 1) {
                excluirOng(ong);
            } else if (escolha == 2) {
                excluirPet(pet);
            } else if (escolha == 3) {
                excluirVacina(vacina);
            } else if (escolha == 4) {
                break;
            } else {
                System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
    }

}
