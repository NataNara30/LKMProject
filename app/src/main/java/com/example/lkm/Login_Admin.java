package com.example.lkm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Admin extends AppCompatActivity {

    EditText etusername, etpassword;

    Button buttologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        etusername= findViewById(R.id.etusername);
        etpassword= findViewById(R.id.etpassword);
        buttologin= findViewById(R.id.buttonlogin);

        buttologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email= etusername.getText().toString().trim();
                String password= etpassword.getText().toString().trim();

                if (email.isEmpty()){
                    etusername.setError("Username wajib diisi");
                    return;
                }
                if (password.isEmpty()){
                    etpassword.setError("Password wajib diisi");
                    return;
                }

                Intent open = new Intent(Login_Admin.this, Dashboard_Admin.class);
                startActivity(open);
            }
        });
    }
}