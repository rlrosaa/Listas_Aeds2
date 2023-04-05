public class HeapSort {
    private String[] vetOrdenado;

    public HeapSort(){

    }

    public HeapSort (String[] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (String[] vet){
        //Construção Heap
        for (int tam = 2; tam<= vet.length; tam++){
            vet = construir(tam,vet);
        }

        vetOrdenado = vet;
    }
    
    private String[] construir(int tam, String[] vet) {
        String aux;
        for( int i = tam; i> 1 && vet[i-1].toUpperCase().compareTo(vet[(i/2)-1].toUpperCase())<0;i/=2){
            aux = vet[i-1];
            vet[i-1]= vet[(i/2)-1];
            vet[(i/2)-1] = aux;
        }
        return vet;

    }

    public String[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
