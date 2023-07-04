package com.example.lkm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dashboard_Admin extends AppCompatActivity {

    ImageView ButtonAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_admin);
        ButtonAdmin = findViewById(R.id.imgPengaduan);
        ButtonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(Dashboard_Admin.this, Daftar_Pengajuan_Admin.class);
                startActivity(open);            }
        });
    }
}