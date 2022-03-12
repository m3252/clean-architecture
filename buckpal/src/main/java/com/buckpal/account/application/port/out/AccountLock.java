package com.buckpal.account.application.port.out;

import com.buckpal.account.domain.AccountId;

public interface AccountLock {
    void lockAccount(AccountId accountId);
    void releaseAccount(AccountId accountId);
}
