public class MainFila2 {
    public static void main(String[] args) {
        
        Fila nfila = new Fila();

        nfila.desenfileirar();
        nfila.mostrar();
        nfila.enfileirar(50);
        nfila.mostrar();
        nfila.enfileirar(60);
        nfila.mostrar();
        System.out.println(nfila.tamanhoFila());
        nfila.desenfileirar();
        nfila.mostrar();
        nfila.desenfileirar();
        nfila.mostrar();
        nfila.desenfileirar();
        System.out.println(nfila.tamanhoFila());
    


    }
    
}
