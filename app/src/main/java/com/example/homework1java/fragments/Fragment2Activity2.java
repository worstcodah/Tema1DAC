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


public class Fragment2Activity2 extends Fragment {

    Button button1, button2, button3;
    IActivity2FragmentCommunication activity2FragmentCommunication;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_activity2, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);


        button1.setOnClickListener(v -> activity2FragmentCommunication.replaceF1A2WithF3A2());


        button2.setOnClickListener(v -> activity2FragmentCommunication.goBackToF1A2());

        button3.setOnClickListener(new View.OnClickListener() {

            public void onBackPressed() {
                if (getActivity() != null) {
                    getActivity().finish();
                }

            }


            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof IActivity2FragmentCommunication) {
            activity2FragmentCommunication = (IActivity2FragmentCommunication) context;
        }
    }


}