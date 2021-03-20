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
 * Use the {@link Fragment1Activity1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1Activity1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public Fragment1Activity1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1Activity1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1Activity1 newInstance(String param1, String param2) {
        Fragment1Activity1 fragment = new Fragment1Activity1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
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
        super.onViewCreated(view,savedInstanceState);

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