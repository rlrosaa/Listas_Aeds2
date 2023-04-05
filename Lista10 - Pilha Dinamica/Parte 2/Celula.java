public class Celula{
    public int elemento;
    public Celula ant,prox;

    public Celula(){
        this(0);
    }
    public Celula(int x){
        elemento = x;
        this.ant = null;
        this.prox = null;
    }

}