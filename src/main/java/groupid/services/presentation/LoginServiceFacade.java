package groupid.services.presentation;

import groupid.model.presentation.common.LoginRequestDataVO;
import groupid.model.presentation.common.ResultDataVO;
import groupid.model.presentation.common.UserDataVO;
import org.appverse.web.framework.backend.api.services.presentation.IPresentationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by MCRZ on 28/02/14.
 */

public interface LoginServiceFacade extends IPresentationService{

    UserDataVO login(LoginRequestDataVO requestData) throws Exception;
    ResultDataVO logout(HttpServletRequest req, HttpServletResponse resp) throws Exception;

}
