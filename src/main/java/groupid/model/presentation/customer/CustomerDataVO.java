package groupid.model.presentation.customer;

import groupid.model.presentation.common.ResultDataVO;

public class CustomerDataVO extends ResultDataVO {

        private CustomerInfoVO result;

    public CustomerInfoVO getResult() {
        return result;
    }

    public void setResult(CustomerInfoVO result) {
        this.result = result;
    }
}

