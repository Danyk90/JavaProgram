package bank;

import org.epam.homework.dto.BankCard;
import org.epam.homework.dto.BankCardType;
import org.epam.homework.dto.User;

public interface Bank {

    BankCard createBankCard(User user, BankCardType bankCardType);
}
