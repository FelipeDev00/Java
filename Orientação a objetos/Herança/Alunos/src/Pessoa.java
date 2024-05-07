public class Pessoa {
    public String nome;
    public String cpf;
    private String uuid;
    
    public Pessoa() { }
    
    public String GetId(){
        return uuid;
    }
    public void SetId(String newId){
        this.uuid = newId;
    }
}
