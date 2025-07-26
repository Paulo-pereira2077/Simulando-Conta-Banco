package entities;

public class Count {

// número da conta
// nome do titular da conta
// valor de depósito inicial ao abrir a conta pela primeira vez (é opcional)

    private final int numberCount;
    private final String name;
    private double balance;

    public Count(int numberCount, String name, double balance){
        this.numberCount = numberCount;
        this.name = name;
        this.balance = balance;
    }

    public int getNumberCount(){
        return numberCount;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    // adicionando saldo na conta
    public void addBalance(double balance){
        this.balance += balance;
    }

// para imprimir as informações

    public String toString(){
        return "Número da conta: " + numberCount + ", Nome: " + name + ", saldo de $" + String.format("%.2f", balance);

    }

}