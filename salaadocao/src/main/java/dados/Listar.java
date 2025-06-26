package dados;

import java.util.ArrayList;
import java.util.Scanner;

public interface Listar {

    Scanner ler = new Scanner(System.in);

    default void listarOng(ArrayList<Ong> ong) {
        if (ong.isEmpty()) {
            System.out.println("Nenhuma ONG cadastrada\n");
        } else {
            for (Ong ongs : ong) {
                System.out.println("Ong: " + ongs.getNome() + "\n");
            }
        }
    }

    default void listarAdocao(ArrayList<Adocao> adocoes) {
        if (adocoes.isEmpty()) {
            System.out.println("Nenhuma adoção realizada\n");
        } else {
            int i = 1;
            for (Adocao adocao : adocoes) {
                System.out.println("Adoção " + i + ":\n" + adocao.toString() + "\n");
                i++;
            }
        }
    }

    default void listarPet(ArrayList<Pet> pet) {
        if (pet.isEmpty()) {
            System.out.println("Nenhum pet registrado.\n");
        } else {
            for (Pet pets : pet) {
                System.out.println("Pet " + pets.toString() + "\n");
            }

        }
    }

    default void listarVacina(ArrayList<Vacina> vacina) {
        if (vacina.isEmpty()) {
            System.out.println("Nenhuma vacina registrada.\n");
        } else {
            for (Vacina vacinas : vacina) {
                System.out.println("Vacina: " + vacinas.getNome() + "\n");
            }
        }
    }

    default void menuListar(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        while (true) {
            System.out.println("*****Menu*****\nEscolha uma ação:\n1 - Listar ONG\n2 - Listar Pet\n3 - Listar vacina\n4 - Listar adoções\n5 - Sair");
            int escolha = ler.nextInt();
            ler.nextLine();

            if (escolha == 1) {
                listarOng(ong);
            } else if (escolha == 2) {
                listarPet(pet);
            } else if (escolha == 3) {
                listarVacina(vacina);
            } else if (escolha == 4) {
                listarAdocao(adocoes);
            } else if (escolha == 5) {
                break;
            } else {
                System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
    }

}
