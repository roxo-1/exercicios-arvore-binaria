public class Arvore extends No{
    No raiz; // fazer o nó depois
    public Arvore () { raiz = null; }
    public static int altura(No p){
        //Função que retorna a altura da árvore recursivamente
        if(p==null){
		    return -1;
        }else{
            int he = altura(p.esquerda);
            int hq = altura(p.direita);
            if(he>hd){
                return he++;
            }
            else{
                return hd++;
            }
        }
	}

    public static int nivelNo(No p, int nivel){
        //Função que retorna o nível de cada nó da árvore
        if(p==null){ // se nulo, não retorna nada
            return;
        }else{
            System.out.println(nivelNo(p.esq, "  ", nivel+1));
            System.out.print("  " + p.chave);
            System.out.println(nivelNo(p.dir, " ", nivel+1));
        }
    }

    public static int mostraArvore(No p, String espaco){
        if(p!=null){
            mostraArvore(p.esq, espaco + "  ");
            System.out.println(espaco, + p.chave);
            mostraArvore(p.dir, espaco+"  ");
        }
    }
}