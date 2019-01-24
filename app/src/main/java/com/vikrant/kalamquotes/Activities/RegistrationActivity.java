package com.vikrant.kalamquotes.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.vikrant.kalamquotes.R;

public class RegistrationActivity extends AppCompatActivity {

    private Button btnLogin;
    private TextView showText,showText1,showText2,showText3;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        showText = findViewById(R.id.name);
        showText1 = findViewById(R.id.phone);
        showText2 = findViewById(R.id.address);
        showText3 = findViewById(R.id.email);


        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("USERNAME");
        String phone = bundle.getString("ADD");
        String address = bundle.getString("EMAIL");
        String email = bundle.getString("PHONENO");

        showText.setText(name);
        showText1.setText(phone);
        showText2.setText(address);
        showText3.setText(email);



        btnLogin = findViewById(R.id.button2);


        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                Intent intent = new Intent(RegistrationActivity.this, KalamLoginActivity.class);


                startActivity(intent);




            }
        });






    }
}


