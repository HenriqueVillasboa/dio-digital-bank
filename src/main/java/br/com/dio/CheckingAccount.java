package br.com.dio;

public class CheckingAccount extends Account{

    public CheckingAccount(Client client){
        super(client);
    }

    @Override
    public void printExtract(){
        System.out.println("=== Balance of Checking Account ===");
        super.printCommonInformation();
    }
}
