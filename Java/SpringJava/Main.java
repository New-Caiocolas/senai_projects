import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instaciamento dos objetos
        Scanner sc = new Scanner(System.in);
        GerenciadorDeContatos agenda = new GerenciadorDeContatos();
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar bug do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Contato novoContato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(novoContato);
                    break;

                case 2:
                    agenda.listarContatos();
                    break;

                case 3:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = sc.nextLine();
                    Contato encontrado = agenda.buscarContato(nomeBusca);
                    if (encontrado != null) {
                        System.out.println("Contato encontrado: " + encontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemover = sc.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
