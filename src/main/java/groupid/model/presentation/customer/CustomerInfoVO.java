package groupid.model.presentation.customer;

import groupid.model.presentation.common.UserVO;

import javax.validation.constraints.Pattern;

public class CustomerInfoVO extends UserVO{

        private String email;

        @Pattern(message="valid idCard please" , regexp="^[0-9]{8}([a-zA-Z]{1})$")
    private String idCard;

        private String address;

        @Pattern(message="valid phone number please" , regexp="^[+]?[0-9]*$")
    private String mobileNumber;

        @Pattern(message="valid phone number please" , regexp="^[+]?[0-9]*$")
    private String phoneNumber;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
