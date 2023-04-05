public class Pilha {
    private Celula prim,ult;
    private int tam;

    public Pilha(){
        prim= new Celula();
        ult = prim;
        tam = 0;
    }

    public void inserir(String nome,int x){
        Celula tmp = new Celula(nome,x);
        tmp.prox = prim.prox;
        prim.prox = tmp;
        if(ult==prim){
            ult = tmp;
        }
        tmp = null;
        tam++;
    }

    public Celula remover(){
        Celula auxElemento = null;
        if(!verificaVazio()){
            auxElemento = prim.prox;
            Celula tmp = prim.prox;
            prim.prox = prim.prox.prox;
            tmp.prox = null;
            tmp = null;

            if (prim.prox == null){
                ult=prim;
            }
            tam--;
        }
        return auxElemento;
    }

    public void mostrarNomes(){
        if(!verificaVazio()){
            Celula aux=prim;
            do{
                aux=aux.prox;
                System.out.println(aux.nome);
            }while(aux.prox !=null);
        }
    }

    public void mostrarIdade(){
        if(!verificaVazio()){
            Celula aux=prim;
            do{
                aux=aux.prox;
                System.out.println(aux.idade);
            }while(aux.prox !=null);
        }
    }

    public int tamanhoPilha(){
        return tam;
    }

    public boolean verificaVazio(){
        if (prim.prox == null){     
            System.out.println("Pilha vazia, favor verificar.");
            return true;
        }
        else{
            return false;
        }
    }

    public double media1(){
        double media=0,soma=0,i=0;
        if(!verificaVazio()){
            Celula aux=prim;
            do{
                aux=aux.prox;
                soma += aux.idade;
                i++;
            }while(aux.prox !=null);

            media = soma/i;
            
        }
        return media;
    }

    public double media2(){
        if(!verificaVazio()){
            return mediaRec(0,0,prim);
        }
        else{
            return 0;
        }
    }

    private double mediaRec(double soma,double i, Celula aux){
        double media;
        if (aux.prox == null){
            return (soma/i);
        }
        else{
            soma+=aux.prox.idade;
            i++;
            media = mediaRec(soma, i, aux.prox);
            return media;
        }

    }

}


