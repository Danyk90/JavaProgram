package service;

import org.epam.homework.dto.BankCard;
import org.epam.homework.dto.Subscription;
import org.epam.homework.dto.User;

import java.util.List;
import java.util.Optional;

public interface Service {

   static boolean isEighteenYrsOld() {
       return false;
   }
    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String number);

    List<User> getAllUsers();

}
