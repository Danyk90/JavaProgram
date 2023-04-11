package org.epam.application;

import impl.BankCloudImpl;
import org.epam.homework.dto.BankCardType;
import org.epam.homework.dto.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        var user = new User("Danial", "Kayani", LocalDate.of(1999, 12, 7));
        var bank = new BankCloudImpl();
        bank.createBankCard(user, BankCardType.CREDIT);
    }
}