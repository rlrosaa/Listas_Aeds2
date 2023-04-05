public class Homem extends Animal {

    private String fala;

    public Homem(){
        super();
    }

    public Homem(String nome){
        super(nome);
        setFala();
    }
    
    public void setFala() {
        this.fala = "Oi";        
    }

    public String getFala(){
        return this.fala;
    }
    
}