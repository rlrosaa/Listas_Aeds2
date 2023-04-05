import java.util.Scanner;

public class Lista{
    
    int tam = 0;
    int[] vet;
    Scanner ent = new Scanner(System.in);

    public Lista(){
        vet = new int[10];
    }

    public Lista(int n){
        vet = new int[n];
    }

    public int removePos(int pos) {
        int excluido=0;

        if(!verificaVazio() && validaPosRemover(pos)){ //Verifica se o vetor está vazio
            excluido = vet[pos];
            for (int i = pos;i<tam-1;i++){ //Loop para reorganziar vetor. Desloca os outros elementos para a esquerda.
                vet[i]= vet[i+1];
            }
            vet[tam-1] = 0;
            tam--;
            System.out.println("O valor " + excluido + " foi excluido do vetor.");
        }
        
        return excluido;
    }

    public int removeFinal() { //Apaga o ultimo elemento do vetor
        
        int excluido =0; //Variavel para armazenar o número que será deletado

        if(!verificaVazio()){ //Verifica se o vetor está vazio
            excluido = vet[tam-1];
            vet[tam-1]=0;
            tam--;
            System.out.println("O valor " + excluido + " foi excluido do vetor.");
        }
        
        return excluido;
    }

    public  int removeInicio() { //Remove o numero da primeira posição do vetor e reposiciona os outros elementos se necessário
        
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

    public void inserirPos(int x , int pos) {
        if(!verificaCheio() && validaPosInserir(pos)){ //Verifica se o vetor está cheio e, após, verifica a posição.
            for(int i = tam-1;i>=pos;i--){
                vet[i+1]=vet[i];
            }
            vet[pos]= x;
            tam++;
        }
    }

    private  boolean validaPosInserir(int pos) { // Valida se a posição inserida pelo usuario é valida

        if(pos>=0 && pos <= tam){
            return true;
        }
        else{
            System.out.println("Posição digitada invalida.");
            return false;
        }
    }

    private  boolean validaPosRemover(int pos) { // Valida se a posição inserida pelo usuario é valida

        if(pos>=0 && pos < tam){
            return true;
        }
        else{
            System.out.println("Posição digitada invalida.");
            return false;
        }
    }

    public  void inserirFinal(int x) {
        if(!verificaCheio()){
            vet[tam]= x;
            tam++;
        }
    }

    public void imprimeLista() {
        System.out.println(); //espaço de organização na tela
        for (int i = 0;i<tam;i++){
            System.out.println(vet[i]);
        }
        System.out.println(); //espaço de organização na tela
    }

    public  void inserirInicio(int x){
        
        if(!verificaCheio()){          
            
            for(int i = tam-1;i>=0;i--){ //Loop deslocando os elementos uma posição para inserir o novo no inicio.
                vet[i+1] = vet[i];
            }
            vet[0]=x;
            tam++;

        }
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