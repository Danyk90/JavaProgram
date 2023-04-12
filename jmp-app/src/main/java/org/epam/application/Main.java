package org.epam.application;

import impl.BankCloudImpl;

import serviceImpl.CloudServiceImpl;
import org.epam.homework.dto.BankCardType;
import org.epam.homework.dto.Subscription;
import org.epam.homework.dto.User;

import java.time.LocalDate;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        var user = new User("Danial", "Kayani", LocalDate.of(1999, 12, 7));
        var bank = new BankCloudImpl();
        var service = new CloudServiceImpl();
        var bankCard = bank.createBankCard(user, BankCardType.CREDIT);
        service.subscribe(bankCard);
        Optional<Subscription> subscriptionByCard = service.getSubscriptionByBankCardNumber(bankCard.getNumber());
        subscriptionByCard.ifPresent(System.out::println);

    }
}