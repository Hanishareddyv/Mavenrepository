package groupid.model.presentation.customer;

import groupid.model.presentation.common.ResultDataVO;

/**
 *
 * @author maps
 */
public class AccountsDataVO extends ResultDataVO {
    
    /**
     * Accounts Array returned as a result for the service query.
     */
        private AccountVO[] result;
    
    //private Account[] beneficiaryFamilies;
        private FamilyVO[] families;

    public FamilyVO[] getFamilies() {
        return families;
    }

    public void setFamilies(FamilyVO[] families) {
        this.families = families;
    }

    /**
     * Constructor
     */
    public AccountsDataVO() {
    }

    /**
     * @return the result
     */
    public AccountVO[] getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(AccountVO[] result) {
        this.result = result;
    }
    
    
    
}
