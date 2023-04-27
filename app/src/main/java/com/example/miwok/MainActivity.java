package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers_textview);
        TextView colour = (TextView) findViewById(R.id.colours_textView);
        TextView phrases = (TextView) findViewById(R.id.phrases_textView);
        TextView familyMembers = (TextView) findViewById(R.id.family_members_textview);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , number_activity.class);
                startActivity(intent);
            }
        });

        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , colours_activity.class);
                startActivity(intent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , phrases_activity.class);
                startActivity(intent);
            }
        });

        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , family_members_activity.class) ;
                startActivity(intent);
            }
        });







    }





}