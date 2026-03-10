package estruturaDeDados;

public class PilhaDinamica {

    private No inicio;

    public PilhaDinamica() {
        inicio = new No(null);
    }

    public void empilhar(String conteudo) {

        if (estaVazio()) {
            inicio.setConteudo(conteudo);
            System.out.println("Elemento " + conteudo + " adicionado com sucesso.");
            return;
        }

        No atual = inicio;

        while (atual.getProx() != null) {
            atual = atual.getProx();
        }

        atual.setProx(new No(conteudo));
        System.out.println("Elemento " + conteudo + " adicionado com sucesso.");
    }

    public void desempilhar() {

        if (estaVazio()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        if (inicio.getProx() == null) {
            System.out.println("Elemento " + inicio.getConteudo() + " removido com sucesso.");
            inicio.setConteudo(null);
            return;
        }

        No atual = inicio;

        while (atual.getProx().getProx() != null) {
            atual = atual.getProx();
        }

        System.out.println("Elemento " + atual.getProx().getConteudo() + " removido com sucesso.");
        atual.setProx(null);
    }

    public void exibirPilha() {

        if (estaVazio()) {
            System.out.println("Não existem elementos na pilha.");
            return;
        }

        No atual = inicio;

        while (atual != null) {
            System.out.println(atual.getConteudo());
            atual = atual.getProx();
        }
    }

    public boolean estaVazio() {
        return inicio.getConteudo() == null;
    }
}
