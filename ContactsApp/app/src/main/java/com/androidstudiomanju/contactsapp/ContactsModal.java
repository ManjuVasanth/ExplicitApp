package com.androidstudiomanju.contactsapp;

public class ContactsModal {
    private String contactName;
    private int contactImage;
    private String contactNumber;

    public ContactsModal(String contactName, int contactImage, String contactNumber) {
        this.contactName = contactName;
        this.contactImage = contactImage;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public int getContactImage() {
        return contactImage;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
