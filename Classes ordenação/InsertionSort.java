public class InsertionSort {
    private double[] vetOrdenado;

    public InsertionSort(){

    }

    public InsertionSort (double [] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (double[] vet){
        double tmp;

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

    public double[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
