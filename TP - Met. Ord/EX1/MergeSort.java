public class MergeSort {
    private String[] vetOrdenado;

    public MergeSort(){

    }

    public MergeSort (String[] vet){
        ordenaVet(vet,0,vet.length -1);
    }

    private void ordenaVet (String[] vet,int dir,int esq){
        
        if (esq < dir){
            int meio = (esq + dir) / 2;
            ordenaVet(vet,esq, meio);
            ordenaVet(vet,meio + 1, dir);
            vet = intercalar(vet, esq, meio, dir);
            }
        
        vetOrdenado= vet;

    }

    private String[] intercalar(String[] vet, int esq, int meio, int dir) {

        //Definir tamanho dos dois subarrays
        int nEsq = (meio+1)-esq;
        int nDir = dir - meio;
        String[] arrayEsq = new String[nEsq+1];
        String[] arrayDir = new String[nDir+1];

        //Sentinela no final dos dois arrays
        arrayEsq[nEsq] = arrayDir[nDir] = null;

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
            if(arrayEsq[iEsq].toUpperCase().compareTo(arrayDir[iDir].toUpperCase())<=0) {
                vet[i] = arrayEsq[iEsq++];
            }
            else{
                vet[i] = arrayDir[iDir++];
            }
        }

        return vet;

    }

    public String[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
