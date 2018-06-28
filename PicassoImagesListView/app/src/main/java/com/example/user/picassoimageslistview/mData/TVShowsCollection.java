package com.example.user.picassoimageslistview.mData;

import java.util.ArrayList;


public class TVShowsCollection {


    public static ArrayList<com.example.user.picassoimageslistview.mData.TVShow> getTVShows()
    {
        ArrayList<com.example.user.picassoimageslistview.mData.TVShow> tvshows=new ArrayList<>();

        com.example.user.picassoimageslistview.mData.TVShow tv=new com.example.user.picassoimageslistview.mData.TVShow();

        //ADDING DATA
        tv.setName("Image 1");
        tv.setUrl("https://source.unsplash.com/collection/190727/500x300");
        tvshows.add(tv);

        tv=new com.example.user.picassoimageslistview.mData.TVShow();
        tv.setName("Image 2");
        tv.setUrl("https://source.unsplash.com/collection/190728/500x300");
        tvshows.add(tv);

        tv=new com.example.user.picassoimageslistview.mData.TVShow();
        tv.setName("Image 3");
        tv.setUrl("https://source.unsplash.com/collection/190739/500x300");
        tvshows.add(tv);

        tv=new com.example.user.picassoimageslistview.mData.TVShow();
        tv.setName("Image 4");
        tv.setUrl("https://source.unsplash.com/collection/190751/500x300");
        tvshows.add(tv);

        tv=new com.example.user.picassoimageslistview.mData.TVShow();
        tv.setName("Image 5");
        tv.setUrl("https://source.unsplash.com/collection/190742/500x300");
        tvshows.add(tv);

        tv=new com.example.user.picassoimageslistview.mData.TVShow();
        tv.setName("Image 6");
        tv.setUrl("https://source.unsplash.com/collection/190737/500x300");
        tvshows.add(tv);

        tv=new com.example.user.picassoimageslistview.mData.TVShow();
        tv.setName("Image 7");
        tv.setUrl("https://source.unsplash.com/collection/190747/500x300");
        tvshows.add(tv);





        return tvshows;
    }

}
