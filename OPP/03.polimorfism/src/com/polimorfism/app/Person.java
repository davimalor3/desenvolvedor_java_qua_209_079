package com.polimorfism.app;

abstract public class Person {
    public String email;
    public String tel;
    public String address;
    
    //constructor
    public Person(String email, String tel, String address) {
        // atributes
        this.email = email;
        this.tel = tel;
        this.address = address;
    }

    public String hello(){
        return null;
    }
 
    
}
