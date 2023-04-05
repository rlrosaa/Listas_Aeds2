public class MergeSort {
    private int[] vetOrdenado;

    public MergeSort(){

    }

    public MergeSort (int [] vet){
        ordenaVet(vet,0,vet.length -1);
    }

    private void ordenaVet (int[] vet,int dir,int esq){
        
        if (esq < dir){
            int meio = (esq + dir) / 2;
            ordenaVet(vet,esq, meio);
            ordenaVet(vet,meio + 1, dir);
            vet = intercalar(vet, esq, meio, dir);
            }
        
        vetOrdenado= vet;

    }

    private int[] intercalar(int [] vet, int esq, int meio, int dir) {

        //Definir tamanho dos dois subarrays
        int nEsq = (meio+1)-esq;
        int nDir = dir - meio;
        int[] arrayEsq = new int[nEsq+1];
        int[] arrayDir = new int[nDir+1];

        //Sentinela no final dos dois arrays
        arrayEsq[nEsq] = arrayDir[nDir] = 0x7FFFFFFF;

        int iEsq, iDir, i;
        //Inicializar primeiro subarray
        for (iEsq = 0; iEsq < nEsq; iEsq++){
            arrayEsq[iEsq] = vet[esq+iEsq];
        }

        //Inicializar segundo subarray
        for (iDir = 0; iDir < nDir; iDir++){
            arrayDir[iDir] = vet[(meio+1)+iDir];
        }
   

        //Intercalacao propriamente dita
        for (iEsq = iDir = 0, i = esq; i <= dir; i++){
            if(arrayEsq[iEsq] <= arrayDir[iDir]){
                vet[i] = arrayEsq[iEsq++];
            }
            else{
                vet[i] = arrayDir[iDir++];
            }
        }

        return vet;

    }

    public int[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
