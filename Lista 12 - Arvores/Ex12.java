import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Arvore arvore;

        arvore = criaArvore();
        if(arvore!=null){
            exibeMenu(arvore);
        }       

    }

    private static void exibeMenu(Arvore arvore) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Buscar nome.");
        System.out.println("2 - Listar nomes.");
        int opcao = ent.nextInt();
        switch(opcao){
            case 1:
                buscarNome(arvore);
                break;
            case 2:
                listarNome(arvore);
                break;
            default:
                System.out.println("Opção inválida");
                exibeMenu(arvore);
                break;
        }

        }


    private static void listarNome(Arvore arvore) {
        arvore.ordenar();
    }

    private static void buscarNome(Arvore arvore) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o nome desejado:");
        String nome = ent.nextLine();
        String telefone = arvore.noPesquisar(nome);
        if(telefone != ""){
            System.out.println("O telefone do nome digitado é: " + telefone);
        }
        else{
            System.out.println("Nome não encontrado.");
        }
        
    }


    private static Arvore criaArvore() throws FileNotFoundException {

        File arq = new File ("agenda.txt");
        Scanner ent = new Scanner (arq);
        Arvore arvore = new Arvore();
        No novoCont;
        String [] contato; // contato [0] = nome ; contato [1] = telefone;
    
        
        if(!ent.hasNextLine()){
            System.out.println("Não foi encontrado nenhum contato no arquivo");
            arvore=null;
        }
        else{
            while(ent.hasNextLine()){
                contato = ent.nextLine().split("#");
                novoCont = new No(contato[0], contato[1]);
                arvore.inserirNo(novoCont);
            }
        }
        return arvore;

    }
    
}
