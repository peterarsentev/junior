package ru.job4j.inheritance;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(100);
        account.addMoney(50);
    }
}
