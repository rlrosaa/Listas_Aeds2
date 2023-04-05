public class teste {

    public static void main(String[] args) {
        
        int[] vet = {1000,20,5,2,11,0,3};

        MergeSort qvt = new MergeSort(vet);
        int[] vetAux =  qvt.getVetOrdenado();
        for (int i = 0; i< vetAux.length ; i++){
            System.out.println(vetAux[i]);
        }

    }
    
}
