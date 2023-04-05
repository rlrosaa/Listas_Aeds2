public class SelectionSort {
    private int[] vetOrdenado;

    public SelectionSort(){

    }

    public SelectionSort (int [] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (int[] vet){
        
        int menor;
        int aux;

        for(int i= 0; i<vet.length-1;i++){
            menor = i;
            for(int j = (i+1);j<vet.length;j++){
                if(vet[j]<vet[menor]){
                    menor = j;
                }
            }

            if(menor != i){
                aux = vet[i];
                vet[i] = vet[menor];
                vet[menor] = aux;
            }
        }
        
        vetOrdenado= vet;

    }

    public int[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
