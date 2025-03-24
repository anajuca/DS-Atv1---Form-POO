public class Pessoa {
    private String nome;
    private String email;
    private int idade;

//construtor
    public Pessoa(String nome, String email, int idade){
        this.nome = nome; //variavel nome recebe parâmetro nome
        this.email= email;
        this.idade = idade;
    }

//metodo GET
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public int getIdade(){
        return idade;
    }
    
//metodo SET
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
}

