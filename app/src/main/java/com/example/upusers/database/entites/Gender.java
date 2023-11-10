package com.example.upusers.database.entites;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Genders")

public class Gender {
    @PrimaryKey (autoGenerate = true)
    private long Gender_id;
    @ColumnInfo(name = "Gender_name")
    private String Gender_name;
    public Gender() {}
}
