public class HeapSort {
    private int[] vetOrdenado;

    public HeapSort(){

    }

    public HeapSort (int[] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (int[] vet){
        //Construção Heap
        for (int tam = 2; tam<= vet.length; tam++){
            vet = construir(tam,vet);
        }

        vetOrdenado = vet;
    }
    
    private int[] construir(int tam, int[] vet) {
        int aux;
        for( int i = tam; i> 1 && vet[i-1]< vet[(i/2)-1];i/=2){
            aux = vet[i-1];
            vet[i-1]= vet[(i/2)-1];
            vet[(i/2)-1] = aux;
        }
        return vet;

    }

    public int[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
