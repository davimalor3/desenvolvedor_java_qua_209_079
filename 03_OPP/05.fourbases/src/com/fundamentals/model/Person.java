package com.fundamentals.model;

// "abstract" used to block new stance
abstract public class Person {
    // atributes
    private String email;
    private String tel;
    private String address;

    
    // constructor
    public Person(String email, String tel, String address) {
        this.email = email;
        this.tel = tel;
        this.address = address;
    }


    // Getters and Setters
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
