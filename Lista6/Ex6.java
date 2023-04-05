import javax.crypto.MacSpi;

public class Ex6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Cao vetCao [] = new Cao [5];
        Gato vetGato[] = new Gato[5];
        Homem vetHomem[] = new Homem[5];

        for (int i = 0; i<5 ; i++){
            vetCao[i] = new Cao("aa");
            vetGato[i] = new Gato("bb");
            vetHomem[i] = new Homem("cc");
        }

        for (int i = 0; i<5 ; i++){
            System.out.println(vetCao[i].getNome() + ";" + vetCao[i].getFala());
            System.out.println(vetGato[i].getNome() + ";" + vetGato[i].getFala());
            System.out.println(vetHomem[i].getNome() + ";" + vetHomem[i].getFala());
        }
        
    }
    
}
