package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    private static final double LIMIT_LOW = 0;
    private static final double LIMIT_HIGH = 10_000_000;
    private static final double LIMIT_WITHDRAWAL = 30_000;

    public DebitAccount(int accountId, Customer customer, double balance) {
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(balance);
    }

    public DebitAccount(int accountId, Customer customer) {
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(0);
    }

    @Override
    public boolean withdrawal(double amount) {
        if (amount > getBalance()) {
            System.out.println("Недостаточно средств. Операция отклонена! " + this.toString());
            return false;
        }
        if (amount > DebitAccount.LIMIT_WITHDRAWAL) {
            System.out.println("Превышен лимит снятия средств. Операция отклонена! " + this.toString());
            return false;
        }
        if (getBalance() - amount < DebitAccount.LIMIT_LOW) {
            System.out.println("Снятие уменьшит остаток ниже лимита. Операция отклонена! " + this.toString());
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }

    @Override
    public boolean putMoney(double amount) {
        if (getBalance() + amount > DebitAccount.LIMIT_HIGH) {
            System.out.println("Превышен лимит средств на счете. Операция отклонена! " + this.toString());
            return false;
        }
        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public String toString() {
        return "Debit" + super.toString();
    }
}
