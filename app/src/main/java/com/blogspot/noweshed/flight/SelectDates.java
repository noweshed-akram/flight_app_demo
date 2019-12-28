package com.blogspot.noweshed.flight;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.archit.calendardaterangepicker.customviews.DateRangeCalendarView;

import java.util.Calendar;

public class SelectDates extends AppCompatActivity {

    private ImageButton backBtn;
    private Button doneBtn;

    private DateRangeCalendarView calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_dates);

        backBtn = findViewById(R.id.dateBackBtnId);
        doneBtn = findViewById(R.id.dateDoneBtnId);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(SelectDates.this, MainActivity.class);
                startActivity(Main);
                finish();
            }
        });

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(SelectDates.this, MainActivity.class);
                startActivity(Main);
                finish();
            }
        });


        //calender event

        calendar = findViewById(R.id.calendar);

        calendar.setCalendarListener(new DateRangeCalendarView.CalendarListener() {
            @Override
            public void onFirstDateSelected(Calendar startDate) {
                //Toast.makeText(SelectDates.this, "Start Date: " + startDate.getTime().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDateRangeSelected(Calendar startDate, Calendar endDate) {
                //Toast.makeText(SelectDates.this, "Start Date: " + startDate.getTime().toString() + " End date: " + endDate.getTime().toString(), Toast.LENGTH_SHORT).show();
            }

        });

        Calendar now = Calendar.getInstance();
        now.add(Calendar.MONTH, -1);
        Calendar later = (Calendar) now.clone();
        later.add(Calendar.MONTH, 20);

        calendar.setVisibleMonthRange(now, later);

        Calendar startSelectionDate = Calendar.getInstance();
        startSelectionDate.add(Calendar.MONTH, 0);
        Calendar endSelectionDate = (Calendar) startSelectionDate.clone();
        endSelectionDate.add(Calendar.DATE, 0);

        calendar.setSelectedDateRange(startSelectionDate, endSelectionDate);

        Calendar current = Calendar.getInstance();
        calendar.setCurrentMonth(current);

    }
}
