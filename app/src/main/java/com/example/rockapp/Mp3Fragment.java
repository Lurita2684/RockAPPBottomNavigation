package com.example.rockapp;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mp3Fragment extends Fragment {

    private MediaPlayer mplayer;

    public Mp3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mp3, container, false);

        mplayer = MediaPlayer.create(getActivity(), R.raw.guitarra);
        mplayer.start();

        return view;
    }

}
