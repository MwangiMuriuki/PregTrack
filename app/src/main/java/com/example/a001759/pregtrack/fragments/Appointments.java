package com.example.a001759.pregtrack.fragments;


import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;

import com.example.a001759.pregtrack.activities.CreateAppointment;
import com.example.a001759.pregtrack.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Appointments extends Fragment {


    public Appointments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_appointments, container, false);

        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Create new Appointment?", Snackbar.LENGTH_LONG)
//                        .setAction("Create", null).show();

                Intent intent = new Intent(getContext(), CreateAppointment.class);
                startActivity(intent);

                Toast.makeText(getContext(), "Creating a new Appointment", Toast.LENGTH_LONG).show();
            }
        });

        return v;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("My Appointments");
    }

}
