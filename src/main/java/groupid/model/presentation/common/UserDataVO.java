package groupid.model.presentation.common;


public class UserDataVO extends ResultDataVO {

        private UserVO result;

    // optional value, only filled in case of small business customers in certain countries
    //private SmallBusinessParticipant[] smallBusinessParticipants;

    public UserDataVO() {
    }

    /**
     * @return the result
     */
    public UserVO getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(UserVO result) {
        this.result = result;
    }

    /**
     * @return the smallBusinessParticipants
     */
    /*public SmallBusinessParticipant[] getSmallBusinessParticipants() {
        return smallBusinessParticipants;
    }*/

    /**
     * @param smallBusinessParticipants the smallBusinessParticipants to set
     */
    /*public void setSmallBusinessParticipants(SmallBusinessParticipant[] smallBusinessParticipants) {
        this.smallBusinessParticipants = smallBusinessParticipants;
    }*/


}

