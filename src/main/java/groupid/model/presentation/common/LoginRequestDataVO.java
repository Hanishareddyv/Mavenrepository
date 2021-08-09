package groupid.model.presentation.common;


import org.appverse.web.framework.backend.api.model.presentation.AbstractPresentationBean;
import javax.validation.constraints.NotNull;


public class LoginRequestDataVO extends AbstractPresentationBean {

    //@ApiModelProperty(value = "Credentials", required=true)
    //private String[] credentials;

    @NotNull
    private String username;

    @NotNull
    private String password;

    /**
     * Constructor
     */
    public LoginRequestDataVO() {
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

