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
import com.example.homework1java.interfaces.Activity1FragmentCommunication;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Fragment1Activity1 extends Fragment {

    public Fragment1Activity1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Rename and change types of parameters
    }


    Button fragmentButton;
    private Activity1FragmentCommunication activity1FragmentCommunication;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_activity1, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fragmentButton = view.findViewById(R.id.fragmentA1);
        fragmentButton.setOnClickListener(v -> activity1FragmentCommunication.openSecondActivity());
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity1FragmentCommunication) {
            activity1FragmentCommunication = (Activity1FragmentCommunication) context;
        }
    }


}