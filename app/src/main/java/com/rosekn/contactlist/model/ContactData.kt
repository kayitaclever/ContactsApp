package com.rosekn.contactlist.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")

data class ContactData(
  @PrimaryKey(autoGenerate = true)  var contactId: Int,
    var avatar:String,
    var name:String,
    var number:String,
    var email:String,
)
