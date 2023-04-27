package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class number_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

       final ArrayList<word> words = new ArrayList<>();
        words.add(new word("One" , "lutti"  , R.drawable.ic_launcher_background , R.raw.number_one) );
        words.add(new word("Two" , "otiiko"  , R.drawable.ic_launcher_background , R.raw.number_two) );
        words.add(new word("Three" , "tolookosu" , R.drawable.ic_launcher_background , R.raw.number_three)  );
        words.add(new word("Four" , "oyyisa" , R.drawable.ic_launcher_background , R.raw.number_four)   );
        words.add(new word("Five" , "massokka" , R.drawable.ic_launcher_background ,R.raw.number_five) );
        words.add(new word("Six" , "temmokka" , R.drawable.ic_launcher_background  , R.raw.number_six) );
        words.add(new word("Seven" , "kenekaku" , R.drawable.ic_launcher_background , R.raw.number_seven) );
        words.add(new word("Eight" , "kawinta" , R.drawable.ic_launcher_background , R.raw.number_eight) );
        words.add(new word("Nine" , "wo'e" , R.drawable.ic_launcher_background , R.raw.number_nine) );
        words.add(new word("Ten" , "na'aacha" , R.drawable.ic_launcher_background , R.raw.number_ten) );


        WordAdapter adapter = new WordAdapter(this , words , R.color.number_actvity);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word word = words.get(i);
                MediaPlayer mediaPlayer = MediaPlayer.create(number_activity.this , word.getAudio());
                mediaPlayer.start();
            }
        });


    }
}