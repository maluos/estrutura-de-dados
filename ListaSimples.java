public class ListaSimples implements ListaOperacoes {

    private String[] elementos;
    private int tamanho;

    public ListaSimples(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public boolean adicionarElemento(String elemento) {
        if (tamanho >= elementos.length) return false;
        elementos[tamanho++] = elemento;
        return true;
    }

    public boolean removerElemento(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                removerPorIndice(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removerTodas(String elemento) {
        int removidos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                removerPorIndice(i);
                i--;
                removidos++;
            }
        }
        return removidos;
    }

    @Override
    public int contar() {
        return tamanho;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        int adicionados = 0;
        for (String e : elementos) {
            if (tamanho < this.elementos.length) {
                this.elementos[tamanho++] = e;
                adicionados++;
            } else {
                break;
            }
        }
        return adicionados;
    }

    @Override
    public String obter(int indice) {
        if (indice < 0 || indice >= tamanho) return null;
        return elementos[indice];
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        if (indice < 0 || indice > tamanho || tamanho >= elementos.length)
            return false;

        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[indice] = elemento;
        tamanho++;
        return true;
    }

    @Override
    public String removerPorIndice(int indice) {
        if (indice < 0 || indice >= tamanho) return null;

        String removido = elementos[indice];

        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamanho - 1] = null;
        tamanho--;

        return removido;
    }

    @Override
    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int count = 0;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int count = 0;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(antigo)) {
                elementos[i] = novo;
                count++;
            }
        }
        return count;
    }
}

