/**
 * Interface que define operações avançadas para manipulação
 * de estruturas de lista baseadas em String.
 *
 * As implementações podem ser feitas utilizando vetor fixo
 * (lista simples) ou lista encadeada (lista dinâmica),
 * respeitando o mesmo contrato de métodos.
 */
public interface ListaOperacoes {

    int removerTodas(String elemento);

    int contar();

    int adicionarVarios(String[] elementos);

    String obter(int indice);

    boolean inserir(int indice, String elemento);

    String removerPorIndice(int indice);

    void limpar();

    int ultimoIndiceDe(String elemento);

    int contarOcorrencias(String elemento);

    int substituir(String antigo, String novo);
}


