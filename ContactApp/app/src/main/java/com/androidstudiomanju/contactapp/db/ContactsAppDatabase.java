package com.androidstudiomanju.contactapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.androidstudiomanju.contactapp.db.entity.Contact;
import com.androidstudiomanju.contactapp.db.entity.ContactDAO;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    // Linking DAO with our Database
    public abstract ContactDAO getContactDAO();
}
