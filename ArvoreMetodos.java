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
    //recursivo
    public void preOrdemR(No p){
        if (p != null){
            visita(p);
            preOrdem(p.esq);
            preOrdem(p.dir);
        }
    }
    //iterativo
    private void preOrdemI(No p){
        Stack<No> pilha = new Stack<>();
        while(p!=null && !pilha.isEmpty(){
            if(p!=null){
                System.out.println(p.chave);
                pilha.push(p);
                p=p.esq;
            }else{
                p=(No)pilha.pop();
                p=p.dir
            }
        }
    }
    //recursivo
    private void inOrdemR(No p){
        if(p!=null){
            inOrdem(p.esq);
            System.out.println(p.chave);
            inOrdem(p.dir);
        }
    }
    //iterativo
    private void inOrdemI(No p){
        Stack<No> pilha = new Stack<>();
        while(p!=null && !pilha.isEmpty()){
            if(p!=null){
                System.out.println(p.esq.chave);
                System.out.println(p.chave);
                pilha.push(p);
                p=p.esq;
            }else{
                p=(No)pilha.pop();
                p=p.dir
            }
        }
    }
    //recursivo
    private void posOrdemR(No p){
        posOrdemR(p.esq);
        posOrdemR(p.dir);
        System.out.println(p.chave);
        
    }
    private No busca(No p, int chave){
        if (p != null){
            if (chave < p.chave){
                p = busca(p.esq, chave);
            }
            else if (chave > p.chave){
                p = busca(p.dir, chave);
            }
            return p;
    }
    //Complexidade no pior caso: O(h), onde h é a altura da árvore
}