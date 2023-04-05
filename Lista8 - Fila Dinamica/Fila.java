public class Fila {
    private Celula prim,ult;
    private int tam;

    public Fila(){
        prim= new Celula();
        ult = prim;
        tam = 0;
    }

    public void enfileirar(int x){
        ult.prox = new Celula(x);
        ult = ult.prox;
        tam++;
    }

    public int desenfileirar(){
        int auxElemento = 0;
        if(!verificaVazio()){
            auxElemento = prim.prox.elemento;
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
    public void mostrar(){
        if(!verificaVazio()){
            Celula aux=prim;
            do{
                aux=aux.prox;
                System.out.println(aux.elemento);
            }while(aux.prox !=null);
        }
    }

    public int tamanhoFila(){
        return tam;
    }

    private boolean verificaVazio(){
        if (prim.prox == null){     
            System.out.println("Fila vazia, favor verificar.");
            return true;
        }
        else{
            return false;
        }
    }

}
