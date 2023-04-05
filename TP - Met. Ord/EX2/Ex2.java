import java.util.Random;

public class Ex2{

    public static void criaVet(int[] vetCresc,int[] vetDecre, int[] vetRandom ){
        Random r = new Random();
        for(int i = 0; i < vetCresc.length;i++){
            vetCresc[i] = i;
            vetDecre[i] = vetDecre.length - i;
            vetRandom[i] = (int)(r.nextDouble()*1000);
        }        
    }

    public static void main(String[] args) {
        int tam = 10000;
        int vetCresc[] =  new int [tam];
        int vetDecre[] = new int [tam];
        int vetRandom[] = new int [tam];

        long ti,tf;

       ///////////////////////BubleSort////////////////////////////////////////////////
        // Define Horario de inicio ordenação vetor crescente
        ti = System.currentTimeMillis();

        
            BubleSort qvt1 = new BubleSort(vetCresc);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array crescente por BubleSort %.5f s%n", (tf - ti) / 300d);
        

        // Define Horario de inicio ordenação vetor decrescente
        ti = System.currentTimeMillis();

        
        BubleSort qvt2 = new BubleSort(vetDecre);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array decrescente por BubleSort %.5f s%n", (tf - ti) / 300d);
        
        // Define Horario de inicio ordenação vetor aleatorio
        ti = System.currentTimeMillis();

        
        BubleSort qvt3 = new BubleSort(vetRandom);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array aleatorio por BubleSort %.5f s%n", (tf - ti) / 300d);
        
        ///////////////////////HeapSort////////////////////////////////////////////////
        
        criaVet(vetCresc, vetDecre, vetRandom);
        
        // Define Horario de inicio ordenação vetor crescente
        ti = System.currentTimeMillis();

        
        HeapSort qvt4 = new HeapSort(vetCresc);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array crescente por HeapSort %.5f s%n", (tf - ti) / 300d);
        

        // Define Horario de inicio ordenação vetor decrescente
        ti = System.currentTimeMillis();

        
        HeapSort qvt5 = new HeapSort(vetDecre);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array decrescente por HeapSort %.5f s%n", (tf - ti) / 300d);
        
        // Define Horario de inicio ordenação vetor aleatorio
        ti = System.currentTimeMillis();

        
        HeapSort qvt6 = new HeapSort(vetRandom);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array aleatorio por HeapSort %.5f s%n", (tf - ti) / 300d);
        

        ///////////////////////InsertionSort////////////////////////////////////////////////
        // Define Horario de inicio ordenação vetor crescente

        criaVet(vetCresc, vetDecre, vetRandom);


        ti = System.currentTimeMillis();

        
        InsertionSort qvt7 = new InsertionSort(vetCresc);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array crescente por InsertionSort %.5f s%n", (tf - ti) / 300d);
        

        // Define Horario de inicio ordenação vetor decrescente
        ti = System.currentTimeMillis();

        
        InsertionSort qvt8 = new InsertionSort(vetDecre);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array decrescente por InsertionSort %.5f s%n", (tf - ti) / 300d);
        
        // Define Horario de inicio ordenação vetor aleatorio
        ti = System.currentTimeMillis();

        
        InsertionSort qvt9 = new InsertionSort(vetRandom);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array aleatorio por InsertionSort %.5f s%n", (tf - ti) / 300d);
        
        ///////////////////////MergeSort////////////////////////////////////////////////

        criaVet(vetCresc, vetDecre, vetRandom);

        // Define Horario de inicio ordenação vetor crescente
        ti = System.currentTimeMillis();

        
        MergeSort qvt10 = new MergeSort(vetCresc);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array crescente por MergeSort %.5f s%n", (tf - ti) / 300d);
        

        // Define Horario de inicio ordenação vetor decrescente
        ti = System.currentTimeMillis();

        
        MergeSort qvt11 = new MergeSort(vetDecre);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array decrescente por MergeSort %.5f s%n", (tf - ti) / 300d);
        
        // Define Horario de inicio ordenação vetor aleatorio
        ti = System.currentTimeMillis();

        
        MergeSort qvt12 = new MergeSort(vetRandom);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array aleatorio por MergeSort %.5f s%n", (tf - ti) / 300d);
        
        ///////////////////////QuickSort////////////////////////////////////////////////

        criaVet(vetCresc, vetDecre, vetRandom);


        // Define Horario de inicio ordenação vetor crescente
        ti = System.currentTimeMillis();

        
        QuickSort qvt13 = new QuickSort(vetCresc);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array crescente por QuickSort %.5f s%n", (tf - ti) / 300d);
        

        // Define Horario de inicio ordenação vetor decrescente
        ti = System.currentTimeMillis();

        
        QuickSort qvt14 = new QuickSort(vetDecre);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array decrescente por QuickSort %.5f s%n", (tf - ti) / 300d);
        
        // Define Horario de inicio ordenação vetor aleatorio
        ti = System.currentTimeMillis();

        
        QuickSort qvt15 = new QuickSort(vetRandom);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array aleatorio por QuickSort %.5f s%n", (tf - ti) / 300d);
        
        ///////////////////////SelectionSort////////////////////////////////////////////////

        criaVet(vetCresc, vetDecre, vetRandom);


        // Define Horario de inicio ordenação vetor crescente
        ti = System.currentTimeMillis();

        
        SelectionSort qvt16 = new SelectionSort(vetCresc);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array crescente por SelectionSort %.5f s%n", (tf - ti) / 300d);
        

        // Define Horario de inicio ordenação vetor decrescente
        ti = System.currentTimeMillis();

        
        SelectionSort qvt17 = new SelectionSort(vetDecre);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array decrescente por SelectionSort %.5f s%n", (tf - ti) / 300d);
        
        // Define Horario de inicio ordenação vetor aleatorio
        ti = System.currentTimeMillis();

        
        SelectionSort qvt18 = new SelectionSort(vetRandom);
        

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array aleatorio por SelectionSort %.5f s%n", (tf - ti) / 300d);
        

    }
}