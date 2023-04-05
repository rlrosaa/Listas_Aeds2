public class BubleSort {
    private int[] vetOrdenado;

    public BubleSort(){

    }

    public BubleSort (int[] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (int[] vet){
        int aux;
        for (int i = 0; i< vet.length-1;i++){
            for (int j = vet.length -1 ; j>i;j--){
                if (vet[j]<vet[j-1]){
                    aux = vet[j];
                    vet[j] = vet[j-1];
                    vet[j-1] = aux;
                }
            }
        }
        
        vetOrdenado= vet;

    }

    public int[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
