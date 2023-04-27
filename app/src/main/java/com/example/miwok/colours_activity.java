package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class colours_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        final ArrayList<word> colours = new ArrayList<>();
        colours.add(new word("Red" , "wetetti" , R.drawable.ic_launcher_background , R.raw.color_red ));
        colours.add(new word("green" , "chokokki" , R.drawable.ic_launcher_background , R.raw.color_green));
        colours.add(new word("brown" , "takaakki"  , R.drawable.ic_launcher_background  , R.raw.color_brown));
        colours.add(new word("gray" , "topoppi"  , R.drawable.ic_launcher_background ,R.raw.color_gray));
        colours.add(new word("black" , "kululli"  , R.drawable.ic_launcher_background , R.raw.color_black));
        colours.add(new word("white" , "kekelli"  , R.drawable.ic_launcher_background , R.raw.color_white));
        colours.add(new word("dusty yellow" , "ṭopiisә"  , R.drawable.ic_launcher_background , R.raw.color_dusty_yellow));
        colours.add(new word("mustard yellow" , "chiwiiṭә"  , R.drawable.ic_launcher_background ,R.raw.color_mustard_yellow));



        WordAdapter adapter = new WordAdapter(this,colours ,R.color.color_activity);
        ListView listView = (ListView) findViewById(R.id.colours_listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word word = colours.get(i) ;
                MediaPlayer mediaPlayer = MediaPlayer.create(colours_activity.this , word.getAudio());
                mediaPlayer.start();
            }
        });

    }
}