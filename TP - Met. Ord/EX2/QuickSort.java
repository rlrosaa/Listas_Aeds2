public class QuickSort {
    private int[] vetOrdenado;

    public QuickSort(){

    }

    public QuickSort (int [] vet){
        ordenaVet(vet, 0, vet.length -1);
    }

    private void ordenaVet (int[] vet,int esq,int dir){
        int i= esq, j=dir;
        int pivo = vet[(esq+dir)/2],aux;

        while (i<=j){
            while (vet[i] <pivo){
                i++;
            }
            while (vet[j] > pivo){
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

    public int[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
