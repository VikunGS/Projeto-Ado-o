package dados;

import java.util.ArrayList;
import java.util.Scanner;

public interface Adicionar {

    Scanner ler = new Scanner(System.in);

    default void adicionarOng(ArrayList<Ong> ong) {
        System.out.println("Nome da ONG: ");
        String nome = ler.nextLine();
        System.out.println("CNPJ da ONG: ");
        String cnpj = ler.nextLine();
        System.out.println("Endereço da ONG: ");
        String endereco = ler.nextLine();

        Ong novaOng = new Ong(nome, cnpj, endereco);
        ong.add(novaOng);
        System.out.println("ONG adicionada com sucesso!\n");
    }

    default void adicionarPet(ArrayList<Pet> pet, ArrayList<Ong> ong, ArrayList<Vacina> vacina) {
        String[] opcoesOng = new String[ong.size()];
        for (int i = 0; i < ong.size(); i++) {
            opcoesOng[i] = ong.get(i).getNome();
        }
        String[] opcoesVacina = new String[vacina.size()];
        for (int i = 0; i < vacina.size(); i++) {
            opcoesVacina[i] = vacina.get(i).getNome();
        }
        System.out.println("Escolha a vacina aplicada, se aplicável:");
        for (int i = 0; i < opcoesVacina.length; i++) {
            System.out.println((i + 1) + " - " + opcoesVacina[i]);
        }
        System.out.println("0 - Nenhuma aplicada");
        int escolhaVacina = ler.nextInt();
        ler.nextLine();
        Vacina vacinaEscolhida = null;
        if (escolhaVacina > 0 && escolhaVacina <= vacina.size()) {
            vacinaEscolhida = vacina.get(escolhaVacina - 1);
        }
        System.out.println("\nQual é o ID do pet?");
        String id = ler.nextLine();
        System.out.println("\nQual é a espécie do pet?");
        String especie = ler.nextLine();
        System.out.println("\nQual a raça do pet?");
        String raca = ler.nextLine();
        System.out.println("\nA Qual ONG o pet pertence?");
        for (int i = 0; i < opcoesOng.length; i++) {
            System.out.println((i + 1) + " - " + opcoesOng[i]);
        }
        System.out.println("0 - Nenhuma ONG");
        int escolhaOng = ler.nextInt();
        ler.nextLine();
        Ong ongEscolhida = null;
        if (escolhaOng > 0 && escolhaOng <= ong.size()) {
            ongEscolhida = ong.get(escolhaOng - 1);
        }
        Pet novoPet = new Pet(vacinaEscolhida, id, especie, ongEscolhida, raca);
        pet.add(novoPet);

        System.out.println("Pet cadastrado com sucesso!\n");
    }

    default void adicionarVacina(ArrayList<Vacina> vacina) {
        System.out.println("Nome da vacina: ");
        String nome = ler.nextLine();
        System.out.println("Fabricante da vacina: ");
        String fabricante = ler.nextLine();

        Vacina novaVacina = new Vacina(nome, fabricante);
        vacina.add(novaVacina);
        System.out.println("Vacina adicionada com sucesso!\n");
    }

    default void menuAdicionar(ArrayList<Ong> ong, ArrayList<Pet> pet, ArrayList<Vacina> vacina, String tipoUsuario, ArrayList<Adocao> adocoes) {
        while (true) {
            System.out.println("*****Menu*****\nEscolha uma ação:\n1 - Adicionar ONG\n2 - Adicionar Pet\n3 - Adicionar vacina\n4 - Voltar");
            int escolha = ler.nextInt();
            ler.nextLine();

            if (escolha == 1) {
                adicionarOng(ong);
            } else if (escolha == 2) {
                adicionarPet(pet, ong, vacina);
            } else if (escolha == 3) {
                adicionarVacina(vacina);
            } else if (escolha == 4) {
                break;
            } else {
                System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
    }

}
