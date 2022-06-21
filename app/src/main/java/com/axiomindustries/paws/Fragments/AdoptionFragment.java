package com.axiomindustries.paws.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.axiomindustries.paws.R;
import com.axiomindustries.paws.Views.BreedsActivity;

public class AdoptionFragment extends Fragment {

    public AdoptionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        view.findViewById(R.id.cardview_breeds).setOnClickListener(v->{
//            startActivity(new Intent(getActivity(), BreedsActivity.class));
//        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_adoption, container, false);
    }

}

