package com.rosekn.contactlist.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rosekn.contactlist.model.ContactData

@Database(entities = arrayOf(ContactData::class), version = 1)
abstract class ContactDb: RoomDatabase() {
    abstract fun getContactDao(): ContactDao

    companion object {
        private var database: ContactDb? = null
        fun getDatabase(context: Context): ContactDb {
            if (database == null) {
                database = Room.databaseBuilder(
                    context,
                    ContactDb::class.java, "contactsDb"
                )
                    .fallbackToDestructiveMigration().build()
            }
            return database as ContactDb
        }
    }
}