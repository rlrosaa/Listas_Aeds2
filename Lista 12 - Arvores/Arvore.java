public class Arvore {

    No noRaiz;

    public Arvore (){
        noRaiz = null;   
    }

    public void inserirNo(No no){
        this.noRaiz = inserir(no,noRaiz);
    }

    private No inserir(No no, No proxNo) {
        
        if (proxNo == null){
           proxNo = no; 
        }
        else if (no.nome.compareTo(proxNo.nome)<=0){
            proxNo.noEsq = inserir(no, proxNo.noEsq);
        }
        else{
            proxNo.noDir = inserir(no, proxNo.noDir);

        }
        
        return proxNo;
    }

    public String noPesquisar (String nome){        
       String telefone = pesquisar(nome, noRaiz);
        return telefone;
    }

    private String pesquisar(String nome, No proxNo) {
        String resp = "";

        if(proxNo == null){
        
        }
        else if (proxNo.nome.equals(nome)){
            resp = proxNo.telefone;
        }
        else if (nome.compareTo(proxNo.nome)<0){
            resp = pesquisar(nome, proxNo.noEsq);
        }
        else if (nome.compareTo(proxNo.nome)>0){
            resp = pesquisar(nome, proxNo.noDir);
        }

        return resp;
    }

    public void ordenar(){
        caminharCentral(noRaiz);
    }

    private void caminharCentral(No proxNo) {
        if (proxNo!=null){
            caminharCentral(proxNo.noEsq);
            System.out.println(proxNo.nome);
            caminharCentral(proxNo.noDir);
        }
    }

    public No getRaiz(){
        return this.noRaiz;
    }

    
}
