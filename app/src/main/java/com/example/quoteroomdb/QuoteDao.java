package com.example.quoteroomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface QuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertQuote(Quote quote);

    @Query("select * from quotes")
    List<Quote> getQuotes();
    @Update
    void updateQuote(Quote quote);

    @Delete
    void deleteQuote(Quote quote);
}
