package com.blogspot.noweshed.flight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnWayFragment extends Fragment {

    private View mMainView;
    private CardView wayClass, wayDate, wayCities;
    private Button searchBtn;
    private TextView selectDate;

    public OnWayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mMainView = inflater.inflate(R.layout.fragment_on_way, container, false);

        wayClass = mMainView.findViewById(R.id.onWayClassId);
        wayCities = mMainView.findViewById(R.id.onWayCitiesCard);

        wayDate = mMainView.findViewById(R.id.onWayDateId);
        searchBtn = mMainView.findViewById(R.id.onWaysrcId);
        selectDate = mMainView.findViewById(R.id.onWayDateText);

        wayClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pclass = new Intent(getActivity(), PassengerClass.class);
                startActivity(Pclass);
                getActivity().finish();
            }
        });

        wayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DatePick = new Intent(getActivity(), SelectDates.class);
                startActivity(DatePick);
                getActivity().finish();
            }
        });

        wayCities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchFlight = new Intent(getActivity(), FindCities.class);
                startActivity(SearchFlight);
                getActivity().finish();
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

        return mMainView;
    }
}
