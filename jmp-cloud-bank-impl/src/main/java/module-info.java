import bank.Bank;

module jmp.cloud.bank.impl {

    requires transitive jmp.bank.api;
    requires jmp.dto;
    exports impl;
    provides Bank with impl.BankCloudImpl;
}