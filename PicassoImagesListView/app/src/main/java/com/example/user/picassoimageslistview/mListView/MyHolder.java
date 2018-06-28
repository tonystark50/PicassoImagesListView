package com.example.user.picassoimageslistview.mListView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.picassoimageslistview.R;


public class MyHolder {

    TextView nameTxt;
    ImageView img;

    public MyHolder(View v) {

        nameTxt= (TextView) v.findViewById(R.id.nameTxt);
        img= (ImageView) v.findViewById(R.id.movieImage);

    }
}
