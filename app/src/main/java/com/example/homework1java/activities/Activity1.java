package com.example.homework1java.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework1java.R;
import com.example.homework1java.interfaces.Activity1FragmentCommunication;

public class Activity1 extends AppCompatActivity implements Activity1FragmentCommunication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public void openSecondActivity() {
        Intent in = new Intent(this, Activity2.class);
        startActivity(in);
    }


}