package service;

import org.epam.homework.dto.BankCard;
import org.epam.homework.dto.Subscription;
import org.epam.homework.dto.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface Service {

   static boolean isEighteenYrsOld() {
       return false;
   }
    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String number);

    List<User> getAllUsers();

    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> predicate);

    static boolean isPayable(User user) {

        return user.getBirthday().isBefore(LocalDate.now().minusYears(18));
    }
    default double getAverageUserAge() {

        return getAllUsers()
                .stream()
                .mapToDouble(value -> value.getBirthday().toEpochDay())
                .average()
                .orElse(0);

    }

}
