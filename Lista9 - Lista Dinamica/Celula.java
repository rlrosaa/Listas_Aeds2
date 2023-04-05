public class Celula{
    public String nome;
    public int idade;
    public Celula prox;

    public Celula(){
        this("Desconhecido",0);
    }
    public Celula(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.prox = null;
    }

}