package groupid.model.presentation.common;



public class AuthDataVO extends ResultDataVO {

    /**
     * A token (random number or seed) that will be passed to the client (to be used on the authentication security tasks)
     * This token has a predefined expiration time.
     */
        private String seed;

    /**
     * An array containing the positions to use to create the buttons for a virtual keyboard.
     */
        private String[] virtualKeyboardPosition;

    /**
     * Constructor.
     */
    public AuthDataVO() {
    }

    /**
     * @return the seed
     */
    public String getSeed() {
        return seed;
    }

    /**
     * @param seed the seed to set
     */
    public void setSeed(String seed) {
        this.seed = seed;
    }

    /**
     * @return the virtualKeyboardPosition
     */
    public String[] getVirtualKeyboardPosition() {
        return virtualKeyboardPosition;
    }

    /**
     * @param virtualKeyboardPosition the virtualKeyboardPosition to set
     */
    public void setVirtualKeyboardPosition(String[] virtualKeyboardPosition) {
        this.virtualKeyboardPosition = virtualKeyboardPosition;
    }



}
