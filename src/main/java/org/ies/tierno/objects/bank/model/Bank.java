package org.ies.tierno.objects.bank.model;

import java.util.Arrays;
import java.util.Objects;

public class Bank {
    private String bankName;
    private Account[] accounts;

    public Bank(String bankName, Account[] accounts) {
        this.bankName = bankName;
        this.accounts = accounts;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(bankName, bank.bankName) && Objects.deepEquals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, Arrays.hashCode(accounts));
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
