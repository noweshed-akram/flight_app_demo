package com.blogspot.noweshed.flight;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RoundTripFragment extends Fragment {

    public RoundTripFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mMainView = inflater.inflate(R.layout.fragment_round_trip, container, false);
        Button searchBtn = mMainView.findViewById(R.id.rTripSearchBtnId);
        CardView passengerClassCard = mMainView.findViewById(R.id.RtripClassId);
        CardView departureCard = mMainView.findViewById(R.id.departureCardId);
        CardView returnCard = mMainView.findViewById(R.id.returnDateCardId);
        CardView citiesCard = mMainView.findViewById(R.id.roundTripCitiesCard);

        TextView departureDate = mMainView.findViewById(R.id.departureDateText);
        TextView returnDate = mMainView.findViewById(R.id.returnDateText);
        TextView passengerClass = mMainView.findViewById(R.id.rTripClassText);
        TextView passengerNum = mMainView.findViewById(R.id.rTripPassengerText);

        citiesCard.setOnClickListener(new View.OnClickListener() {
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

        passengerClassCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pclass = new Intent(getActivity(), PassengerClass.class);
                startActivity(Pclass);
                getActivity().finish();
            }
        });

        departureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DatePick = new Intent(getActivity(), SelectDates.class);
                startActivity(DatePick);
                getActivity().finish();
            }
        });

        returnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DatePick = new Intent(getActivity(), SelectDates.class);
                startActivity(DatePick);
                getActivity().finish();
            }
        });


        return mMainView;
    }

}
