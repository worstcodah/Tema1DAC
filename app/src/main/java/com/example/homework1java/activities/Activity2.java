package com.example.homework1java.activities;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.homework1java.R;
import com.example.homework1java.fragments.Fragment1Activity2;
import com.example.homework1java.fragments.Fragment2Activity2;
import com.example.homework1java.fragments.Fragment3Activity2;
import com.example.homework1java.interfaces.Activity2FragmentCommunication;

public class Activity2 extends AppCompatActivity implements Activity2FragmentCommunication {


    private final String F3A2_TAG="F3A2";
    private final String F2A2_TAG="F2A2";
    private final String F1A2_TAG="F1A2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        addF1A2();


    }


    public void addF1A2() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout2, new Fragment1Activity2(), F1A2_TAG);
        fragmentTransaction.commit();

    }


    @Override
    public void onBackPressed() {
        finishAffinity();
        finish();

    }


    @Override
    public void addF2A2() {
        Button fragmentButton = findViewById(R.id.fragment1Activity2);
        fragmentButton.setOnClickListener(v -> {
            Fragment2Activity2 fragment2Activity2 = new Fragment2Activity2();

            FragmentManager fragmentManager = getSupportFragmentManager();
            assert getFragmentManager() != null;
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frameLayout2, fragment2Activity2, F2A2_TAG);


            fragmentTransaction.addToBackStack(F2A2_TAG);

            fragmentTransaction.commit();

        });
    }

    @Override
    public void replaceF1A2WithF3A2() {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout2, new Fragment3Activity2(), F3A2_TAG);


        fragmentTransaction.addToBackStack(F3A2_TAG);
        fragmentTransaction.commit();
    }

    @Override
    public void goBackToF1A2() {

        if (getSupportFragmentManager().popBackStackImmediate(F3A2_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE)) {
            getSupportFragmentManager().popBackStack(F3A2_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
        getSupportFragmentManager().popBackStack();


    }


}