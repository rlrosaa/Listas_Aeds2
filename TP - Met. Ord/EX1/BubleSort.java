public class BubleSort {
    private String[] vetOrdenado;

    public BubleSort(){

    }

    public BubleSort (String [] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (String[] vet){
        String aux;
        for (int i = 0; i< vet.length-1;i++){
            for (int j = vet.length -1 ; j>i;j--){
                if (vet[j].toUpperCase().compareTo(vet[j-1].toUpperCase())<0){
                    aux = vet[j];
                    vet[j] = vet[j-1];
                    vet[j-1] = aux;
                }
            }
        }
        
        vetOrdenado= vet;

    }

    public String[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
