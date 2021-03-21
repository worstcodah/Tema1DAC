package com.example.homework1java.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.homework1java.R;
import com.example.homework1java.interfaces.IActivity2FragmentCommunication;


public class Fragment1Activity2 extends Fragment {


    Button fragmentButton;
    private IActivity2FragmentCommunication activity2FragmentCommunication;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_activity2, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        fragmentButton = view.findViewById(R.id.fragment1Activity2);
        fragmentButton.setOnClickListener(v -> activity2FragmentCommunication.addF2A2());
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof IActivity2FragmentCommunication) {
            activity2FragmentCommunication = (IActivity2FragmentCommunication) context;
        }
    }


}