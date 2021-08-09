package groupid.services.business;

import groupid.model.business.customer.User;
import org.springframework.security.core.Authentication;


public interface LoginService {

    public static final String DEFAULT_ANONYMOUS_USER = "anonymous";

    String getLoggedUser();

    User authenticate(Authentication authenticationToken) throws Exception;

    void logout() throws Exception;
}
