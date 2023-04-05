public class InsertionSort {
    private int[] vetOrdenado;

    public InsertionSort(){

    }

    public InsertionSort (int[] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (int[] vet){
        int tmp;

        for (int i = 1;i<vet.length;i++){
            tmp = vet[i];
            int j = i-1;

            while (j>=0 && vet[j]>tmp){
                vet[j+1] = vet[j];
                j--;
            }   

            vet[j+1] = tmp;

        }
        
        
        vetOrdenado= vet;

    }

    public int[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
