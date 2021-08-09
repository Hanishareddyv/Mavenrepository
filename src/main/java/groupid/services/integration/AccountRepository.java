package groupid.services.integration;

import groupid.model.integration.jpa.AccountDTO;
import org.appverse.web.framework.backend.persistence.services.integration.IJPAPersistenceService;

import java.util.List;

/**
 * Created by MCRZ on 6/03/14.
 */
public interface AccountRepository extends IJPAPersistenceService<AccountDTO> {

    static final String CREDIT_CARDS_CODE = "CREDIT_CARDS";

    List<AccountDTO> loadAccountsByUsername(String username) throws Exception;
    List<AccountDTO> loadAccountsByOperationAndTypeAndUsername(String accountType,String username) throws Exception;
    AccountDTO loadAccountsByAccountNumber(String accountNumber) throws Exception;
}
