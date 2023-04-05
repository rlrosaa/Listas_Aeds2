public class MergeSort {
    private double[] vetOrdenado;

    public MergeSort(){

    }

    public MergeSort (double [] vet){
        ordenaVet(vet,0,vet.length -1);
    }

    private void ordenaVet (double[] vet,int dir,int esq){
        
        if (esq < dir){
            int meio = (esq + dir) / 2;
            ordenaVet(vet,esq, meio);
            ordenaVet(vet,meio + 1, dir);
            vet = intercalar(vet, esq, meio, dir);
            }
        
        vetOrdenado= vet;

    }

    private double[] intercalar(double [] vet, int esq, int meio, int dir) {

        //Definir tamanho dos dois subarrays
        int nEsq = (meio+1)-esq;
        int nDir = dir - meio;
        double[] arrayEsq = new double[nEsq+1];
        double[] arrayDir = new double[nDir+1];

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

    public double[] getVetOrdenado(){
        return vetOrdenado;
    }
    
}
