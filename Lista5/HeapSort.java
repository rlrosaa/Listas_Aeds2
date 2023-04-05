public class HeapSort {
    private double[] vetOrdenado;

    public HeapSort(){

    }

    public HeapSort (double [] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (double[] vet){
        //Construção Heap
        for (int tam = 2; tam<= vet.length; tam++){
            vet = construir(tam,vet);
        }

        vetOrdenado = vet;
    }
    
    private double[] construir(int tam, double[] vet) {
        double aux;
        for( int i = tam; i> 1 && vet[i-1]< vet[(i/2)-1];i/=2){
            aux = vet[i-1];
            vet[i-1]= vet[(i/2)-1];
            vet[(i/2)-1] = aux;
        }
        return vet;

    }

    public double[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
