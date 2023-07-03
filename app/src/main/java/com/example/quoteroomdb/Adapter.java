package com.example.quoteroomdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    ArrayList<Quote> quotes;

    Context context;

    public Adapter(ArrayList<Quote> quotes , Context context) {
        this.quotes = quotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return quotes.size();
    }

    @Override
    public Object getItem(int i) {
        return quotes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_quote,viewGroup , false);
        }


        Quote quote = quotes.get(i);
        TextView tv_ItemQuote = view.findViewById(R.id.tv_ItemQuote);
        TextView tv_ItemAuthor = view.findViewById(R.id.tv_ItemAuthor);

        tv_ItemAuthor.setText(quote.getQuote());
        tv_ItemQuote.setText(quote.getQuote());
        tv_ItemAuthor.setText(quote.getAuthor());
        return view;
    }
}
