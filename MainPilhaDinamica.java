package estruturaDeDados;

public class MainPilhaDinamica {

    public static void main(String[] args) {

        PilhaDinamica pilha = new PilhaDinamica();

        pilha.empilhar("X");
        pilha.empilhar("Y");
        pilha.empilhar("Z");

        System.out.println("Pilha:");
        pilha.exibirPilha();

        pilha.desempilhar();

        System.out.println("Pilha após desempilhar:");
        pilha.exibirPilha();
    }
}
