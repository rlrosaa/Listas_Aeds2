public class MainPilha {

    public static void main(String[] args) {
        
        Pilha list1 = new Pilha(5);

        list1.inserir(50);
        list1.imprimePilha();
        list1.inserir(60);
        list1.imprimePilha();
        list1.inserir(70);
        list1.imprimePilha();
        list1.inserir(90);
        list1.imprimePilha();
        list1.inserir(500);
        list1.imprimePilha();

        list1.remove();
        list1.imprimePilha();
        list1.remove();
        list1.imprimePilha();
        list1.remove();
        list1.imprimePilha();
        list1.remove();
        list1.imprimePilha();
        list1.remove();
        list1.imprimePilha();



    }
    
}
