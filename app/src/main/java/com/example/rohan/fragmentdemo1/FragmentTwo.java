package com.example.rohan.fragmentdemo1;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rohan on 9/21/2018.
 */

public class FragmentTwo extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.fragmenttwo, container);

        if(retView!=null) {
            TextView fragmentRightTextView = (TextView)retView.findViewById(R.id.fragmentRightTextView);
            fragmentRightTextView.setText("This is the default right fragment.");
        }
        return retView;
    }
}