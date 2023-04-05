import java.util.Scanner;

public class Lista7{
    
    static int tam = 0,pos=0,excluido;
    static int[] vet = new int[5];
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcao = -1;
        while (opcao !=0){ //Repete a exibição do menu até o usuario escolher uma opção valida ou sair do programa.
            imprimeMenu(); //Função que imprime o menu na tela.
            opcao = ent.nextInt(); //registra a opção do user.

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    imprimeVetor();
                    break;
                case 2:
                    inserirInicio();
                    break;
                case 3:
                    inserirFinal();
                    break;
                case 4:
                    inserirPos();
                    break;
                case 5:
                    excluido = removeInicio();
                    break;
                case 6:
                    excluido = removeFinal();
                    break;
                case 7:
                    excluido = removePos();
                    break;
                default:
                    System.out.println("\nOpção digitada não encontrada. Tente novamente.\n");
                    break;
            }
        }
    }

    private static int removePos() {
        int excluido=0;

        if(!verificaVazio() && validaPosRemover()){ //Verifica se o vetor está vazio
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

    private static int removeFinal() { //Apaga o ultimo elemento do vetor
        
        int excluido =0; //Variavel para armazenar o número que será deletado

        if(!verificaVazio()){ //Verifica se o vetor está vazio
            excluido = vet[tam-1];
            vet[tam-1]=0;
            tam--;
            System.out.println("O valor " + excluido + " foi excluido do vetor.");
        }
        
        return excluido;
    }

    private static int removeInicio() { //Remove o numero da primeira posição do vetor e reposiciona os outros elementos se necessário
        
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

    private static void inserirPos() {
        if(!verificaCheio() && validaPosInserir()){ //Verifica se o vetor está cheio e, após, verifica a posição.
            int x = solicitaValor();
            for(int i = tam-1;i>=pos;i--){
                vet[i+1]=vet[i];
            }
            vet[pos]= x;
            tam++;
        }
    }

    private static boolean validaPosInserir() { // Valida se a posição inserida pelo usuario é valida
        System.out.println("Digite a posição em que deseja inserir um número:");
        pos = ent.nextInt();
        if(pos>=0 && pos <= tam){
            return true;
        }
        else{
            System.out.println("Posição digitada invalida.");
            return false;
        }
    }

    private static boolean validaPosRemover() { // Valida se a posição inserida pelo usuario é valida
        System.out.println("Digite a posição em que deseja remover um número:");
        pos = ent.nextInt();
        if(pos>=0 && pos < tam){
            return true;
        }
        else{
            System.out.println("Posição digitada invalida.");
            return false;
        }
    }

    private static void inserirFinal() {
        if(!verificaCheio()){
            int x = solicitaValor();
            vet[tam]= x;
            tam++;
        }
    }

    private static void imprimeVetor() {
        System.out.println(); //espaço de organização na tela
        for (int i = 0;i<tam;i++){
            System.out.println(vet[i]);
        }
        System.out.println(); //espaço de organização na tela
    }

    private static void imprimeMenu() { //Metodo com as opções disponíveis no programa.
        System.out.println(); //espaço de organização na tela
        System.out.println("Digite o número da opção desejada:");
        System.out.println("1 - Imprimir vetor na tela.");
        System.out.println("2 - Inserir número no início do vetor.");
        System.out.println("3 - Inserir número no final do vetor.");
        System.out.println("4 - Inserir número em uma posição escolhida do vetor.");
        System.out.println("5 - Remover número no inicio do vetor.");
        System.out.println("6 - Remover número no final do vetor.");
        System.out.println("7 - Remover número de uma posição escolhida do vetor.");

        System.out.println("0 - Sair.");
    }

    public static void inserirInicio(){
        
        if(!verificaCheio()){          
            
            int x = solicitaValor();
            for(int i = tam-1;i>=0;i--){ //Loop deslocando os elementos uma posição para inserir o novo no inicio.
                vet[i+1] = vet[i];
            }
            vet[0]=x;
            tam++;

        }
    }

    public static boolean verificaCheio(){//Verifica se o vetor está cheio. Se vazio, retorna true
        if(tam>=vet.length){
            System.out.println("Vetor cheio. Não é possível inserir um novo número.");
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean verificaVazio(){ //Verifica se o vetor está vazio. Se vazio, retorna true
        if(tam==0){
            System.out.println("Vetor vazio. Não é possível remover um número.");
            return true;
        }
        else{
            return false;
        }
    }

    private static int solicitaValor() {
        System.out.println("Digite o valor que deseja inserir no vetor:");
        return ent.nextInt();
    }

}