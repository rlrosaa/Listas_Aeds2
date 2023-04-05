import java.util.Scanner;

public class Fila{
    
    int tam = 0;
    int[] vet;
    Scanner ent = new Scanner(System.in);

    public Fila(){
        vet = new int[10];
    }

    public Fila(int n){
        vet = new int[n];
    }

 
    public int remove() { //Apaga o ultimo elemento do vetor
        
        int excluido=0;

        if(!verificaVazio()){ //Verifica se o vetor está vazio
            excluido = vet[0];
            for (int i = 0;i<tam-1;i++){ //Loop para reorganziar vetor. Desloca os outros elementos para a esquerda.
                vet[i]= vet[i+1];
            }
            vet[tam-1] = 0;
            tam--;
            System.out.println("O valor " + excluido + " foi excluido do vetor.");
        }
        
        return excluido;
    }


    public  void inserir(int x) {
        if(!verificaCheio()){
            vet[tam]= x;
            tam++;
        }
    }

    public void imprimeFila() {
        System.out.println(); //espaço de organização na tela
        for (int i = 0;i<tam;i++){
            System.out.println(vet[i]);
        }
        System.out.println(); //espaço de organização na tela
    }

    private boolean verificaCheio(){//Verifica se o vetor está cheio. Se vazio, retorna true
        if(tam>=vet.length){
            System.out.println("Vetor cheio. Não é possível inserir um novo número.");
            return true;
        }
        else{
            return false;
        }
    }

    private  boolean verificaVazio(){ //Verifica se o vetor está vazio. Se vazio, retorna true
        if(tam==0){
            System.out.println("Vetor vazio. Não é possível remover um número.");
            return true;
        }
        else{
            return false;
        }
    }

}