package serviceImpl;

import org.epam.homework.dto.BankCard;
import org.epam.homework.dto.Subscription;
import org.epam.homework.dto.User;
import service.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CloudServiceImpl implements Service {

    private final Map<User, List<Subscription>> userStorage = new HashMap<>();

    @Override
    public void subscribe(BankCard bankCard) {

        var user = bankCard.getUser();
        var number = bankCard.getNumber();
        var subscription = new Subscription(number, LocalDate.now());
        userStorage.computeIfAbsent(user, u -> new LinkedList<>()).add(subscription);
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String number) {

        return userStorage.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(s -> s.getBankcard().equals(number))
                .findFirst();

    }

    @Override
    public List<User> getAllUsers() {

        return new ArrayList<>(userStorage.keySet());
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> predicate) {

        return userStorage.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
