package com.example.rohan.fragmentdemo1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rohan on 9/21/2018.
 */

public class FragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.fragmentone, container);

        final FragmentActivity fragmentBelongActivity = (FragmentActivity) getActivity();

        if(retView!=null)
        {
            Button androidButton = (Button)retView.findViewById(R.id.fragmentLeftButtonAndroid);
            androidButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    FragmentManager fragmentManager = fragmentBelongActivity.getSupportFragmentManager();
                    android.support.v4.app.Fragment rightFragment = fragmentManager.findFragmentById(R.id.fragmentbuttom);
                    final TextView rightFragmentTextView = (TextView)rightFragment.getView().findViewById(R.id.fragmentRightTextView);
                    rightFragmentTextView.setText("You click Android button.");
                }
            });
        }

        return retView;
    }
}

