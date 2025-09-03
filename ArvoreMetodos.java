public class ArvoreMetodos extends No{
    No raiz; // fazer o nó depois
    public ArvoreMetodos() { raiz = null; }
    public static int altura(No p){
        //Função que retorna a altura da árvore recursivamente
        if(p==null){
		    return -1;
        }else{
            int he = altura(p.esq);
            int hd = altura(p.dir);
            if(he>hd){
                return he+1;
            }
            else{
                return hd+1;
            }
        }
	}

    public static void nivelNo(No p, int nivel){
        //Função que retorna o nível de cada nó da árvore
        if(p!=null){
            nivelNo(p.esq, nivel+1);
            System.out.print("  " + p.chave + ": " +nivel + "\n");
            nivelNo(p.dir, nivel+1);
        }
    }

    public static void mostraArvore(No p, String espaco){
        if(p!=null){
            mostraArvore(p.dir, espaco + "  ");
            System.out.println(espaco + "-->" + p.chave);
            mostraArvore(p.esq, espaco + "  ");
        }
    }
}