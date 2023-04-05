import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        File arq = new File("nomes.txt");
        Scanner txt = new Scanner (arq);

        String[] nomes = new String[13];

        for(int i = 0; i<nomes.length;i++){
            nomes[i] = txt.nextLine();
        }

        InsertionSort qvt = new InsertionSort(nomes);
        String[] newVet = qvt.getVetOrdenado();

        for (int i = 0; i<nomes.length;i++){
            System.out.println(newVet[i]);
        }

        txt.close();
    }

}
