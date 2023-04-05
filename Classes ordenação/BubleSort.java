public class BubleSort {
    private double[] vetOrdenado;

    public BubleSort(){

    }

    public BubleSort (double [] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (double[] vet){
        double aux;
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

    public double[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
