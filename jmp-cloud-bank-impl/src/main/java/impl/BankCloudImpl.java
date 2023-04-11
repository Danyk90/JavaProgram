package impl;

import bank.Bank;
import org.epam.homework.dto.*;

import java.util.UUID;

public class BankCloudImpl implements Bank {


    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {

        String accountNumber = UUID.randomUUID().toString();

        if (BankCardType.CREDIT == bankCardType) {

            return new CreditBankCard(accountNumber, user);
        } else if (BankCardType.DEBIT == bankCardType) {

            return new DebitBankCard(accountNumber, user);
        } else {

            throw new IllegalArgumentException("Unknown Bank Type");
        }
    }
}
