public class No{
    int chave;
    int nivel;
    No esq, dir;
     // Construtor padrão
    public No() {}

    // Construtor com argumentos, se necessário
    public No(int chave) {
        this.chave = chave;
        this.esq = null;
        this.dir = null;
    }
}