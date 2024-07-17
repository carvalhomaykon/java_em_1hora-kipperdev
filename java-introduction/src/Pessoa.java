class Ser{
    String nome;
    int idade;

    public Ser(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    void setNome (String nome){
        this.nome = nome;
    }

    void setIdade (int idade){
        this.idade = idade;
    }
}

// HERENÇA
public class Pessoa extends Ser{
    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome){
        super (nome, idade);
        this.sobrenome = sobrenome;
    }

    void criaMain(){
        Main2 meuMain = new Main2();
        System.out.println(meuMain.name);
        //System.out.println(salary); // Devido salary ser privado, não posso colocar aqui
        this.idade = 22;
    }

    @Override
    public String saudacao(){
        return "Olá, meu nome é" + this.nome;
    }
}
