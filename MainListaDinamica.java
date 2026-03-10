package estruturaDeDados;

public class Main {
    public static void main(String[] args) {

        ListaDinamica lista = new ListaDinamica();

        // Adicionar elementos
        lista.adicionarElemento("A");
        lista.adicionarElemento("B");
        lista.adicionarElemento("C");

        System.out.println("Lista inicial:");
        lista.exibir();

        // Inserir em índice
        lista.inserir(1, "X");
        System.out.println("Após inserir X no índice 1:");
        lista.exibir();

        // Remover por elemento
        lista.removerElemento("B");
        System.out.println("Após remover B:");
        lista.exibir();

        // Adicionar vários
        String[] novos = {"D", "E", "F"};
        lista.adicionarVarios(novos);

        System.out.println("Após adicionar vários:");
        lista.exibir();

        // Obter elemento
        System.out.println("Elemento no índice 2: " + lista.obter(2));

        // Contar elementos
        System.out.println("Total de elementos: " + lista.contar());

        // Substituir
        lista.substituir("A", "Z");
        System.out.println("Após substituir A por Z:");
        lista.exibir();

        // Contar ocorrências
        System.out.println("Ocorrências de Z: " + lista.contarOcorrencias("Z"));

        // Último índice
        System.out.println("Último índice de Z: " + lista.ultimoIndiceDe("Z"));

        // Remover por índice
        lista.removerPorIndice(0);
        System.out.println("Após remover índice 0:");
        lista.exibir();

        // Limpar lista
        lista.limpar();
        System.out.println("Após limpar a lista:");
        lista.exibir();
    }
}
