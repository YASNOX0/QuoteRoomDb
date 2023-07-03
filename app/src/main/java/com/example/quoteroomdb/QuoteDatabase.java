package com.example.quoteroomdb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Quote.class} , version = 1 , exportSchema = true)
public abstract class QuoteDatabase extends RoomDatabase {
    public static QuoteDatabase instance;

    public abstract QuoteDao quoteDao();

    public static synchronized QuoteDatabase newInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context , QuoteDatabase.class , "quoteDb").allowMainThreadQueries().build();
        }
        return instance;
    }
}
