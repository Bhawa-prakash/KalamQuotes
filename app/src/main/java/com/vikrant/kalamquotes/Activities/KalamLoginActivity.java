package com.vikrant.kalamquotes.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.vikrant.kalamquotes.R;

public class KalamLoginActivity extends AppCompatActivity {
    private EditText editGmail,editPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalam_login);
        editGmail = findViewById(R.id.Email);
        editPassword = findViewById(R.id.Password);

        btnLogin = findViewById(R.id.button);


        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                boolean check = true;
                String gmail = editGmail.getText().toString();
                String pass = editPassword.getText().toString();


                if (gmail.isEmpty()) {
                    editGmail.setError("field is empty");
                    check=false;

                }
                if ( pass.isEmpty()) {
                    editPassword.setError("field is empty");
                    check=false;

                }


                if (check == true) {
                    Toast.makeText(KalamLoginActivity.this, "login succesfully", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(KalamLoginActivity.this, KalamNotificationActivity.class);


                    intent.putExtra("GMAIL",gmail);
                    intent.putExtra("PASSWORD",pass);
                    startActivity(intent);
                } else

                {
                    Toast.makeText(KalamLoginActivity .this, "login failed", Toast.LENGTH_SHORT).show();
                }

            }
        });






    }
}


