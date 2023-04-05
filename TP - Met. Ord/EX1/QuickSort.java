public class QuickSort {
    private String[] vetOrdenado;

    public QuickSort(){

    }

    public QuickSort (String[] vet){
        ordenaVet(vet, 0, vet.length -1);
    }

    private void ordenaVet (String[] vet,int esq,int dir){
        int i= esq, j=dir;
        String pivo = vet[(esq+dir)/2],aux;

        while (i<=j){
            while (vet[i].toUpperCase().compareTo(pivo.toUpperCase())<0){
                i++;
            }
            while (vet[j].toUpperCase().compareTo(pivo.toUpperCase())>0){
                j--;
            }
            if (i<=j){
                aux = vet[i];
                vet[i]= vet[j];
                vet[j] = aux;
                i++;
                j--;
            }

            if(esq<j){
                ordenaVet(vet, esq, j);
            }
            if (i<dir){
                ordenaVet(vet, i, dir);
            }
        }
        
        
        vetOrdenado= vet;

    }

    public String[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
