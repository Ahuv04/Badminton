package com.example.badminton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Double extends AppCompatActivity {

    public String score,winner1,winner2,loser1,loser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);
    }

    public void submit(View view) {
        score=((EditText) findViewById(R.id.score)).getText().toString();
        winner1=((EditText) findViewById(R.id.winner1)).getText().toString();
        winner2=((EditText) findViewById(R.id.winner2)).getText().toString();
        loser1=((EditText) findViewById(R.id.loser1)).getText().toString();
        loser2=((EditText) findViewById(R.id.loser2)).getText().toString();


    }

    public void discard(View v)
    {   Intent i= new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
