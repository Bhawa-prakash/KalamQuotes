package com.vikrant.kalamquotes.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.vikrant.kalamquotes.R;

public class NotificationActivity extends AppCompatActivity {

     private Button btnStartNotification,btnChangeNotification,btnStopNotification,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        btnStartNotification = findViewById(R.id.button1);
        btnStartNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mClockIntent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
                mClockIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(mClockIntent);


            }
        });

        btnChangeNotification = findViewById(R.id.button2);
        btnChangeNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mClockIntent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
                mClockIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(mClockIntent);

            }
        });

        btnStopNotification = findViewById(R.id.button3);

        btnBack = findViewById(R.id.button4);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotificationActivity.this, KalamNotificationActivity.class);
                startActivity(intent);
            }
        });



    }
}
