package estruturaDeDados;

public class MainPilhaSimples {

    public static void main(String[] args) {

        PilhaSimples pilha = new PilhaSimples(5);

        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");

        System.out.println("Pilha:");
        pilha.exibirPilha();

        pilha.desempilhar();

        System.out.println("Pilha após desempilhar:");
        pilha.exibirPilha();
    }
}
