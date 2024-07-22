// HERANÇA
public class Pessoa extends Ser {
    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome) {
        super(nome, idade);
        this.sobrenome = sobrenome;
    }

    void criaMain() {
        Main2 meuMain = new Main2();
        System.out.println(meuMain.name);
        // System.out.println(salary); // Devido salary ser protegido, não posso acessar diretamente aqui
        this.idade = 22;
    }

    @Override
    public String saudacao() {
        return "Olá, meu nome é " + this.nome + " " + this.sobrenome;
    }
}
