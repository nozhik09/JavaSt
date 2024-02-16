package lesson_24.homeWork_24;

public class YourAccounts {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount("DE42 6545 5454 6545 4565 02", 1000);
        ElectronicWallet electronicWallet = new ElectronicWallet("4445 5554 5565 6415", 500);

        PaymentSystem[] paymentSystems = new PaymentSystem[2];
        paymentSystems[0] = electronicWallet;
        paymentSystems[1] = bankAccount;


        for (PaymentSystem paymentSystem : paymentSystems) {
            paymentSystem.transferMoney(230);
            paymentSystem.withdrawMoney(200);
            paymentSystem.checkBalance();
        }





    }
}
