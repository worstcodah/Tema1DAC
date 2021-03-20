package com.example.homework1java.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.homework1java.R;
import com.example.homework1java.interfaces.Activity1FragmentCommunication;

public class MainActivity extends AppCompatActivity implements Activity1FragmentCommunication {

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