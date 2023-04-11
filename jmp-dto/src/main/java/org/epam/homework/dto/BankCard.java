package org.epam.homework.dto;

import java.io.Serializable;

public class BankCard {

    private String number;
    private User user;


    BankCard(String userName, User user) {

        number = userName;
        this.user = user;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "number='" + number + '\'' +
                ", user=" + user +
                '}';
    }
}
