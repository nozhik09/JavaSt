package lesson_24.homeWork_24;

public interface PaymentSystem {

    /*
    Task 0 Платежные системы Создайте интерфейс PaymentSystem
    с методами transferMoney, withdrawMoney и checkBalance.
     Реализуйте классы BankAccount и ElectronicWallet,
     которые реализуют данный интерфейс.
     Убедитесь, что каждый класс корректно выполняет каждую из операций.
     */


    void transferMoney(int sum);

    void withdrawMoney(int sum);

    void checkBalance();

}
