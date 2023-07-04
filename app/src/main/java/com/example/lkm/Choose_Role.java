package com.example.lkm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Choose_Role extends AppCompatActivity {
 ImageView imgUser;
 ImageView imgAdmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_role);
        imgUser = findViewById(R.id.imUser);
        imgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(Choose_Role.this, Dashboard_User.class);
                startActivity(open);            }
        });
        imgAdmin = findViewById(R.id.imAdmin);
        imgAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(Choose_Role.this, Login_Admin.class);
                startActivity(open);
            }
        });
    }
}