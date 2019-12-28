package com.blogspot.noweshed.flight;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MultiCityFragment extends Fragment {

    private int keepStatus = 0;

    public MultiCityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mRootView = inflater.inflate(R.layout.fragment_multi_city, container, false);
        Button searchBtn = mRootView.findViewById(R.id.mCitySearchId);
        Button addBtn = mRootView.findViewById(R.id.addBtnId);
        Button removebtn = mRootView.findViewById(R.id.removeBtnId);
        CardView classCard = mRootView.findViewById(R.id.mCityClassCard);
        TextView className = mRootView.findViewById(R.id.mCityClassText);
        TextView passengerNumber = mRootView.findViewById(R.id.mCityPassengerText);

        final RelativeLayout Layout1 = mRootView.findViewById(R.id.rellay1);
        final RelativeLayout Layout2 = mRootView.findViewById(R.id.rellay2);

        classCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pclass = new Intent(getActivity(), PassengerClass.class);
                startActivity(Pclass);
                getActivity().finish();
            }
        });


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (keepStatus == 0) {
                    keepStatus++;
                    Layout1.setVisibility(View.VISIBLE);
                } else if (keepStatus == 1) {
                    Layout2.setVisibility(View.VISIBLE);
                    Toast.makeText(getActivity(), "You have Selected Maximum Travel", Toast.LENGTH_LONG).show();
                }
            }
        });

        removebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (keepStatus == 1) {
                    keepStatus--;
                    Layout2.setVisibility(View.GONE);
                } else if (keepStatus == 0) {
                    Layout1.setVisibility(View.GONE);
                }
            }
        });

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchFlight = new Intent(getActivity(), FindCities.class);
                startActivity(SearchFlight);
                getActivity().finish();
            }
        });

        return mRootView;
    }

}
