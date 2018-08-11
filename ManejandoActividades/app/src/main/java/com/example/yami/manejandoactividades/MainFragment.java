package com.example.yami.manejandoactividades;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//fragment soport v4 es mas compatible
public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView;
        rootView=inflater.inflate(R.layout.activity_load,container,false);

        return rootView;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
