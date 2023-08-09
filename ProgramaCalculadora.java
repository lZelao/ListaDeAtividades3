package calculadora;

import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
      
        double n1,n2,resultado = 0;
        

        System.out.print("Digite o primeiro número: ");
         n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();


        switch (escolha) {
            case 1:
                resultado = calculadora.somar(n1, n2);
                break;
            case 2:
                resultado = calculadora.subtrair(n1, n2);
                break;
            case 3:
                resultado = calculadora.multiplicar(n1, n2);
                break;
            case 4:
                resultado = calculadora.dividir(n1, n2);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);

    }
}

