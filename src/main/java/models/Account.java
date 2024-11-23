package models;

public class Account {

    private Integer number;

    private String holder;

    private Double balance;

    private Double withdrawLimit ;


    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(Double amount) throws RuntimeException{
        validateWithdraw(amount);
        this.balance += amount;
    }

    public void withdraw (Double amount) throws RuntimeException {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new RuntimeException("Erro de saque: A quantida excede o limit");
        }

        if (amount > getBalance()) {
            throw  new RuntimeException("Erro de saque: saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "models.Account Data \n" +
                "number=" + number + "\n" +
                ", holder='" + holder + "\n" +
                ", balance=" + balance + "\n" +
                ", withdrawLimit=" + withdrawLimit;
    }
}
