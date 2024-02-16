package lesson_24.homeWork_24;

public class BankAccount implements PaymentSystem {

    private  String cardNummer;

    private int balance;



    public BankAccount(String cardNummer, int balance) {
        this.cardNummer = cardNummer;
        this.balance = balance;

    }



    @Override
    public void transferMoney(int sum) {
        if (balance >= sum) {
            balance -= sum;
            System.out.println("You send " + sum + "Euro" + "  balance on the card " + balance);
        }
        else System.out.println("Not enough funds in your wallet");

    }

    @Override
    public void withdrawMoney(int sum) {
        if (balance >= sum) {
            balance -= sum;
            System.out.println("You withdrew  " + sum + "Euro" + "  balance on the card " + balance);
        }
        else System.out.println("Not enough funds in your wallet");

    }

    @Override
    public void checkBalance() {

        System.out.println("Your balance:" + balance + "Euro");



    }





}







//
