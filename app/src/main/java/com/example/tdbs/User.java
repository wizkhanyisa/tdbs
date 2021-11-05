package com.example.tdbs;

public class User {
    private String firstName;
    private String lastName;
    private long idNumber;
    private long cellNumber;
    private String password;
    private String email;

    public User(String firstName, String lastName, long idNumber, long cellNumber, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.cellNumber = cellNumber;
        this.password = password;
        this.email = email;
    }

}
