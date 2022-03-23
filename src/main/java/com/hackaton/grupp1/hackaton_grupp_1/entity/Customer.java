package com.hackaton.grupp1.hackaton_grupp_1.entity;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String county;
    private String email;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String county, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.county = county;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
