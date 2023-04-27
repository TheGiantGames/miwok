package com.example.miwok;

import android.view.View;
import android.widget.ImageView;

public class word {

    private String mDefaultTranslation ;
     private String mMiwokTranslation ;
     private int mimageView = has_no_image;
     private int maudio ;

     private final static int has_no_image = -1;

    public word (String DefaultTranslation , String MiwokTranslation , int audio  ){
        mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation = MiwokTranslation;
        maudio = audio;
    }

     public word (String DefaultTranslation , String MiwokTranslation  , int imageView , int audio){
         mDefaultTranslation = DefaultTranslation ;
         mMiwokTranslation = MiwokTranslation;
         mimageView = imageView;
         maudio  = audio ;
     }


     public String getDefaultTranslation () {
         return mDefaultTranslation;
     }

     public String getMiwokTranslation (){
         return mMiwokTranslation ;
     }

     public int getImageView () {return mimageView;}

    public boolean hasImage(){
        return mimageView != has_no_image;
    }

    public  int getAudio() {return maudio ;}


}
