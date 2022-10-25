import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1;
        double num2;
        double soma;

        if (args.length == 0) {
            System.out.println("Digite dois números");
            num1 = entrada.nextDouble();
            num2 = entrada.nextDouble();
            soma = num1 + num2;
            System.out.println("O resultado da soma é igual a " + soma);

        } else if (args.length == 1) {
            System.out.println("Digite um número");
            num1 = entrada.nextDouble();
            num2 = Double.parseDouble(args[0]);
            soma = num1 + num2;
            System.out.println("O resultado da soma é igual a " + soma);

        } else if (args.length == 2) {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
            soma = num1 + num2;
            System.out.println("O resultado da soma é igual a " + soma);

        } else{
            System.out.println("Quantidade inválida.");
        }
    }
}

/*
Criar um programa que recebe 2 números e realiza a soma deles.
Porém, nesse caso o programa deve observar quantos parâmetros são enviados via terminal(args).
Se for nenhum, deve pedir via System.in que o usuário digite 2 números.
No caso de vir apenas 1, deve pedir outro parâmetro via System.in. Se for 2, deve realizar a soma dos dois.
No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.
 */