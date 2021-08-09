package groupid.model.presentation.common;

import org.appverse.web.framework.backend.api.model.presentation.AbstractPresentationBean;

public class ResultDataVO extends AbstractPresentationBean{



    /**
     * The error returned for this Result Data. Code is 0 if result is returned with success
     */
        private ErrorVO error;

    /**
     * Constructor
     */
    public ResultDataVO(){

    }

    /**
     * @return the error
     */
    public ErrorVO getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(ErrorVO error) {
        this.error = error;
    }


}
