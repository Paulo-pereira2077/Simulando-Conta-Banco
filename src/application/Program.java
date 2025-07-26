package application;

import entities.Count;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        // iniciando o cadastro pedindo o número da conta
        System.out.println("Número da conta: ");
        int numberCount = entrada.nextInt();
        entrada.nextLine();

        // pedindo o nome
        System.out.println(); //pula uma linha
        System.out.println("Insira seu nome: ");
        String name = entrada.nextLine();

        // pedindo para fazer um depósito inicial
        System.out.println();
        System.out.println("Gostaria de fazer um depósito? (s/n):");
        String resposta = entrada.nextLine().trim();
        double balance = 0;

        if (resposta.equalsIgnoreCase("s")){
            System.out.println("Valor do depósito inicial: R$ ");
            balance = entrada.nextDouble();
        }

        // criando a conta
        Count count = new Count(numberCount, name, balance);
        System.out.println();// pula uma linha
        System.out.println("Conta criada com sucesso!");
        System.out.println(count);

        // pedindo para adicionar valor no saldo
        System.out.println("Adicione qualquer valor no seu saldo: ");
        balance = entrada.nextDouble();
        count.addBalance(balance);

        System.out.println();
        System.out.println("Dados atualizados: " + count);


        entrada.close();
    }


}