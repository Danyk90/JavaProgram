import bank.Bank;

module jmp.app {

    requires jmp.cloud.bank.impl;
    requires jmp.cloud.service.impl;
    requires jmp.dto;
    uses impl.BankCloudImpl;
}