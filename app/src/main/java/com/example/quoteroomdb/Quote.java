package com.example.quoteroomdb;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "quotes")
public class Quote {


    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "quote")
    private String quote;

    @ColumnInfo(name = "author")
    private String author;

    @NonNull
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

}
