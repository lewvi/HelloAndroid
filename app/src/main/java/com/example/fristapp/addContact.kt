package com.example.fristapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "addcontact_table")
data class addContact(@PrimaryKey @ColumnInfo(name = "add") val add: String)

    /*@PrimaryKey(autoGenerate = true)
    private var id:Int = 0
    private var names: String? = null
    private var emails: String? = null


    fun Note(name: String?, email: String?) {
        this.names = name
        this.emails = emails
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getId(): Int {
        return id
    }

    fun getName(): String? {
        return names
    }

    fun getEmail(): String? {
        return emails
    }*/

