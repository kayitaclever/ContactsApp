package com.rosekn.contactlist.repository

import com.rosekn.contactlist.MyContactsApp
import com.rosekn.contactlist.database.ContactDb
import com.rosekn.contactlist.model.ContactData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactDb.getDatabase(MyContactsApp.appContext)
    suspend fun saveContact(contact: ContactData) {
        withContext(Dispatchers.IO) {
            database.getContactDao().insertContact(contact)
        }
}}
