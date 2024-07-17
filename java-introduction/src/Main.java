import javax.management.StringValueExp;
import  java.util.ArrayList;
// Class que ajuda a deixar o array dinâmico

public class Main {
    public static void main(String[] args) {
        /*
        // Declaração de Variáveis
        // 1° Maneira:
        // tipo nome = valor;

        int idade = 22; // Posso criar a variável e declarar logo nela
        int salario; // Posso criar somente a variável
        salario = 400; // E depois declarar algo nela

        // 2° Maneira
        // Só vai existir dentro do escopo, que nesse caso é o Main, que está lá encima
        // var nome = 'Maykon';
        // O java consegue identificar qual o tipo da variável, sem declaros que a variável é do tipo string
        // nome = 22; No entanto não podemos declarar de outra forma

        // TIPOS  PRIMITIVOS NO JAVA
        // byte --> Inteiros pequenos (-127 ... 28) --> 1 byte
        // short --> (-32,768 ... 32,767) --> 16 byte
        // int --> (-2,147,483,648 ... 2,147,483,647) --> 32 byte
        // long --> (-9,223,372,036,854,775,808 ... 9,223,372,036,854,775,808) --> 64 byte

        int idade_1 = 22;


        // boolean --> Verdadeiro ou falso
        boolean eBrasileiro = true;

        // char --> Armazer caracteres
        char letra = 'O'; // Armazena somente uma string, não podemos armazenar frases e palavras

        // String é uma classe, não é um tipo primitivo
        String nome_2 = "Maykon";

        // double e float --> Representar números de pontos flutuantes
        // float --> Usado para armazernar números de pontos fluantes simples, com poucas casas decimais depois da vírgula
        // double --> Usado para armazenar números de pontos fluantes complexos, guardando bastante vários números depois da vírgula
         double idade_2 = 22.50;
         float salario_2 = 400.20F; // Obrigatório colocar F no final
         */

        // Sintaxe de condicionais
        /*
        if (idade_2 > 22.60){
            System.out.println("maior");
        }
        else if (idade_2 == 22.60) {
            System.out.println("igual");
        }
        else{
            System.out.println("menor");
        }
        */

        // Declaração de Arrays
        // Inicializar array
        //int[] idades = {1, 2, 3, 4};
        //idades[0] = 4;
        //int[] idades = new int[10]; // 10 é o tamanho do array
        //String[] nomes = new String[10];
        //boolean[] saoBrasileiros = {true, false, true};

        // Declaração de formato dinâmico
        /*
        // Array list
        // Realizar a importação do Arraylits
        ArrayList<Integer> idades = new ArrayList<Integer>();
        // Por ser dinâmico não foi preciso colocar o tamanho do Array
        // Adicionar novo valor
        idades.add(22); // Adicionar 22
        idades.add(30);
        idades.add(40);

        idades.remove(0); // Remover o valor do index X
        idades.get(1); // Pegar o valor do index 1

        idades.size(); // Retorna o tamanho do array
         */

        // LOOPS
        // while e for
        //int idade_3 = 10;
        /*
        for (var i = 0; i < idade_3; i++){
            System.out.println("OI");
        }
         */
        /*
        int i = 0;
        while (i < idade_3){
            i++;
            System.out.println("OI while.");
        }
         */

        // CASTING
        /*
        // É transforma uma variável de um tipo pra outro tipo
        // Ex: Quero transformar um int pra float

        // CASTING IMPLÍCITO
        int number = 22;
        double number2 = number;

        // number2 = number; // Não posso colocar um double dentro de um inteiro, pois double > inteiro

        // CASTING EXPLÍCITO
        number = (int) number2;

        char letra = 'a';
        //String nome = letra // Isso aqui irá ocorrer um erro
        String nome = String.valueOf(letra); // Converter um char em string
        letra = nome.charAt(0); // Converter String em char
        String number2 = String.valueOf(number); // Converter int em
        number = Integer.parseInt(number2); // String em inteiro
        // Classs Integer | Método Auxiliar
         */

        // POO - PROGRAMAÇÃO ORIENTADA A OBJETO
    }
}
