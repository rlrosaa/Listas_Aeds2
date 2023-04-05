public class No {
    String nome,telefone;
    No noDir,noEsq;

    public No (){
        this("","");
    }
    public No (String nome,String telefone){
        this.nome = nome;
        this.telefone = telefone;
        noDir = noEsq = null;
    }   
}