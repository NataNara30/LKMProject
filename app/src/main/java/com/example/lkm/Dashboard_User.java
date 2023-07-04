package com.example.lkm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dashboard_User extends AppCompatActivity {

    ImageView ButtonUser1;
    ImageView ButtonUser2;
    ImageView ButtonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_user);
        ButtonUser1 = findViewById(R.id.imageViewPengajuan);
        ButtonUser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(Dashboard_User.this, Form_Pengajuan_User.class);
                startActivity(open);
            }
        });
        ButtonUser2 = findViewById(R.id.imageViewriwayat);
        ButtonUser2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(Dashboard_User.this, Daftar_Riwayat_User.class);
                startActivity(open);
            }
        });
        ButtonInfo = findViewById(R.id.imageView13);
        ButtonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(Dashboard_User.this, About.class);
                startActivity(open);
            }
        });
    }
}
