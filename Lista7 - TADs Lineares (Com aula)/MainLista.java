public class MainLista {

    public static void main(String[] args) {
        
        Lista list1 = new Lista(5);

        list1.inserirInicio(50);
        list1.imprimeLista();
        list1.inserirInicio(60);
        list1.imprimeLista();
        list1.inserirFinal(70);
        list1.imprimeLista();
        list1.inserirPos(90, 2);
        list1.imprimeLista();
        list1.inserirFinal(500);
        list1.imprimeLista();

        list1.removeInicio();
        list1.imprimeLista();
        list1.removeInicio();
        list1.imprimeLista();
        list1.removeFinal();
        list1.imprimeLista();
        list1.removePos(1);
        list1.imprimeLista();
        list1.removeFinal();
        list1.imprimeLista();



    }
    
}
