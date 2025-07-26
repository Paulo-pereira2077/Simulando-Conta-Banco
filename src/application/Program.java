package application;

import entities.Count;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        // iniciando o cadastro pedindo o número da conta
        System.out.print("Número da conta: ");
        int numberCount = entrada.nextInt();
        entrada.nextLine();

        // pedindo o nome
        System.out.println(); //pula uma linha
        System.out.print("Insira seu nome: ");
        String name = entrada.nextLine();

        // pedindo para fazer um depósito inicial
        System.out.println(); // pula uma linha
        System.out.print("Gostaria de fazer um depósito? (s/n):");
        String resposta = entrada.nextLine().trim();
        double balance = 0;

        if (resposta.equalsIgnoreCase("s")){
            System.out.println();// pula uma linha
            System.out.print("Valor do depósito inicial: R$ ");
            balance = entrada.nextDouble();
        }

        // criando a conta
        Count count = new Count(numberCount, name, balance);
        System.out.println();// pula uma linha
        System.out.println("Conta criada com sucesso!");
        System.out.println(count);


        // pedindo para adicionar valor no saldo
        System.out.println(); // pula uma linha
        System.out.print("Adicione qualquer valor no seu saldo: ");
        balance = entrada.nextDouble();
        entrada.nextLine();
        count.addBalance(balance);

        System.out.println();
        System.out.println("Dados atualizados: " + count);

        // pedindo para sacar o dinheiro
        System.out.println(); // pula uma linha
        System.out.print("Gostaria de sacar o dinheiro? (s/n): ");
        resposta = entrada.nextLine().trim();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Valor do saque: R$ ");
            balance = entrada.nextDouble();
            count.removeBalance(balance);
        }

        System.out.println();
        System.out.println("Dados atualizados: " + count);

        entrada.close();
    }


}