package com.buckpal.account.application.port.out;

import com.buckpal.account.domain.Account;

public interface UpdateAccountStatePort {
    void updateActivities(Account account);
}
