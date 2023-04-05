public class SelectionSort {
    private String[] vetOrdenado;

    public SelectionSort(){

    }

    public SelectionSort (String[] vet){
        ordenaVet(vet);
    }

    private void ordenaVet (String[] vet){
        
        int menor;
        String aux;

        for(int i= 0; i<vet.length-1;i++){
            menor = i;
            for(int j = (i+1);j<vet.length;j++){
                if(vet[j].toUpperCase().compareTo(vet[menor].toUpperCase())<0){
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

    public String[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
