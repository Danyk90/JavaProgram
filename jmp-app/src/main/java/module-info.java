
module jmp.app {

    requires jmp.dto;
    requires jmp.bank.api;
    requires jmp.cloud.bank.impl;
    uses impl.BankCloudImpl;
}