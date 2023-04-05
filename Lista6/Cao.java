public class Cao extends Animal {

    private String fala;

    public Cao(){
        super();
    }

    public Cao(String nome){
        super(nome);
        setFala();
    }
    
    public void setFala() {

        this.fala = "auau";
        
    }

    public String getFala(){
        return this.fala;
    }
    
}
