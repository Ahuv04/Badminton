package com.example.badminton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class single_double extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_double);
    }

    public void single(View view) {
        Intent i=new Intent(getApplicationContext(),Single.class);
        startActivity(i);
    }

    public void doubles(View view) {
        Intent i=new Intent(getApplicationContext(),Double.class);
        startActivity(i);
    }
}
