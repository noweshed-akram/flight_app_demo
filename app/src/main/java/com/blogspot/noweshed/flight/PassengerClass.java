package com.blogspot.noweshed.flight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PassengerClass extends AppCompatActivity {

    int adults = 0, children = 0, infants = 0, total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_class);

        //image button
        ImageButton backBtn = findViewById(R.id.passengerBacBtnkId);
        ImageButton addBtn1 = findViewById(R.id.addbtn1);
        ImageButton addBtn2 = findViewById(R.id.addbtn2);
        ImageButton addBtn3 = findViewById(R.id.addbtn3);
        ImageButton removeBtn1 = findViewById(R.id.removebtn1);
        ImageButton removeBtn2 = findViewById(R.id.removebtn2);
        ImageButton removeBtn3 = findViewById(R.id.removebtn3);

        //textview
        final TextView adultPassenger = findViewById(R.id.pNumberText1);
        final TextView childPassenger = findViewById(R.id.pNumberText2);
        final TextView infantPassenger = findViewById(R.id.pNumberText3);


        Button doneBtn = findViewById(R.id.passengerDoneBtnId);

        //radio group
        RadioButton eRadioBtn = findViewById(R.id.eClassRadioBtn);
        RadioButton bRadioBtn = findViewById(R.id.bClassRadioBtn);
        RadioButton fRadioBtn = findViewById(R.id.fClassRadioBtn);
        RadioGroup radioGroup = findViewById(R.id.radiogroupId);

        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioGroup = findViewById(selectedId);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(PassengerClass.this, MainActivity.class);
                startActivity(Main);
                finish();
            }
        });

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(PassengerClass.this, MainActivity.class);
                startActivity(Main);
                finish();
            }
        });


        // adults passenger
        addBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (adults < 9) {
                    adults++;
                    adultPassenger.setText("" + adults);
                    total++;
                    totalPassenger(total);
                }
            }
        });
        removeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (adults > 0) {
                    adults--;
                    adultPassenger.setText("" + adults);
                    total--;
                    totalPassenger(total);
                }
            }
        });

        // children passenger
        addBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (children < 9) {
                    children++;
                    childPassenger.setText("" + children);
                    total++;
                    totalPassenger(total);
                }
            }
        });
        removeBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (children > 0) {
                    children--;
                    childPassenger.setText("" + children);
                    total--;
                    totalPassenger(total);
                }
            }
        });


        // infants passenger
        addBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infants < 9) {
                    infants++;
                    infantPassenger.setText("" + infants);
                    total++;
                    totalPassenger(total);
                }
            }
        });
        removeBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infants > 0) {
                    infants--;
                    infantPassenger.setText("" + infants);
                    total--;
                    totalPassenger(total);
                }
            }
        });
    }

    private void totalPassenger(int totalcount) {
        Toast.makeText(PassengerClass.this, totalcount +" Passenger", Toast.LENGTH_LONG).show();
    }
}
