package com.promptnow.econprice.fragment.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.promptnow.econprice.R;

import java.util.Random;

import static android.R.id.list;

/**
 * Created by Whankung on 7/9/2559.
 */

public class LotteryFragment2 extends Fragment {
    private View rootView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.checklottery_number, container, false);
        setrandom();
        return rootView;
    }

    private void setrandom()
    {
        Random rand = new Random();
        int random = rand.nextInt(999);

        TextView tv = ( TextView) rootView.findViewById(R.id.random) ;
        tv.setText("" + random);


    }

}
