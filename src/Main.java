//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte byteVar = 127;
//        short shortVar = 32000;
//        int intVar = 21000000;
//        long longVar = 9000000000000000000L;
//
//        float floatVar = 3.141523f;
//        double doubleVar = 3.14159265358979323846;
//
//        char charVar = 'A';
//
//        boolean boolVar = true;

//        System.out.println("Byte: " + byteVar);
//        System.out.println("Short: " + shortVar);
//        System.out.println("Int: " + intVar);
//        System.out.println("Long: " + longVar);
//        System.out.println("Float: " + floatVar);
//        System.out.println("Double: " + doubleVar);
//        System.out.println("Char: " + charVar);
//        System.out.println("Bool: " + boolVar);

//        //Utilizando apenas 2 casas decimais
//        System.out.printf("%.2f\n", floatVar);
//
//        String name = "Michel";
//
//        System.out.println("Name: " + name);
//
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.2f\n", floatVar);
//
//        //Utilizando casting
//        int a;
//        int b;
//        int c;
//        double area;
//
//        a = 5;
//        b = 7;
//        c = 3;
//
//        area = (double) (a + b)/2 * c;
//
//        System.out.printf("%.2f\n", area);

        Scanner sc = new Scanner(System.in);
//
//        String nome = sc.next();
//        System.out.println("Seu nome é: " + nome);
//
//        int idade = sc.nextInt();
//        System.out.println("Sua idade: " + idade);

//        char caracter = sc.next().charAt(0);
//        System.out.println("Caracter: " + caracter);

        //Exercício 1: Conversão de celsius para fahrennheit

//        float temperatura_celsius = sc.nextFloat();
//        float celsius_fahrenheit = (temperatura_celsius * 9/5) + 32;
//
//        System.out.printf("A temperatura em Fahrenheit: %.2f", celsius_fahrenheit);

        //Exerccício 2: Par ou Impar

//        int numero = sc.nextInt();
//
//        if (numero % 2 == 0) {
//            System.out.println("Eu sou um número par!");
//        } else {
//            System.out.println("Eu sou um número ímpar!");
//        }

        //Dias da semana com switch case
//        System.out.println("Digite o dia da semana: ");
//        int dia = sc.nextInt();
//
//        switch(dia) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sábado");
//                break;
//            default:
//                System.out.println("Digite um numero de 1 a 7");
//        }

        //Exercício 3: Verifique se o ano é bissexto!
//        System.out.println("Digite o ano: ");
//        int ano = sc.nextInt();
//        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
//            System.out.println(ano + "Ano Bissexto");
//        } else {
//            System.out.println(ano + "Ano não é bissexto");
//        }

        //Exercício 4: Calculadora simples
//        System.out.println("Digite o primeiro numero: ");
//        int num1 = sc.nextInt();
//        System.out.println("Digite o operador: ");
//        String operador = sc.next();
//        System.out.println("Digite o segundo numero: ");
//        int num2 = sc.nextInt();
//        int soma;
//        int subtracao;
//        int multiplicacao;
//        int divisao;
//        int resultado = 0;
//        if (operador.equals("+")) {
//            soma = num1 + num2;
//            resultado = soma;
//        } else if (operador.equals("-")) {
//            subtracao = num1 - num2;
//            resultado = subtracao;
//        } else if (operador.equals("*")) {
//            multiplicacao = num1 * num2;
//            resultado = multiplicacao;
//        } else if (operador.equals("/")) {
//            divisao = num1 / num2;
//            resultado = divisao;
//        } else {
//            System.out.println("Digite um operador válido!");
//        }
//        System.out.println("Resultado: " + resultado);

        //Usando switch
//        double resultado = 0;
//
//        switch (operador) {
//            case "+":
//                resultado = num1 + num2;
//                break;
//            case "-":
//                resultado = num1 - num2;
//                break;
//            case "*":
//                resultado = num1 * num2;
//                break;
//            case "/":
//                resultado = num1 / num2;
//                break;
//            default:
//                System.out.println("Digite um operador válido!");
//
//        }
//        System.out.println("Resultado: " + resultado);

        //Exercício 5: Simule um login básico que permita apenas três tentativas antes de bloquear o usuário.

//        String loginUsuario = "24mm87";
//        String msg = "";
//
//        for(int i = 0; i < 3; i++){
//            System.out.println("Digite sua senha: ");
//            String login = sc.next();
//            if (login.equals(loginUsuario)) {
//                msg = "Login relizado com sucesso!";
//                System.out.println("Login relizado com sucesso!");
//                break;
//            } else {
//                msg = "Tente novamente!";
//            }
//        }



//                //Arrays Unidirecionais e Birecionais
//
//                //Inicializando primeiro vetor
//                int[] vetor = new int[5];
//
//                vetor[0] = 10;
//                vetor[1] = 20;
//                vetor[2] = 30;
//                vetor[3] = 40;
//                vetor[4] = 50;
//
//                //Inicializando segundo vetor
//                int[] vetorInicializado = {1, 2, 3, 4, 5};
//
//                //Vetor contendo Strings
//                String[] palavras = {"teste"};

                //Soma elementos do array
//        int soma = 0;
//        for (int i = 0; i < vetor.length; i++) {
//            //System.out.println(vetor[i]);
//            soma += vetor[i];
//        }
//        System.out.println(soma);

                //Encontrando o maior valor do array
//        int maior = 0;
//        for (int i = 0; i < vetor.length; i++) {
//            if (vetor[i] > maior) {
//                maior = vetor[i];
//            }
//        }
//        System.out.println(maior);
//
//        for (int value : vetor) {
//            if (value > maior) {
//                maior = value;
//            }
//        }
//        System.out.println(maior);

//        //Mudar a posição dos elementos do array
//        for (int i = 4; i >= 0; i--) {
//            System.out.println(vetor[i]);
//        }

                //Invertendo o array

                //Forma 1

//        //Inverte o array usando fatiamento e troca de elementos
//        for (int i = 0; i < vetor.length / 2; i++) {
//            // Armazena o valor do elemento atual em uma variável temporária
//            int temp = vetor[i];
//            // Substitui o valor do elemento atual pelo valor do elemento oposto no array
//            vetor[i] = vetor[vetor.length - 1 - i];
//            // Substitui o valor do elemento oposto pelo valor armazenado na variável temporária
//            vetor[vetor.length - 1 - i] = temp;
//        }
//
//        // Imprime o array invertido
//        System.out.println("Array: " + Arrays.toString(vetor));

//        //Forma 2
//        // Imprimindo o array original
//        System.out.println("Array original:");
//        for (int i : vetor) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        // Inicializando índices para a troca
//        int inicio = 0; // Ponto de partida do início do array
//        int fim = vetor.length - 1; // Ponto de partida do fim do array
//
//        // Loop para inverter o array
//        while (inicio < fim) {
//            // Troca o elemento no índice 'inicio' com o elemento no índice 'fim'
//            int temp = vetor[inicio]; // Armazena o valor do início em uma variável temporária
//            vetor[inicio] = vetor[fim]; // Substitui o valor no início com o valor no fim
//            vetor[fim] = temp; // Substitui o valor no fim com o valor armazenado temporariamente
//
//            // Move os índices para o centro do array
//            inicio++; // Avança o índice de início
//            fim--; // Retrocede o índice de fim
//        }
//
//        // Imprimindo o array invertido
//        System.out.println("Array invertido:");
//        for (int i : vetor) {
//            System.out.print(i + " ");
//        }


                //Matriz
                int[][] matrix = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

                //Elementos da matriz

//        for (int[] row : matrix) {
//            for (int value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }

                //Soma dos elementos da matriz
//        int soma = 0;
//        for (int[] row : matrix) {
//            for (int value : row) {
//                soma += value;
//            }
//        }
//        System.out.println("A soma dos elementos da matriz é: " + soma);

                //Construa uma matriz rotacional
//        int n = matrix.length;
//        int[][] rotacionada = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                rotacionada[j][n-1-i] = matrix[i][j];
//            }
//        }
//
//        System.out.println("Matriz rotacionada 90 graus: ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(rotacionada[i][j] + " ");
//            }
//            System.out.println();
//        }

                //Somando a matriz rotacional


//        //Soma Diagonal principal e secundária
//        int soma = 0;
//        int somaSecundaria = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(i == j) {
//                    soma += matrix[i][j];
//                }
//                if((i + j) == matrix.length -1) {
//                    somaSecundaria += matrix[i][j];
//                }
//            }
//        }
//
//        System.out.println("Soma principal: " + soma);
//        System.out.println("Soma secundaria: " + somaSecundaria);

        //Buscar valor específico na matriz

        // Valor a ser buscado
        int valorBuscado = 5;

        // Variáveis para armazenar a posição do elemento
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        // Buscar o elemento na matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == valorBuscado) {
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                    // Encontrado, não precisa continuar
                    break;
                }
            }
            // Se já encontrou, não precisa continuar o loop externo
            if (linhaEncontrada != -1) {
                break;
            }
        }

        // Verificar se o elemento foi encontrado e imprimir a posição
        if (linhaEncontrada != -1) {
            System.out.println("Elemento " + valorBuscado + " encontrado na posição: (" + linhaEncontrada + ", " + colunaEncontrada + ")");
        } else {
            System.out.println("Elemento " + valorBuscado + " não encontrado na matriz.");
        }
    }
}