package com.example.redeye;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Chatfragment extends Fragment {

    public static Chatfragment newInstance()
    {
        Chatfragment fragment=new Chatfragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_chat,container,false);
       return view;
    }
}
