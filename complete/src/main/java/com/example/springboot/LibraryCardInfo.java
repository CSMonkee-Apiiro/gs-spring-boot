package com.example.springboot;

public class LibraryCardInfo {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private Date validUntil;

    public LibraryCardInfo(String firstName, String lastName, String cardNumber, Date validUntil) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.validUntil = validUntil;
    }
}
