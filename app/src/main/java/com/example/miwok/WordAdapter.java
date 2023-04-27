package com.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {




    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mColor ;

    public WordAdapter (Activity context , ArrayList<word>  words , int Color ) {
        super(context , 0 , words);
        mColor = Color;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View ListItemView = convertView ;
        if (ListItemView ==null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_layout , parent , false);
        }

        word word = getItem(position);

        TextView eng = (TextView) ListItemView.findViewById(R.id.english_textview);
        eng.setText(word.getDefaultTranslation());

        TextView miwok =(TextView) ListItemView.findViewById(R.id.miwok_textview);
        miwok.setText(word.getMiwokTranslation());

        ImageView imageView = (ImageView) ListItemView.findViewById(R.id.imageview);
        if (word.hasImage()){

            imageView.setImageResource(word.getImageView());
        }
        else {
            imageView.setVisibility(View.GONE);
        }



        View textContainer = ListItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext() , mColor);
        textContainer.setBackgroundColor(color);




        return ListItemView;


    }
}
