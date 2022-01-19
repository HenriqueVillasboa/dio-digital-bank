package br.com.dio;

import lombok.Getter;

@Getter
public abstract class Account implements AccountInterface{

    private static final int DEFAULT_ACCOUNT = 1;
    private static int SEQUENCE = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client){
        this.agency = Account.DEFAULT_ACCOUNT;
        this.number = SEQUENCE++;
        this.client = client;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, AccountInterface destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    protected void printCommonInformation() {
        System.out.println(String.format("Owner: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
        System.out.println("");
    }
}
