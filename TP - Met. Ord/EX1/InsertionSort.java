public class InsertionSort {
    private String[] vetOrdenado;

    public InsertionSort(){

    }

    public InsertionSort (String[] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (String[] vet){
        String tmp;

        for (int i = 1;i<vet.length;i++){
            tmp = vet[i];
            int j = i-1;

            while (j>=0 && vet[j].toUpperCase().compareTo(tmp.toUpperCase())>0){
                vet[j+1] = vet[j];
                j--;
            }   

            vet[j+1] = tmp;

        }
        
        
        vetOrdenado= vet;

    }

    public String[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
