package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class family_members_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        final ArrayList<word> family = new ArrayList<>();
        family.add(new word("father" , "әpә" , R.drawable.ic_launcher_background , R.raw.family_father));
        family.add(new word("mother" , "әṭa" , R.drawable.ic_launcher_background,R.raw.family_mother));
        family.add(new word("son" , "angsi", R.drawable.ic_launcher_background, R.raw.family_son));
        family.add(new word("daughter" , "tune", R.drawable.ic_launcher_background , R.raw.family_daughter));
        family.add(new word("older brother" , "taachi", R.drawable.ic_launcher_background,R.raw.family_older_brother));
        family.add(new word("younger brother", "chalitti", R.drawable.ic_launcher_background , R.raw.family_younger_brother));
        family.add(new word("older sister", "teṭe", R.drawable.ic_launcher_background ,R.raw.family_older_sister));
        family.add(new word("younger sister", "kolliti", R.drawable.ic_launcher_background , R.raw.family_younger_sister));
        family.add(new word("grandmother" , "ama", R.drawable.ic_launcher_background , R.raw.family_grandmother));
        family.add(new word("grandfather" , "paapa", R.drawable.ic_launcher_background , R.raw.family_grandfather));

        WordAdapter wordAdapter = new WordAdapter(this,family , R.color.family_activity);
        ListView listView = (ListView) findViewById(R.id.family_listview);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word word = family.get(i) ;
                MediaPlayer mediaPlayer = MediaPlayer.create(family_members_activity.this , word.getAudio());
                mediaPlayer.start();
            }
        });


    }
}