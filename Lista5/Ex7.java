import java.util.Random;

public class Ex7{

    public static void main(String[] args) {

        double vet[] = new double [40000];
        Random r = new Random();
        long ti,tf;
        
        // Define Horario de criação do array
        ti = System.currentTimeMillis();

        for(int i = 0; i < vet.length;i++){
            vet[i] = r.nextDouble();
        }

        // Define Horario de fim da criação do array
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra criação do array %.5f s%n", (tf - ti) / 1000d);

        // execução 10 cv do QuickSort
        // Define Horario de criação do array ordenado
        ti = System.currentTimeMillis();

        for (int i = 0; i<10;i++){
            QuickSort qvt = new QuickSort(vet);
            double [] vetOrdenado = qvt.getVetOrdenado();
        }
        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array por QuickSort %.5f s%n", (tf - ti) / 300d);
        
        // Define Horario de criação do array ordenado
        ti = System.currentTimeMillis();

        for (int i = 0; i<10;i++){
            HeapSort qvt = new HeapSort(vet);
            double [] vetOrdenado = qvt.getVetOrdenado();
        }

        // Define Horario de termino criação do array ordenado
        tf = System.currentTimeMillis();

        System.out.printf("Tempo total em segundos pra ordenação do array por HeapSort %.5f s%n", (tf - ti) / 1000d);
        

    }
}