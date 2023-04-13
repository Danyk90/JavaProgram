package org.epam.application;

import impl.BankCloudImpl;
import org.epam.application.exception.SubscriptionException;
import org.epam.homework.dto.BankCardType;
import org.epam.homework.dto.Subscription;
import org.epam.homework.dto.User;
import serviceImpl.CloudServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        var user = new User("Danial", "Kayani", LocalDate.of(1999, 12, 7));
        var user2 = new User("Sherry", "k", LocalDate.of(1996, 12, 7));
        var bank = new BankCloudImpl();
        var service = new CloudServiceImpl();
        var bankCard = bank.createBankCard(user, BankCardType.CREDIT);
        var bankCard2 = bank.createBankCard(user2, BankCardType.CREDIT);
        service.subscribe(bankCard);
        service.subscribe(bankCard2);

        Subscription subscriptionByCard = service
                .getSubscriptionByBankCardNumber(bankCard.getNumber())
                .orElseThrow(()->new SubscriptionException("Subscription not found"));

        System.out.println(subscriptionByCard);
        //returning avg number of user age in days
        System.out.println(service.getAverageUserAge());
        //finding all subscription based on provided filter
        List<Subscription> subscriptionList = service
                .getAllSubscriptionsByCondition(subscription ->
                        subscription.getStartDate().isEqual(LocalDate.now()));
        System.out.println(subscriptionList);
    }
}