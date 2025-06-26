package dados;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Ong> listaOng = new ArrayList<>();
        ArrayList<Pet> listaPet = new ArrayList<>();
        ArrayList<Vacina> listaVacina = new ArrayList<>();
        ArrayList<Adocao> listaAdocao = new ArrayList<>();
        ArrayList<Pet> carrinho = new ArrayList<>();
        Pet petEscolhido = null;
        Menu menu = new Menu();

        while (true) {

            System.out.println("*****Sistema de adoção*****\nEscolha o tipo de acesso:\n1 - Cliente\n2 - Funcionário\n3 - Administrador\n4 - Sair");
            int escolha = ler.nextInt();
            ler.nextLine();

            if (escolha == 1) {
                Cliente cliente = new Cliente("", "", 0, "", "");
                cliente.fazerLogin();
                menu.menuGeralUser(listaPet, listaAdocao, carrinho, cliente, petEscolhido, listaAdocao);
            } else if (escolha == 2) {
                Funcionario funcionario = new Funcionario("", "", 0, "", "");
                funcionario.fazerLogin();
                menu.menuGeralFuncAdmin(listaOng, listaPet, listaVacina, "Funcionário", listaAdocao);
            } else if (escolha == 3) {
                Admin admin = new Admin("", "", 0, "", "");
                admin.fazerLogin();
                menu.menuGeralFuncAdmin(listaOng, listaPet, listaVacina, "Administrador", listaAdocao);
            } else if (escolha == 4) {
                System.out.println("\nEncerrando o sistema...");
                System.exit(500);
            } else {
                System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
    }

}
