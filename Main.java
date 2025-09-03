public class Main{
    public static void main(String[] args){
        No raiz = new No(50);
        raiz.esq = new No(40);
        raiz.dir = new No(60);
        raiz.esq.esq = new No(35);
        raiz.esq.dir = new No(45);
        raiz.dir.esq = new No(55);
        raiz.dir.dir = new No(65);
        System.out.println("Altura da árvore: " + ArvoreMetodos.altura(raiz));
        System.out.println("\nNíveis dos nós:");
        ArvoreMetodos.nivelNo(raiz, 0);
        System.out.println("\nRepresentação da árvore:");
        String espaco = " ";
        ArvoreMetodos.mostraArvore(raiz, espaco);
    }
}