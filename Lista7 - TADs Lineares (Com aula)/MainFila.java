public class MainFila {

    public static void main(String[] args) {
        
        Fila list1 = new Fila(5);

        list1.inserir(50);
        list1.imprimeFila();
        list1.inserir(60);
        list1.imprimeFila();
        list1.inserir(70);
        list1.imprimeFila();
        list1.inserir(90);
        list1.imprimeFila();
        list1.inserir(500);
        list1.imprimeFila();

        list1.remove();
        list1.imprimeFila();
        list1.remove();
        list1.imprimeFila();
        list1.remove();
        list1.imprimeFila();
        list1.remove();
        list1.imprimeFila();
        list1.remove();
        list1.imprimeFila();



    }
    
}
