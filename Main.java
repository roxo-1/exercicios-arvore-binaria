import java.util.Random;

public class Main{
    public static void main(String[] args){
        No p = new No(50);
        p.esq(40);
        p.dir(60);
        p.esq.esq(35);
        p.esq.dir(45);
        p.dir.esq(55);
        p.dir.dir(65);
        System.out.println(altura((60));
        int nivel = 0;
        nivelNo(65, nivel);
        mostraArvore(No p, String espaco);
    }
}