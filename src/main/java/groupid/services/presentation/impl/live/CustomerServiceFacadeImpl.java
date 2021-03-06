/*
 Copyright (c) 2012 GFT Appverse, S.L., Sociedad Unipersonal.

 This Source Code Form is subject to the terms of the Appverse Public License
 Version 2.0 (“APL v2.0”). If a copy of the APL was not distributed with this
 file, You can obtain one at http://www.appverse.mobi/licenses/apl_v2.0.pdf. [^]

 Redistribution and use in source and binary forms, with or without modification,
 are permitted provided that the conditions of the AppVerse Public License v2.0
 are met.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. EXCEPT IN CASE OF WILLFUL MISCONDUCT OR GROSS NEGLIGENCE, IN NO EVENT
 SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT(INCLUDING NEGLIGENCE OR OTHERWISE)
 ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.
 */
package groupid.services.presentation.impl.live;

import groupid.converters.p2b.AccountsP2BBeanConverter;
import groupid.converters.p2b.CustomerInfoP2BBeanConverter;
import groupid.helpers.ErrorCodes;
import groupid.model.business.customer.AccountsData;
import groupid.model.business.customer.User;
import groupid.model.presentation.customer.AccountsDataVO;
import groupid.model.presentation.customer.CustomerDataVO;
import groupid.model.presentation.customer.CustomerInfoVO;
import groupid.services.business.CustomerService;
import groupid.services.business.LoginService;
import groupid.services.presentation.CustomerServiceFacade;
import org.appverse.web.framework.backend.api.helpers.log.AutowiredLogger;
import org.appverse.web.framework.backend.api.services.presentation.AbstractPresentationService;
import org.appverse.web.framework.backend.api.services.presentation.PresentationException;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Service
@Singleton
public class CustomerServiceFacadeImpl extends AbstractPresentationService implements CustomerServiceFacade {


    @AutowiredLogger
    private static Logger logger;

    @Autowired
    protected ErrorCodes errorCodes;

    @Autowired
    protected LoginService loginService;

    @Autowired
    protected CustomerService customerService;

    @Autowired
    protected AccountsP2BBeanConverter accountsP2BBeanConverter;

    @Autowired
    protected CustomerInfoP2BBeanConverter customerInfoP2BBeanConverter;


    //secure/customer/customerinfo
        @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerDataVO getCustomerInfo() throws Exception{
        String username = loginService.getLoggedUser();
        CustomerInfoVO customerInfoVO = new CustomerInfoVO();
        if(username == null) {
            throw new PresentationException(ErrorCodes.ERROR_CODE_session_required);
        }
        //service call
        User userInfo = customerService.getUserInfo(username);
        customerInfoVO = customerInfoP2BBeanConverter.convert(userInfo);

        CustomerDataVO result = new CustomerDataVO();
        result.setResult(customerInfoVO);
        result.setError(errorCodes.getErrorVO(ErrorCodes.SUCCESS_CODE));
        return result;
    }
        @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerDataVO saveCustomerInfo(CustomerInfoVO customerInfoVO) throws Exception{
        String username = loginService.getLoggedUser();
        if(username == null) {
            throw new PresentationException(ErrorCodes.ERROR_CODE_session_required);
        }
        //service call
        User userInfo = customerInfoP2BBeanConverter.convert(customerInfoVO);
        User userInfoUpdated = customerService.updateUserInfo(username,userInfo);
        customerInfoVO = customerInfoP2BBeanConverter.convert(userInfoUpdated);

        CustomerDataVO result = new CustomerDataVO();
        result.setResult(customerInfoVO);
        result.setError(errorCodes.getErrorVO(ErrorCodes.SUCCESS_CODE));
        return result;
    }

    //secure/customer/globalpos
        @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AccountsDataVO globalPosition() throws Exception{
        String username = loginService.getLoggedUser();
        AccountsDataVO globalVO = new AccountsDataVO();
        if(username == null) {
            throw new PresentationException(ErrorCodes.ERROR_CODE_session_required);
        }
        //service call
        AccountsData accounts = customerService.getGlobalPosition(username);
        globalVO = accountsP2BBeanConverter.convert(accounts);

        return globalVO;
    }


}
