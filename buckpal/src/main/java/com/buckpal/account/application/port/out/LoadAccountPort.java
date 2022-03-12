package com.buckpal.account.application.port.out;

import com.buckpal.account.domain.Account;
import com.buckpal.account.domain.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {
    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
