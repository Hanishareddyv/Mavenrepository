package groupid.model.presentation.common;



public class ErrorVO {

    /**
     * Error Code for error handling. 0 for success.
     */
        private long code;

    /**
     * Error Message to be displayed
     */
        private String message;

    /**
     * Constructor
     */
    public ErrorVO(){

    }

    /**
     * @return the code
     */
    public long getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(long code) {
        this.code = code;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }



}