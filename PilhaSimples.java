package estruturaDeDados;

public class PilhaSimples {

    private String[] pilha;

    public PilhaSimples(int tamanho) {
        pilha = new String[tamanho];
    }

    public void empilhar(String elemento) {

        if (estaCheia()) {
            System.out.println("A pilha está cheia.");
            return;
        }

        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == null) {
                pilha[i] = elemento;
                System.out.println("Elemento " + elemento + " adicionado com sucesso.");
                break;
            }
        }
    }

    public void desempilhar() {

        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        for (int i = pilha.length - 1; i >= 0; i--) {
            if (pilha[i] != null) {
                System.out.println("Elemento " + pilha[i] + " removido com sucesso.");
                pilha[i] = null;
                break;
            }
        }
    }

    public void exibirPilha() {
        for (String elemento : pilha) {
            System.out.println(elemento);
        }
    }

    private boolean estaCheia() {

        for (String elemento : pilha) {
            if (elemento == null) {
                return false;
            }
        }

        return true;
    }

    private boolean estaVazia() {
        return pilha[0] == null;
    }
}
