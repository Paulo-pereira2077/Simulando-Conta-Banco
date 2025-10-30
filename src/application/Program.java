package application;

import entities.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        // criando a conta
        Account account;

        // iniciando o cadastro pedindo o número da conta
        System.out.print("Número da conta: ");
        int numberAccount = entrada.nextInt();
        entrada.nextLine();

        // pedindo o nome
        System.out.println(); //pula uma linha
        System.out.print("Insira seu nome: ");
        String name = entrada.nextLine();

        // pedindo para fazer um depósito inicial
        System.out.println(); // pula uma linha
        System.out.print("Gostaria de fazer um depósito? (s/n):");
        // trocando de String para char e removendo o 'double balance = 0;'
        char answer = entrada.next().charAt(0);

        if (answer == 's'){
            System.out.println();// pula uma linha
            System.out.print("Valor do depósito inicial: R$ ");
            // trocando de 'balance' para initialDeposit
            double initialDeposit = entrada.nextDouble();
            // criando a conta caso escolha adicionar um depósito inicial
            account = new Account(numberAccount, name, initialDeposit);
        }
        else{
            // criando a conta sem um depósito inicial
            account = new Account(numberAccount, name);
        }

        System.out.println();// pula uma linha
        System.out.println("Conta criada com sucesso!");
        System.out.println(account);


        // pedindo para adicionar valor no saldo
        System.out.println(); // pula uma linha
        System.out.print("Adicione qualquer valor no seu saldo: ");
       double balance = entrada.nextDouble();
        entrada.nextLine();
        account.deposit(balance);

        // exibe atuaizações
        System.out.println(); // pula uma linha
        System.out.println("Dados atualizados: " + account);

        // pedindo para sacar o dinheiro
        System.out.println(); // pula uma linha
        System.out.print("Gostaria de sacar o dinheiro? (s/n): ");
        answer = entrada.next().charAt(0);
        if (answer == 's') {
            System.out.print("Valor do saque: R$ ");
            balance = entrada.nextDouble();
            account.removeBalance(balance);
        }

        // exibe atuaizações
        System.out.println(); // pula uma linha
        System.out.println("Dados atualizados: " + account);

        // pergunta se quer alterar o nome
        System.out.println(); // pula uma linha
        System.out.print("Gostaria de alterar seu nome? (s/n): ");
        answer = entrada.next().charAt(0);
        entrada.nextLine(); // consome um espaço e permite executar a operação abaixo
        System.out.println();

        String newName; // criado para poder utilizar no laço de repetição
        String result; // criando para poder utilizar o else if no laço de repetição
        if (answer == 's'){
        do{
            System.out.print("Digite seu novo nome: ");
            newName = entrada.nextLine();
            result = account.changeName(newName);
            System.out.println(result);
            System.out.println();
        }while (result.startsWith("Erro"));
        }

        // exibe atualizações
        System.out.println(); // pula uma linha
        System.out.println("Dados atualizados: " + account);

        entrada.close();
    }

}