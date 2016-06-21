package com.neu.kansorn.bookshop;

import android.content.Context;
import android.os.BaseBundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by iMac12 on 6/21/2016 AD.
 */
public class BookAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] iconString, nameString, priceString;

    public BookAdapter(Context context, String[] iconString, String[] nameString, String[] priceString) {
        this.context = context;
        this.iconString = iconString;
        this.nameString = nameString;
        this.priceString = priceString;
    }//Constructor

    @Override
    public int getCount() {
        return nameString.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.book_listview, viewGroup,false);

        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView2);
        Picasso.with(context).load(iconString[i]).resize(150,180).into(imageView);

        TextView nameTextView = (TextView) view1.findViewById(R.id.textView7);
        nameTextView.setText(nameString[i]);

        TextView pireceTextView = (TextView) view1.findViewById(R.id.textView8);
        pireceTextView.setText(priceString[i]);

        return view1;
    }
}//Main Class
