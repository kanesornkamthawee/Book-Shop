package com.neu.kansorn.bookshop;

import android.content.Context;
import android.os.StrictMode;

/**
 * Created by iMac12 on 6/21/2016 AD.
 */
public class BookAdapter {

    //Explicit
    private Context context;
    private String[] iconString, nameString, priceString;

    public BookAdapter(Context context, String[] iconString, String[] nameString, String[] priceString) {
        this.context = context;
        this.iconString = iconString;
        this.nameString = nameString;
        this.priceString = priceString;
    }//Constructor

}//Main Class
