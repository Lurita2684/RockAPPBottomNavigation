package com.example.rockapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class VIdeoUrlFragment extends Fragment {


    public VIdeoUrlFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video_url, container, false);
        String playVideo = "https://www.youtube.com/watch?v=xiK2JlBpzvI";
        WebView videoPlay = view.findViewById(R.id.videoUrl);
        videoPlay.setWebViewClient(new WebViewClient());
        WebSettings webSettings = videoPlay.getSettings();
       webSettings.setJavaScriptEnabled(true);

        videoPlay.loadUrl(playVideo);

        return  view;
    }

}
