package groupid.model.presentation.common;


import java.util.List;

public class UsersDataVO extends ResultDataVO {

        private List<UserVO> result;

    // optional value, only filled in case of small business customers in certain countries
    //private SmallBusinessParticipant[] smallBusinessParticipants;

    public UsersDataVO() {
    }

    /**
     * @return the result
     */
    public List<UserVO> getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(List<UserVO> result) {
        this.result = result;
    }



}

