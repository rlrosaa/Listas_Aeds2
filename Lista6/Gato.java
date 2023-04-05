public class Gato extends Animal {

    private String fala;

    public Gato(){
        super();
    }

    public Gato(String nome){
        super(nome);
        setFala();
    }
    
    public void setFala() {

        this.fala = "miau";
        
    }

    public String getFala(){
        return this.fala;
    }
    
}