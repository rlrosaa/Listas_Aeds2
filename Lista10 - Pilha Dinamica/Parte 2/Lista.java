public class Lista {
        private Celula prim,ult;
        private int tam;
    
        public Lista(){
            prim= new Celula();
            ult = prim;
            tam = 0;
        }
    
        public void inserirInicio(int x){
            Celula tmp = new Celula(x);
            tmp.prox = prim.prox;
            tmp.ant = prim;
            prim.prox = tmp;
            if(ult==prim){
                ult = tmp;
            }
            tmp = null;
            tam++;
        }
    
        public void inserirFinal(int x){
            ult.prox = new Celula(x);
            Celula tmp = ult;
            ult = ult.prox;
            ult.ant = tmp;
            tmp = null;
            tam++;
        }
    
        public Celula removerInicio(){
            Celula auxElemento = null;
            if(!verificaVazio()){
                auxElemento = prim.prox;
                Celula tmp = prim.prox;
                prim.prox = prim.prox.prox;
                prim.prox.ant = prim;
                tmp.prox = null;
                tmp = null;
    
                if (prim.prox == null){
                    ult=prim;
                }
                tam--;
            }
            return auxElemento;
        }
    
        public Celula removerFinal(){
            Celula auxElemento = null;
            if(!verificaVazio()){
                auxElemento = ult;
                ult=ult.ant;
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
    
        public int tamanhoLista(){
            return tam;
        }
    
        public boolean verificaVazio(){
            if (prim.prox == null){     
                System.out.println("Lista vazia, favor verificar.");
                return true;
            }
            else{
                return false;
            }
        }
    
    
    }
