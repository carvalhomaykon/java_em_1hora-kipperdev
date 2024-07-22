import java.util.ArrayList; // Classe que ajuda a deixar o array dinâmico

public class Main {
    public static void main(String[] args) {
        // Declaração de Variáveis

        // 1° Maneira:
        // tipo nome = valor;
        int idade = 22; // Cria a variável e inicializa
        int salario; // Cria a variável
        salario = 400; // Inicializa a variável

        // 2° Maneira:
        // A variável só existe dentro do escopo, que nesse caso é o main, que está lá em cima
        // var nome = "Maykon";
        // O Java consegue identificar qual o tipo da variável, sem declarar que a variável é do tipo string
        // nome = 22; // No entanto, não podemos alterar o tipo após a declaração

        // TIPOS PRIMITIVOS NO JAVA
        // byte --> Inteiros pequenos (-128 ... 127) --> 1 byte
        // short --> (-32,768 ... 32,767) --> 2 bytes
        // int --> (-2,147,483,648 ... 2,147,483,647) --> 4 bytes
        // long --> (-9,223,372,036,854,775,808 ... 9,223,372,036,854,775,807) --> 8 bytes
        int idade1 = 22;

        // boolean --> Verdadeiro ou falso
        boolean eBrasileiro = true;

        // char --> Armazena caracteres
        char letra = 'O'; // Armazena somente um caractere, não podemos armazenar frases e palavras

        // String é uma classe, não é um tipo primitivo
        String nome2 = "Maykon";

        // double e float --> Representam números de ponto flutuante
        // float --> Usado para armazenar números de ponto flutuante simples, com poucas casas decimais depois da vírgula
        // double --> Usado para armazenar números de ponto flutuante complexos, com várias casas decimais depois da vírgula
        double idade2 = 22.50;
        float salario2 = 400.20F; // Obrigatório colocar F no final

        // Sintaxe de condicionais
        if (idade2 > 22.60){
            System.out.println("maior");
        }
        else if (idade2 == 22.60) {
            System.out.println("igual");
        }
        else{
            System.out.println("menor");
        }

        // Declaração de Arrays
        // Inicializar array
        int[] idades = {1, 2, 3, 4};
        idades[0] = 4;
        int[] idades2 = new int[10]; // 10 é o tamanho do array
        String[] nomes = new String[10];
        boolean[] saoBrasileiros = {true, false, true};

        // Declaração de formato dinâmico
        // ArrayList
        ArrayList<Integer> idadesList = new ArrayList<Integer>();
        // Por ser dinâmico, não foi preciso definir o tamanho do ArrayList
        // Adicionar novo valor
        idadesList.add(22); // Adicionar 22
        idadesList.add(30);
        idadesList.add(40);

        idadesList.remove(0); // Remover o valor do índice 0
        System.out.println(idadesList.get(1)); // Pegar o valor do índice 1

        System.out.println(idadesList.size()); // Retorna o tamanho do array

        // LOOPS
        int idade3 = 10;
        for (int i = 0; i < idade3; i++){
            System.out.println("OI");
        }

        int i = 0;
        while (i < idade3){
            i++;
            System.out.println("OI while.");
        }

        // CASTING
        // É transformar uma variável de um tipo para outro tipo
        // Ex: Quero transformar um int para float

        // CASTING IMPLÍCITO
        int number = 22;
        double number2 = number;

        // number2 = number; // Não posso colocar um double dentro de um inteiro, pois double > int

        // CASTING EXPLÍCITO
        number = (int) number2;

        char letra2 = 'a';
        // String nome3 = letra2; // Isso aqui irá ocorrer um erro
        String nome3 = String.valueOf(letra2); // Converter um char em string
        letra2 = nome3.charAt(0); // Converter string em char
        String numberStr = String.valueOf(number); // Converter int em string
        number = Integer.parseInt(numberStr); // Converter string em int

        // Classes Integer | Métodos Auxiliares

        // POO - PROGRAMAÇÃO ORIENTADA A OBJETO
    }
}
