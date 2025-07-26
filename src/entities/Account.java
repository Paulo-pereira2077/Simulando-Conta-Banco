package entities;

// renomeei de Count para Account
public class Account {

// número da conta
// nome do titular da conta
// valor de depósito inicial ao abrir a conta pela primeira vez (é opcional)

    private final int numberAccount;
    private String name;
    private double balance;

    // para caso o usuário escolha a opção de não fazer um depósito inicial
    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    // adicionando o depósito inicial da conta, já que uma conta quando criada tem o valor de R$ 0,00
    public Account(int numberCount, String name, double initialDeposit){
        this.numberAccount = numberCount;
        this.name = name;
        deposit(initialDeposit); // para o depósito inicial
    }

    public int getNumberAccount(){
        return numberAccount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    // adicionando saldo na conta e trocando a nomenclatura de addBalance para deposit e criando uma 'quantia (amount)'
    public void deposit(double amount){
        balance += amount;
    }

    // sacando dinheiro da conta com uma taxa de R$ 5,00 e criando uma 'quantia (amount)'
    public void removeBalance(double amount){
        balance -= amount + 5.0;
    }

// para imprimir as informações

    public String toString(){
        return "Número da conta: " + numberAccount + ", Nome: " + name + ", saldo de $" + String.format("%.2f", balance);

    }

}