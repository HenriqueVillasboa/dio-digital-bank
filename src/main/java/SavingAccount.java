public class SavingAccount extends Account{

    public SavingAccount(Client client){
        super(client);
    }

    @Override
    public void printExtract(){
        System.out.println("=== Balance of Saving Account ===");
        super.printCommonInformation();
    }
}
