package org.epam.homework.dto;

import java.time.LocalDate;

public class Subscription {

    private String bankcard;
    private LocalDate startDate;

    public Subscription(String bankcard, LocalDate localDate) {
        this.bankcard = bankcard;
        this.startDate = localDate;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "bankcard='" + bankcard + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
