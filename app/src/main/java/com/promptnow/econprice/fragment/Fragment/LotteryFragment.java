package com.promptnow.econprice.fragment.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.promptnow.econprice.R;
import com.promptnow.econprice.view.View_date;

import static com.promptnow.econprice.R.id.tv_date;

/**
 * Created by Whankung on 7/9/2559.
 */

public class LotteryFragment extends Fragment implements View_date.onSubmitAlertDialogListener {
    private View rootView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.checklottery, container, false);
       setDate();

        return rootView;
    }

    private void setDate() {
        TextView tv_date = (TextView) rootView.findViewById(R.id.tv_date_show);
tv_date.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        View_date alertDialog = new View_date(getResources().getString(R.string.str_msgdate));
        alertDialog.mListener = LotteryFragment.this;
        alertDialog.show(getActivity().getFragmentManager(), "");
    }
});
    }





    @Override
    public void setOnSubmitAlertDialogListener() {

    }
}



