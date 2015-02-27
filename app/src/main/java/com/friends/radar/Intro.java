package com.friends.radar;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple subclass. It stores the introductory slides.
 */
public class Intro extends Fragment {

    private int pos;

    public Intro() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.intro, container, false);
        return rootView;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView img = (ImageView) getView().findViewById(R.id.imageViewIntro);
        Bundle bundle = this.getArguments();
        int pos = bundle.getInt("pos", 0);
        if (pos == 0) {
            img.setImageResource(R.drawable.intro_1);
        } else if(pos == 1)
            img.setImageResource(R.drawable.intro_2);
    }
}
