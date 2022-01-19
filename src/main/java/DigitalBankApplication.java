public class DigitalBankApplication {

    public static void main(String[] args) {
        Client henrique = new Client();
        henrique.setName("Henrique");

        Account ca = new CheckingAccount(henrique);
        Account sa = new SavingAccount(henrique);

        ca.deposit(1700);
        ca.printExtract();
        ca.transfer(300, sa);

        ca.printExtract();
        sa.printExtract();
    }
}
