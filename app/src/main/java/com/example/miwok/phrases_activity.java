package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        final ArrayList<word> phrases = new ArrayList<>();
        phrases.add(new word("Where are you going?" , "minto wuksus"  , R.raw.phrase_where_are_you_going ));
        phrases.add(new word("What is your name?" , "tinnә oyaase'nә" , R.raw.phrase_what_is_your_name));
        phrases.add(new word("My name is..." , "oyaaset..."  , R.raw.phrase_my_name_is));
        phrases.add(new word("How are you feeling?" , "michәksәs?" , R.raw.phrase_how_are_you_feeling));
        phrases.add(new word("I’m feeling good." , "kuchi achit" , R.raw.phrase_im_feeling_good ));
        phrases.add(new word("Are you coming?" , "әәnәs'aa?"   , R.raw.phrase_are_you_coming));
        phrases.add(new word("Yes, I’m coming." , "әәnәm"  , R.raw.phrase_yes_im_coming));
        phrases.add(new word("Let’s go" , "yoowutis" , R.raw.phrase_lets_go));
        phrases.add(new word("Come here." , "әnni'nem"  , R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this,phrases ,R.color.phrases_activity);
        ListView listView = (ListView) findViewById(R.id.phrases_listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word word = phrases.get(i) ;
                MediaPlayer mediaPlayer = MediaPlayer.create(phrases_activity.this , word.getAudio());
                mediaPlayer.start();
            }
        });

    }
}