public class ListaDinamica implements ListaOperacoes {

    private class No {
        String valor;
        No proximo;

        No(String valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private int tamanho;

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public boolean adicionarElemento(String elemento) {
        No novo = new No(elemento);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
        return true;
    }

    public boolean removerElemento(String elemento) {
        int indice = 0;
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(elemento)) {
                removerPorIndice(indice);
                return true;
            }
            atual = atual.proximo;
            indice++;
        }
        return false;
    }

    @Override
    public int removerTodas(String elemento) {
        int removidos = 0;
        while (removerElemento(elemento)) {
            removidos++;
        }
        return removidos;
    }

    @Override
    public int contar() {
        return tamanho;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        int count = 0;
        for (String e : elementos) {
            adicionarElemento(e);
            count++;
        }
        return count;
    }

    @Override
    public String obter(int indice) {
        if (indice < 0 || indice >= tamanho) return null;

        No atual = inicio;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        if (indice < 0 || indice > tamanho) return false;

        No novo = new No(elemento);

        if (indice == 0) {
            novo.proximo = inicio;
            inicio = novo;
        } else {
            No atual = inicio;
            for (int i = 0; i < indice - 1; i++) {
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }

        tamanho++;
        return true;
    }

    @Override
    public String removerPorIndice(int indice) {
        if (indice < 0 || indice >= tamanho) return null;

        No removido;

        if (indice == 0) {
            removido = inicio;
            inicio = inicio.proximo;
        } else {
            No atual = inicio;
            for (int i = 0; i < indice - 1; i++) {
                atual = atual.proximo;
            }
            removido = atual.proximo;
            atual.proximo = removido.proximo;
        }

        tamanho--;
        return removido.valor;
    }

    @Override
    public void limpar() {
        inicio = null;
        tamanho = 0;
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        int indice = 0;
        int ultimo = -1;
        No atual = inicio;

        while (atual != null) {
            if (atual.valor.equals(elemento)) {
                ultimo = indice;
            }
            atual = atual.proximo;
            indice++;
        }

        return ultimo;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int count = 0;
        No atual = inicio;

        while (atual != null) {
            if (atual.valor.equals(elemento)) {
                count++;
            }
            atual = atual.proximo;
        }

        return count;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int count = 0;
        No atual = inicio;

        while (atual != null) {
            if (atual.valor.equals(antigo)) {
                atual.valor = novo;
                count++;
            }
            atual = atual.proximo;
        }

        return count;
    }
}

