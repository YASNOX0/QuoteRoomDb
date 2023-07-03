package com.example.quoteroomdb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Adapter adapter;
    QuoteDatabase quoteDb;
    ArrayList<Quote> quotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        quotes = new ArrayList<>();


        quoteDb = QuoteDatabase.newInstance(this);
        quoteDb.quoteDao().insertQuote(new Quote("QQQQQQQQQQQ", "GGGGGGGGG"));
        quoteDb.quoteDao().insertQuote(new Quote("dfhdsgsdfsd" , "fjkjdfgsf"));
        quoteDb.quoteDao().insertQuote(new Quote("123", "GGGGGGGGG"));
        Quote quote = new Quote("123","787872782787858");
        quoteDb.quoteDao().deleteQuote(quote);

        quoteDb.quoteDao().updateQuote(quote);

        quotes = (ArrayList<Quote>) quoteDb.quoteDao().getQuotes();

        adapter = new Adapter(quotes, this);
        listView.setAdapter(adapter);

    }


}