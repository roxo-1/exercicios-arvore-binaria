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

    public static int nivelNo(No p){
        //Função que retorna o nível de cada nó da árvore
        if(p==null){ // se nulo
            return -1;
        }else if(p==raiz){ //se p igual a raiz, nivel é 1
            return 0;
        }else{//caso contrário
            //
        }
    }
}