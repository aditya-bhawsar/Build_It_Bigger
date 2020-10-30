package com.aditya.displaylib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayFragment extends Fragment {

    public DisplayFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);

        String joke = getActivity().getIntent().getStringExtra("joke");

        TextView jokeTv = view.findViewById(R.id.joke_tv);
        jokeTv.setText(joke);

        return view;
    }
}
