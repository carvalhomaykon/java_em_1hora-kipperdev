import java.util.ArrayList;

public class Main2 { // Classe principal
    public String name; // Atributo público
    protected int salary; // Atributo protegido

    public static void main(String[] args) {
        // nome não é um campo estático
        // nome2 é um campo estático
        // System.out.println(nome2);

        Ser meuSerAnimal = new Pessoa("Maykon", 19, "Carvalho");
        meuSerAnimal.setNome("Maykon");
        System.out.println(meuSerAnimal.saudacao());
        // Pessoa minhaPessoa = new Pessoa();
        // A pessoa é do tipo Ser
        // O Ser não é do tipo pessoa
    }

    private void atualizaSalario() {
        this.salary = 4000;
    }

    public int getSalary() {
        this.atualizaSalario();
        return this.salary;
    }
}
