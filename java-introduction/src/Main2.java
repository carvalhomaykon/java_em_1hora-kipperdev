// POO - PROGRAMAÇÃO ORIENTADA A OBJETO

import java.util.ArrayList;

public class Main2 { // Classe
    // Só posso ter uma classe pública dentro do arquivo java
    // Que no caso deve ser o nome principal - Main2

    //String nome; // Declaramos um atributo// nome

    //static String nome2;// Criar atributo estático

    public String name;

    //private int salary;
    protected int salary;


    public static void main(String[] args){
        // nome não é um campo estatico
        // nome2 é um campo estático
        // System.out.println(nome2);
        Ser meuSerAnimal = new Pessoa("Maykon", 19, "Carvalho");
        meuSerAnimal.setNome("Maykon");
        meuSerAnimal.saudacao();
        // Pessoa minhaPessoa = new Pessoa();
        // A pessoa é do tipo Ser
        // O Ser não é do tipo pessoa
    }

    /*
    static void teste(){

    }

    void declaraNome(){
        System.out.println(nome2);
        Main2.teste(); // Chamar diretamente o class main
        nome = "Maykon";

        Main2 meuMain = new Main2();

        System.out.println(meuMain.nome);
    }

    String getNome(){
        return nome;
    }

    // CONSTRUTUTORES: são métodos da classes chamados pra inicializar a instância dessa classe
    // Podemos trocar o public por private
    public Main2(String nome){
        // Podemos inicializar esse objeto
        this.nome = nome; // Meu nome é o nome
    }

    // Criar um novo construtor
    public  Main2(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
     */

    // MODIFICADORES DE ACESSO
    // Determinar o nível de visibilidade das class, dos atributos das class e ...


    private void atualizaSalario(){
        this.salary = 4000;
    }

    public int getSalary(){
        this.atualizaSalario();
        return this.salary;
    }

}

// new Main2() // Criar uma nova instância dessa class

/*
class pessoa{ // Criar uma classe chamada de pessoa
    void criaMain(){
        Main2 meuMain = new Main2 ("Maykon", 22); // O construtor vai ser chamado quando inicializado um novo objeto, uma nova instância
    }
}
*/

class pessoa{ // class
    public Pessoa(String nome, int idade){
        super(nome, idade);
    }

    // Método
    void criaMain(){
        Main2 meuMain = new Main2();
        System.out.println(meuMain.name);
        // System.out.println(salary); // Devido salary ser privado, não posso colocar aqui
    }
}
