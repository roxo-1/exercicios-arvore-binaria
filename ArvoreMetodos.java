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

    int altura(No p){
        if(p==null){
            return -1;
        }else{
            int he = altura(p.esquerda);
            int hq = altura(p.direita);
            if(he>hd){
                return he+1;
            }
            else{
                return hd+1;
            }
        }
    }
    public void inserir(int valor){// inserção iterativa
        if(raiz == null){
            raiz = new No(valor);
        }else{
            No p, ant;
            p = raiz; ant = raiz;
            while (p!=null){
                ant = p;
                if(valor<chave){
                    p=p.esquerda;
                }else if(valor > chave){
                    p=p.direita
                }else{
                    System.out.println("O valor já existe");
                    return;
                }
            }
            if(valor < ant.chave){
                ant.esquerda=novoNo(valor);
            } else{
                ant.direita=novoNo(valor);
            }
        }
    }
    //Complexidade é O(h), onde h é a altura da árvore.

    public int conta_elementos(No p){
        if(p==null){
            return 0;
        }
        else{
            return conta_elementos(p.esq)+conta_elementos(p.dir)+1;
        }
    }

    public void mostra_pares(No p){
        if(p==null){
            return;
        }
        else{
            if(p.chave%2==0){
                System.out.println(p.chave);
            }
            mostra_pares(p.esq);
            mostra_pares(p.dir);
        }
    }

    public boolean saoIguais(No p, No q){
        if(p==null && q==null){
            return True;
        }
        if(p==null || q==null{
            return False;
        }
        if(p.chave!=q.chave){
            return False;
        }
        return saoIguais(p.esq, q.esq) & saoIguais(p.dir, q.dir);
    }

    public boolean ehEstritamenteBinaria(No p){//exatamente dois filhos
        if(p==null){
            return True;
        }
        if(p.esq==null&&p.dir==null){
            return True;
        }
        if(p.esq==null||p.dir==null){
            return False;
        }
        return ehEstritamenteBinaria(p.esq) & ehEstritamenteBinaria(p.dir);
    }

    // número total de nós 
    private int totalNos(No p){
        if(p==null){
            return 0;
        }
        else{
            return totalNos(p.esq)+totalNos(p.dir)+1;
        }
    }
    // número de folhas
    private int contaFolhas(No p){
        if(p==null){
            return 0;
        }
        if(p.esq == null && p.dir == null){
            return 1;
        }
        else{
            return contaFolhas(p.esq) + contaFolhas(p.dir);
        }
    }
// número de nós internos
    private int contaInternos(No p){
        if(p==null){
            return 0;
        }
        if(p.esq == null && p.dir == null){
            return 0;
        }
        if(p!=raiz){
            return contaInternos(p.esq) + contaInternos(p.dir)+1;
        }
        return contaInternos(p.esq) + contaInternos(p.dir)
    }
    public Arvore clone(){
	Arvore novaArvore = new Arvore();
	cloneArvore(raiz,novaArvore);
	return novaArvore;
}

    private void clonaArvore(No p, Arvore novaArvore){
        if(p!=null){
            novaArvore.insere(p.chave);
            cloneArvore(p.esq,novaArvore);
            cloneArvore(p.dir,novaArvore);
        }
    }
    public Arvore clone(){
        Arvore novaArvore = new Arvore();
        cloneArvore(raiz,novaArvore);
        return novaArvore;
    }

    private void clonaArvore(No p, Arvore novaArvore){
        if(p!=null){
            novaArvore.insere(p.chave);
            cloneArvore(p.esq,novaArvore);
            cloneArvore(p.dir,novaArvore);
        }
    }
    private boolean ehBST(No p, int min, int max){
        if(p==null){
            return True;
        }
        if(p.chave<p.esq.chave){
            return False;
        }
        if(p.chave>p.dir.chave){
            return False;
        }
        if(!ehBST(p.esq, min, p.chave)){
            return False;
        }
        if(!ehBST(p.dir, p.chave, max)){
            return False;
        }
        return True;
    }
}