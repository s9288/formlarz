package com.example.jsfdemo.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Patient {

    private String firstName = "unknown";

    private String secoundName = "unknown";

    private String city = "";

    private String street = "";

    private String zipCode = "";

    private String pin = "";

    private String phoneNumber;

    private String doctorKind;

    @Size(min = 2, max = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Pattern(regexp = "[0-9]{2}-[0-9]{3}")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSecoundName() {
        return secoundName;
    }

    public void setSecoundName(String secoundName) {
        this.secoundName = secoundName;
    }

    @Pattern(regexp = "[0-9]{9}")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Pattern(regexp = "[0-9]{11}")
    public String getPin() {
        return pin;
    }

    public void setPin(String pesel) {
        this.pin = pesel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDoctorKind() {
        return doctorKind;
    }

    public void setDoctorKind(String doctorKind) {
        this.doctorKind = doctorKind;
    }

}
