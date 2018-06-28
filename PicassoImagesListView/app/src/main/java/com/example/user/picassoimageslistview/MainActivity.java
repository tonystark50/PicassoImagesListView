package com.example.user.picassoimageslistview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.user.picassoimageslistview.R;
import com.example.user.picassoimageslistview.mData.TVShowsCollection;
import com.example.user.picassoimageslistview.mListView.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        lv= (ListView) findViewById(R.id.lv);
        adapter=new CustomAdapter(this, TVShowsCollection.getTVShows());


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               lv.setAdapter(adapter);
            }
        });
    }



}
