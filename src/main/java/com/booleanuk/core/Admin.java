package com.booleanuk.core;

import java.util.List;

public class Admin {
    private List<Account> accounts;

    public void enableAccount(Account account) {
        account.setStatus("Enabled");
    }
}
