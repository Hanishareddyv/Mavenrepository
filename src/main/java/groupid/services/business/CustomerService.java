package groupid.services.business;

import groupid.model.business.customer.AccountsData;
import groupid.model.business.customer.AccountsRequestData;
import groupid.model.business.customer.User;

/**
 * Created by MCRZ on 10/03/14.
 */
public interface CustomerService {

    User getUserInfo(String username)throws Exception ;
    User updateUserInfo(String username, User user)throws Exception ;
    AccountsData getGlobalPosition(String username)throws Exception ;
    AccountsData getAccounts(AccountsRequestData request, String username)throws Exception;
    AccountsData getCreditCards(String username) throws  Exception;
}
