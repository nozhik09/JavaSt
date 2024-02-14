package lesson_20.homeWork_20;

public class EsimNumber {

    private String operator;

    private int phoneNumber;


    private int moneyInAccount;


    public EsimNumber(String operator, int phoneNumber, int moneyInAccount) {
        this.operator = operator;
        this.phoneNumber = phoneNumber;
        this.moneyInAccount = moneyInAccount;
    }









    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(int moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }
}
