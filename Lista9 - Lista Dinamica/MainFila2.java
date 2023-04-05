public class MainFila2 {
    public static void main(String[] args) {
        
        Pilha nPilha = new Pilha();

        nPilha.inserir("Rafael", 26);
        nPilha.inserir("Iná", 27);
        nPilha.inserir("André", 28);
        nPilha.inserir("Pedro", 24);
        nPilha.mostrarNomes();
        nPilha.mostrarIdade();
        System.out.println(nPilha.media1());
        System.out.println(nPilha.media2());
        nPilha.remover();
        System.out.println(nPilha.verificaVazio());
        nPilha.remover();
        System.out.println(nPilha.verificaVazio());
        nPilha.remover();
        System.out.println(nPilha.verificaVazio());
        nPilha.remover();
        System.out.println(nPilha.verificaVazio());
        nPilha.remover();
        System.out.println(nPilha.verificaVazio());


        
    }
    
}
