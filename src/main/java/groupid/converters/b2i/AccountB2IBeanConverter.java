package groupid.converters.b2i;

import groupid.model.business.customer.Account;
import groupid.model.integration.jpa.AccountDTO;
import org.appverse.web.framework.backend.api.converters.AbstractDozerB2IBeanConverter;
import org.springframework.stereotype.Component;

/**
 * Created by MCRZ on 10/03/14.
 */
@Component("accountB2IBeanConverter")
public class AccountB2IBeanConverter extends
        AbstractDozerB2IBeanConverter<Account,AccountDTO> {

    public AccountB2IBeanConverter() {
        setScopes("account-b2i-complete", "account-b2i-without-dependencies");
        setBeanClasses(Account.class,AccountDTO.class);
    }
}
