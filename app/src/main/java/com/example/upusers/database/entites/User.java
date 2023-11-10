package com.example.upusers.database.entites;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "Users",
        foreignKeys = {@ForeignKey(entity =
        Gender.class,
        parentColumns = "Gender_id",
        childColumns = "Gender")},
        indices = {@Index(value = "Gender")})
public class User {
    @PrimaryKey(autoGenerate = true)
    private long user_id;
    @ColumnInfo (name = "Username")
    private String Username;
    @ColumnInfo (name = "Age")
    private int Age;
    @ColumnInfo (name = "Gender")
    private int Gender;
    @ColumnInfo (name = "Birthday")
    private String Birthday;
    @ColumnInfo (name = "Phone_number")
    private String Phone_number;
    public User(){}
}
