import java.util.ArrayList;

public class GerenciadorDeContatos {
    // Instanciando ArrayList da classe Contato
    ArrayList<Contato> contatos = new ArrayList<>();

     //  Adicionar um novo contato
    public void adicionarContato(Contato c) {
        contatos.add(c);
        System.out.println("Contato adicionado com sucesso!");
    }

     public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contato c : contatos) {
                System.out.println(c); // usa o toString() da classe Contato
            }
        }
    }

     public Contato buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null; // retorna null se não achar
    }

     public void removerContato(String nome) {
        Contato encontrado = buscarContato(nome);
        if (encontrado != null) {
            contatos.remove(encontrado);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

}